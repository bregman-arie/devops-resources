# ArgoCD

## Commands

* login: `argocd login <ADDRESS>`
* version: `argocd version`

### Apps

* create an application:

```
argocd app create {APP NAME} \
--project {PROJECT} \
--repo {GIT REPO} \--path {APP FOLDER} \
--dest-namespace {NAMESPACE} \
--dest-server {SERVER URL}
```
* app list: `argocd app list`
* app detailed info: `argocd app get <APP NAME>`

* sync app: `argocd app sync <APP NAME>`
* app history: `argocd app history <APP NAME>`
* delete app: `argocd app delete <APP NAME>`

* Add cluster: `argocd cluster add CLUSTER`
* List clusters: `argocd cluster list`
* Remove cluster: `argocd cluster rm CLUSTER
