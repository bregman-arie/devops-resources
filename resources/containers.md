## Containers

### Articles

Name | Comments
:------ |:--------:
[Docker CheatSheet](https://cheatsheet.dennyzhang.com/cheatsheet-docker-a4) |
[Everything you need to know about containers](https://medium.com/faun/everything-you-need-to-know-about-containers-7655badb4307) |
[A container networking overview](https://jvns.ca/blog/2016/12/22/container-networking) |
[My Docker Cheat Sheet](https://medium.com/statuscode/dockercheatsheet-9730ce03630d) |
[Docker Networking Deep Dive](http://100daysofdevops.com/21-days-of-docker-day-19-docker-networking-deep-dive/?fbclid=IwAR19KJWwhZjulbn7JNbBYLFxKFf-x0v25TSc-_bOJ6YieUND4A6UZcBSUhA) |

#### Dockerfile



### Projects

Name | Comments
:------ |:--------:
[awesome-docker](https://github.com/veggiemonk/awesome-docker) | 


#### Cheatsheet

* Stop and remove all containers: `docker container stop $(docker container ls -aq)`
* Run container with bash shell: `docker run -ti ubuntu:latest bash`
* Check how many containers are running: `docker info`
* Cleanup everything: `docker system prune -a -f`

### Tools

Name | Description
:------|:------:
[dive](https://github.com/wagoodman/dive) | "A tool for exploring a docker image, layer content, ..."
[trivy](https://github.com/aquasecurity/trivy) | "A Simple and Comprehensive Vulnerability Scanner for Containers and other Artifacts, Suitable for CI."
