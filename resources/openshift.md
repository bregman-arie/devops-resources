## OpenShift

### Learn OpenShift

Name | Comments
:------ |:--------:
[Learn OpenShift](https://learn.openshift.com) | Interactive way to learn OpenShift

### CheatSheet

* Login: `oc login -u my_user -p my_password`

#### Projects

* Highlevel overview of the project: `oc status`
* Create a new project: `oc new-project my_project`
* List projects: `oc get projects`

#### Accounts

* The username of the user currently logged in: `oc whoami`

* Add to user "user1" the ability to view the project "wonderland": `oc adm policy add-role-to-user view user1 -n wonderland`
* Add a user as admin to the project "wonderland": `oc adm policy add-role-to-user admin some_user -n wonderland`

* Get a list of all context whihc have ever been created: `oc config get-contexts`
* Check what is the current context: `oc whoami --show-context`
* The OpenShift server currently used: `oc whoami --show-server`
* Get the list of all the OpenShift clusters you have ever logged into: `oc config get-clusters`

#### Pods

* List pods: `oc get po`
* List pods with with node info: `oc get po -o wide`

#### Deployments

* List deployments: `oc get deployments`

#### Service Accounts

* List service accounts: `oc get serviceaccounts`

#### Misc

* Login: `oc login --token=<TOKEN> --server=https://<ADDRESS>:<PORT>`
