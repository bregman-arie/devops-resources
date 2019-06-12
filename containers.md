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
