## Docker

### Learn

Name | Comments
:------ |:--------:
[Play with Docker](https://labs.play-with-docker.com) | "A simple, interactive and fun playground to learn Docker"

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
[awesome-docker](https://github.com/veggiemonk/awesome-docker) | 

### Cheatsheet

* Stop and remove all containers: `docker container stop $(docker container ls -aq)`
* Check how many containers are running: `docker info`
* Check the docker images on your system: `docker images`
* Cleanup everything: `docker system prune -a -f`

#### Managing Containers

* Launch a container and attach to it: `docker container run -it ubuntu:latest /bin/bash`
* Attaching to running container: `docker container exec -it <name> bash`
* List running containers: `docker container ls`
* List containers (including stopped): `docker container ls -a`
* Stop a container: `docker container stop <name>`
* Remove a container: `docker container rm <name>`

#### Images

* List images: `docker image ls`
* Pull image: `docker image pull <name>:<tag>`
* List only images tagged as "latest": `docker image ls --filter=reference="*:latest"`
* List dangling images: `docker image ls --filter dangling=true`
* Which default registry is used: `docker info`
* Search all repositories that contain the string 'yay': `docker search yay`
* Search only for official repositories: `docker search <name> --filter "is-official=true"`
* Build an image: `docker image build -t <name>:<tag> .`
* List images with the following data: name, tag and size: `docker image ls --format "{{.Repository}}: {{.Tag}}: {{.Size}}"`
