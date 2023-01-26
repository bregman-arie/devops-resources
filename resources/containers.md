## Containers

### Articles

Name | Comments
:------ |:--------:
[Docker CheatSheet](https://cheatsheet.dennyzhang.com/cheatsheet-docker-a4) |
[Everything you need to know about containers](https://medium.com/faun/everything-you-need-to-know-about-containers-7655badb4307) |
[A container networking overview](https://jvns.ca/blog/2016/12/22/container-networking) |
[My Docker Cheat Sheet](https://medium.com/statuscode/dockercheatsheet-9730ce03630d) |
[Docker Networking Deep Dive](http://100daysofdevops.com/21-days-of-docker-day-19-docker-networking-deep-dive/?fbclid=IwAR19KJWwhZjulbn7JNbBYLFxKFf-x0v25TSc-_bOJ6YieUND4A6UZcBSUhA) |

### Projects

Name | Comments
:------ |:--------:
[container-diff](https://github.com/GoogleContainerTools/container-diff) | "container-diff is a tool for analyzing and comparing container images"
[awesome-docker](https://github.com/veggiemonk/awesome-docker) | 

### Books


Name | Comments
:------ |:--------:
Docker Deep Dive |

### Tools

Name | Description
:------|:------:
[dive](https://github.com/wagoodman/dive) | "A tool for exploring a docker image, layer content, ..."
[trivy](https://github.com/aquasecurity/trivy) | "A Simple and Comprehensive Vulnerability Scanner for Containers and other Artifacts, Suitable for CI."

### Production Best Practices

* Secured communication between daemon and clients using TLS

### Best Practices

#### Dockerfile Best Practcies

* Include only the packages you are going to use. Nothing else.
* Specify a tag in FROM instruction. Not using a tag means you'll always pull the latest, which changes over time and might result in unexpected result.
* Do not use environment variables to share secrets
* Use images from official repositories
* Keep images small! - you want them only to include what is required for the application to run successfully. Nothing else.
* If are using the apt package manager, you might use 'no-install-recommends' with `apt-get install` to install only main dependencies (instead of suggested, recommended packages)

#### Security Best Practcies

  * Install only the necessary packages in the container
  * Don't run containers as root when possible
  * Don't mount the Docker daemon unix socket into any of the containers
  * Set volumes and container's filesystem to read only
  * DO NOT run containers with `--privilged` flag

### Cheatsheet

* Stop and remove all containers: `podman container stop $(docker container ls -aq)`
* Run container with bash shell: `podman run -ti ubuntu:latest /bin/bash`
* Check how many containers are running: `podman info`
* Cleanup everything: `podman system prune -a -f`

#### Images

* List images: `podman image ls`
* Pull latest ubuntu image: `podman image pull ubuntu:latest`
* Remove image from the host: `podman rmi IMAGE`
* Remove all images: `podman rmi -a` or the more extreme version of it: `podman rmi $(podman images -qa) -f`
* Login to Red Hat registry: `podman login registry.redhat.io`
* List all available tags for a given image using the CLI: `podman search --list-tags IMAGE_NAME`
* List all available tags for a given image using an API request: `curl -Ls https://SERVER/v2/.../tags/list | python -m json.tool`
* Create an archive from the image: `podman save -o some_image.tar IMAGE`
* Load image from the archive: `podman load -i some_image.tar`
* List added/modified/deleted files on container's image filesystem: `podman diff IMAGE_NAME`
* List of mounted files for a running container: `podman inspect -f "{{range .Mounts}}{{println .Destination}}{{end}}" CONTAINER_NAME/ID`
* Commit changes to another image: `podman commit EXISTING_IMAGE NEW_IMAGE`

#### Registries

* List all repositories in a registry: `curl -Ls https://SERVER/v2/_catalog?n=`
* List all repositories in a registry and convert to JSON: `curl -Ls https://SERVER/v2/_catalog?n=3 > | python -m json.tool`

#### Security

* Secure communication between client and server:

```
# On CA node
openssl genrsa -aes256 -out ca-k.pem 4096
openssl req -new -x509 -days 730 -key ca-k.pem -sha256 -out ca.pem
openssl genrsa -out daemon-key.pem 4096
openssl req -subj "/CN=daemon.host.address" -sha256 -new -key daemon-key.pem -out daemon.csr
cat << EOF >> file.conf
subjectAltName = DNS:daemon.host.address,IP:X.X.X.X
extendedKeyUsage = serverAuth
EOF
openssl x509 -req -days 730 -sha256 -in daemon.csr -CA ca.pem -CAkey ca-k.pem -CAcreateserial -out daemon-cert.pem -extfile file.conf
openssl genrsa -out client-key.pem 4096
openssl req -subj '/CN=client.address' -new -key client-key.pem -out client.csr
echo "extendedKeyUsage = clientAuth" > file.conf
openssl x509 -req -days 730 -sha256 -in client.csr -CA ca.pem -CAkey ca-k.pem -CAcreateserial -out client-cert.pem -extfile file.conf
chmod 0400 ca-k.pem client-key.pem daemon-key.pem && chmod -v 0444 ca.pem client-cert.pem daemon-cert.pem
# On daemon host put the keys ca.pem, daemon-cert.pem and daemon-key.pem in ~/.docker
# On client host put the keys ca.pem, client-cert.pem and client-key.pem in ~/.docker
```

* Enable TLS

```
# Put it in /etc/docker/daemon.json
{
"hosts": ["tcp://node3:2376"],
"tls": true,
"tlsverify": true,
"tlscacert": "/home/ubuntu/.docker/ca.pem",
"tlscert": "/home/ubuntu/.docker/cert.pem",
"tlskey": "/home/ubuntu/.docker/key.pem"
}
```

#### Cleanup

* Remove everything: `podman system reset`
