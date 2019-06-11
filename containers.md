## Docker - Resources

Name | Description
:------|:------:
[Docker Compose](https://docs.docker.com/compose/overview) | Multi-container applications

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


## Interview Questions - Docker

* What is Dockerfile?
* What is docker compose and how you use it?

    A tool for defining multi-container Docker applications.

* I would like to build a multi-container application which consists of Flask and Redit. How would you do it?

## Interview Questions - Nomad

* What is a nomad cluster? What gossip protocol used for?
