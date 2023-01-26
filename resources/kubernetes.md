## Kubernetes

### Getting started with Kubernetes

Name | Comments
:------ |:--------:
[kubernetes.io](https://kubernetes.io) | Official Kubernetes site by Google
[Kubernetes 101](https://medium.com/google-cloud/kubernetes-101-pods-nodes-containers-and-clusters-c1509e409e16) | Great beginner article on Kubernetes fundamental concepts
[Kubernetes Tutorial for Beginners](https://www.youtube.com/watch?v=X48VuDVv0do&ab_channel=TechWorldwithNana) | Full video of 4 hours on Kubernetes (2020)
[Learning Path: Kubernetes](https://developer.ibm.com/series/kubernetes-learning-path/) | From basic to advanced Kubernetes learning series
[Kubernetes 101 - Concepts and Why It Matters](https://www.magalix.com/blog/kubernetes-101-concepts-and-why-it-matters?fbclid=IwAR10FZlZ9Pw5c94tGRlgsCrVZTa1bSV2mbxEP8p4cXZ5T-k4VXF-3OUKkFo) |
[kubernetes-workshop](https://github.com/eon01/kubernetes-workshop) |
[Kubernetes Deployment Tutorial](https://devopscube.com/kubernetes-deployment-tutorial) |
[Katacoda](https://www.katacoda.com/courses/kubernetes) | Learn Kubernetes using Interactive Browser-Based Scenarios
[Kubernetes Scheduler](https://jvns.ca/blog/2017/07/27/how-does-the-kubernetes-scheduler-work/) | How does the Kubernetes scheduler work?

### Kubernetes - Deep Dive

Name | Comments
:------ |:--------:
[Kubernetes Networking](https://github.com/nleiva/kubernetes-networking-links) | Kubernetes Networking Resources
[Liveness and Readiness Probes](https://www.openshift.com/blog/liveness-and-readiness-probes) |

### Kubernetes - Troubleshooting

Name | Comments
:------ |:--------:
[troubleshoot.sh](https://troubleshoot.sh) | "A kubectl plugin providing diagnostic tools for Kubernetes applications"
[Kubernetes Troubleshooting Visual Guide](https://learnk8s.io/troubleshooting-deployments) |

### Kubernetes - Security

Name | Comments
:------ |:--------:
[Kubescape](https://github.com/armosec/kubescape) | "Kubescape is the first tool for testing if Kubernetes is deployed securely as defined in Kubernetes Hardening Guidance by NSA and CISA"
[Falco](https://falco.org) | "Falco...is the de facto Kubernetes threat detection engine"

### Kubernetes - Misc

Name | Comments
:------ |:--------:
[confTest](https://www.conftest.dev) | "Conftest is a utility to help you write tests against structured configuration data" (Used in the development phase)
[datree](https://www.datree.io) | "Prevent Kubernetes Misconfigurations From Reaching Production" (Used in development phase)
[gatekeeper](https://github.com/open-policy-agent/gatekeeper) | Used in the production
[telepresence](https://www.telepresence.io) | "FAST, LOCAL DEVELOPMENT FOR KUBERNETES AND OPENSHIFT MICROSERVICES"
[Kubernetes CheatSheet](https://cheatsheet.dennyzhang.com/cheatsheet-kubernetes-A4) |
[OperatiorHub.io](https://www.operatorhub.io) | Kubernetes native applications
[YAML templates](https://cheatsheet.dennyzhang.com/kubernetes-yaml-templates) |
[Kubesort](https://github.com/AATHITH/kubesort) | "kubesort helps you sort the results from kubectl get in an easy way"
[IngressMonitorController](https://github.com/stakater/IngressMonitorController) | "A Kubernetes controller to watch ingresses and create liveness alerts for your apps/microservices"

### Kubernetes - SRE

Name | Comments
:------ |:--------:
[KubeInvaders](https://github.com/lucky-sideburn/KubeInvaders) | "Chaos Engineering Tool for Kubernetes and Openshift"

### Kubernetes - Certificates

Name | Comments
:------ |:--------:
[CKAD-Practice-Questions](https://github.com/bbachi/CKAD-Practice-Questions) | "a consolidated list for CKAD practice questions"
[CKAD Prep Exam Video](https://www.youtube.com/watch?v=TPXwVmvzlV4&ab_channel=TheFrontOpsGuy) | A video of doing a CKAD prep exam (2020)
[CKA Complete Prep Exam ](https://github.com/walidshaari/Kubernetes-Certified-Administrator) | CKA prep exam (2021)
[CKAD Complete Prep Exam ](https://github.com/dgkanatsios/CKAD-exercises) | CKAD prep exam (2021)
[CKS Complete Prep Exam ](https://github.com/walidshaari/Certified-Kubernetes-Security-Specialist) | CKA prep exam (2021)

### Kubernetes - Labs

Name | Comments
:------ |:--------:
[Building a Kubernetes 1.23 Cluster with Kubeadm](https://github.com/croguerrero/CKA-Labs/blob/main/resources/KC.md) | "Labs CKA - Build a Kubernetes cluster 1.23"

### Best Practices

#### Security Best Practices

* Secure inter-service communication (one way is to use Istio to provide mutual TLS)
* Isolate different resources into separate namespaces based on some logical groups
* Use supported container runtime (if you use Docker then drop it because it's deprecated. You might want to CRI-O as an engine and podman for CLI)
* Test properly changes to the cluster (e.g. consider using Datree to prevent kubernetes misconfigurations)
* Limit who can do what (by using for example OPA gatekeeper) in the cluster
* Use NetworkPolicy to apply network security
* Consider using tools (e.g. Falco) for monitoring threats

### CheatSheet

#### Minikube

* Minikube version: `minikube version`
* Start cluster: `minikube start`
* Delete cluster: `minikube delete`

#### Common Kubectl Operations

* Create objects defined in a YAML: kubectl apply -f rs.yaml

#### Service Accounts

* List service accounts: `kubectl get serviceaccounts`

### Cluster

* Cluster version: `kubectl version`
* Cluster information: `kubectl cluster-info`
* List nodes: `kubectl get nodes`

### Images

* List all containers images from all namespaces:

```
kubectl get pods --all-namespaces -o jsonpath="{.items[*].spec.containers[*].image}" |\
tr -s '[[:space:]]' '\n' |\
sort |\
uniq -c
```

### Pods

* List of Pods in current namespace: `kubectl get po`
* List of Pods in all amespaces: `kubectl get po --all-namespaces`
* Get containers names: `kubectl get po <POD_NAME> -o jsonpath="{.spec.containers[*].name}"`

* Create a Pod from file: `kubectl create -f pod_definition.yaml`
* Delete a Pod using a YAML definition: `kubectl delete -f pod_definition.yaml`
* Delete a Pod using the Pod name: `kubectl delete <POD_NAME>`
* Delete a Pod instantly: `kubectl delete <POD_NAME> --grace-period=0 --force`

* Execute commands inside a container: `kubectl exec -it -c <CONTAINER_NAME> <POD_NAME> ls`

* Display logs of a Pod: `kubectl logs <POD_NAME>`
* Display logs of a specific container in a Pod: `kubectl logs <POD_NAME> -c <CONTAINER_NAME>`

* Get Pod name based on specific labels

```
POD_NAME=$(kubectl get pod \
--no-headers \
-o=custom-columns=NAME:.metadata.name \
-l type=api,service=some-service \
| tail -1)
```

* Get pods sorted by time creation: `kubectl get pods --sort-by='{.metadata.creationTimestamp}'`
* Run long/endless running container: `kubectl run test --image ubuntu -- sleep 2000000000`
* Get a shell access to a container: `kubectl exec --stdin --tty some-shell -- /bin/bash`

### User

* Creating a new user

```
openssl genrsa -out user.key 2048 # create key
openssl req key user.key user.csr -subj "/CN=user /O=sgroup" # create csr
openssl x509 -req -in user.csr -CA ca.crt -CAkey ca.key -CAcreateseral -out user.crt -days 365
kubectl config set-credentials myuser --client-certificates=$PWD/user.crt --client-key=$PWD/user.key
kubectl config set-context myuser-context --cluster=k8s-cluster --user=user
```

### Service

* Expose a ReplicaSet: `kubectl expose rs REPLICASET_NAME --name=SERVICE_NAME --target-port=PORT --type=NodePort/SOME_OTHER_SERVICE_TYPE`

### Deployment

* Create and delete a deployment in one step:
```
$ kubectl create deployment demo --image=cloudnatived/demo:hello

$ kubectl get pods --selector app=demo

$ kubectl delete pods --selector app=demo

$ kubectl delete all --selector app=demo
```
### Aliases 

* Use kubectl aliases to speed up and reduce typo errors, practice these alaises early at your work and study for the exam. some example aliases:
```
alias k='kubectl'
alias kg='kubectl get'
alias kgpo='kubectl get pod'
alias kcpyd='kubectl create pod -o yaml --dry-run=client'
alias ksysgpo='kubectl --namespace=kube-system get pod'

alias kd='kubectl delete'
alias kdf='kubectl delete -f'
## for quick deletes you can add --force --grace-period=0  **Not sure if it is a good idea if you are in a production cluster**
alias krmgf='kubectl delete --grace-period 0 --force'
alias kgsvcoyaml='kubectl get service -o=yaml'
alias kgsvcwn='watch kubectl get service --namespace'
alias kgsvcslwn='watch kubectl get service --show-labels --namespace'

#example usage of aliases
krmgf nginx-8jk71    # kill pod nginx-8jk71 using grace period 0 and force

```

### Monitoring

* Install metrics-server using Minikube: `minikube addons enable metrics-server`

### Secrets

* Install Bitnami Sealed secrets controller

```
helm repo add sealed-secrets https://bitnami-labs.github.io/sealed-secrets
helm repo update
helm install sealed-secrets-controller sealed-secrets/sealed-secrets
```

* sealed-secrets binary: `https://github.com/bitnami-labs/sealed-secrets/releases`

* encrypt secret in yaml or json format: `kubeseal -n my-namespace <.db-creds.yml> db-creds.json`
* apply secret on the cluser: `kubectl apply -f db-creds.json -n my-namespace`

### Kustomize

* Generate customized YAML file(s): `kustomize build name_of_application`
* Apply generated customized YAML file(s) to the cluster: `kustomize build name_of_application`
