## CI/CD

### Best Practices

* Commit and test often.
* Testing/Staging environment should be a clone of production environment.
* Clean up your environments (e.g. your CI/CD pipelines may create a lot of resources. They should also take care of cleaning up everything they create)
* The CI/CD pipelines should provide the same results when executed locally or remotely
* Treat CI/CD as another application in your organization. Not as a glue code.
* On demand environments instead of pre-allocated resources for CI/CD purposes
* Stages/Steps/Tasks of pipelines should be shared between applications or microservices (don't re-invent common tasks like "cloning a project")
* The CI/CD pipelines should have short execution time in order to provide a short feedback loop
