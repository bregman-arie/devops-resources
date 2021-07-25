## OpenShift

### Learn OpenShift

Name | Comments
:------ |:--------:
[Learn OpenShift](https://learn.openshift.com) | Interactive way to learn OpenShift

### CheatSheet

* Login: `oc login -u my_user -p my_password`

#### Project

* Highlevel overview of the project: `oc status`
* Create a new project: `oc new-project my_project`
* List projects: `oc get projects`

#### User

* The username of the user currently logged in: `oc whoami`
* The OpenShift server currently used: `oc whoami --show-server`

#### Pods

* List pods: `oc get po`
* List pods with with node info: `oc get po -o wide`

#### Deployments

* List deployments: `oc get deployments`

#### Service Accounts

* List service accounts: `oc get serviceaccounts`

#### Misc

* Login: `oc login --token=<TOKEN> --server=https://<ADDRESS>:<PORT>`
