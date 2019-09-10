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

## Docker - Cheat sheet

* Run container with bash shell

```
docker run -ti ubuntu:latest bash
```

* Check how many containers are running

```
docker info
```

## Docker - Interview Questions

* What happens when you run `docker run hello-world`?
* How do you run a container?

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
