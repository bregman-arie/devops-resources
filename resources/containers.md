## Tools

Name | Description
:------|:------:
[dive](https://github.com/wagoodman/dive) | "A tool for exploring a docker image, layer content, ..."
[trivy](https://github.com/aquasecurity/trivy) | "A Simple and Comprehensive Vulnerability Scanner for Containers and other Artifacts, Suitable for CI."

## Docker - Resources

Name | Description
:------|:------:
[Docker Compose](https://docs.docker.com/compose/overview) | Multi-container applications

## Docker - Checklist

- [ ] **Images**
  - [ ] tag
  - [ ] `docker images` command

- [ ] **Running containers**
  - [ ] `docker run` command
  - [ ] `-ti` arguments for interactive terminal

- [ ] **List containers**
  - [ ] `docker ps` command
  - [ ] `-a` argument for stopped
  - [ ] `-l` argument for last stopped

- [ ] **Commit changes**
  - [ ] `docker commit` command
  - [ ] `docker tag` command

## Nomad - Resources

Name | Description
:------|:------:
[Official Introduction](https://www.nomadproject.io/intro/index.html) | Great place for beginners to start learning about Nomad

## Nomad - Commands

Run Nomad agent in development mode (don't use in production):

     sudo nomad agent -dev

See registered Nomad cluster nodes:

     nomad node status

View members of the gossip ring (used to connect all instances together):

     nomad server members
