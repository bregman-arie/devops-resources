## Grafana

### Random

* Visualize latency for API endpoints: 

```
1. Use https://github.com/prometheus/blackbox_exporter to point API endpoints
2. Scrape exporter with Prometheus
3. Graph from Grafana
```
## Setting up Grafana for Prometheus on Kuberentes
* Grafana is a Visualisation tool that we most commonly use with prometheus Now many of you might have struggled while setting up grafana and Prometheus. To Solve this Problem I have created this deployment file that you can Integrate with Prometheus. If you Don't know how to Setup Prometheus for monitoring in Kuberentes. You can visit prometheus section in this repository, There you will find all the files needed to setup prometheus.

To access Prometheus you can click on this. [Prometheus](../prometheus.md)

```bash
apiVersion: apps/v1
kind: Deployment
metadata:
  name: grafana
  namespace: graf  #<-- Here you can add your own namespace.
spec:
  replicas: 1
  selector:
    matchLabels:
      app: grafana
  template:
    metadata:
      name: grafana
      labels:
        app: grafana
    spec:
      containers:
      - name: grafana
        image: grafana/grafana:latest
        ports:
        - name: grafana
          containerPort: 3000
```       
I have included this files, You can access them here [Deployment.yml](./deployment.yml) 


Note:-
 After this deployment file, You will need to setup dashboard on your own. 
Also since this is running inside container, so to access grafana dashboard you will
either have to port-forward or else you can make your own service file of type NodePort.
for a example, I will add a service file here that you can reuse with little changes.
Make sure you create your own namespace and edit your own namespace in this file or create a namespace with this name.

```bash
apiVersion: v1
kind: Service
metadata:
  name: grafana
  namespace: graf #--> write your own namespace make sure all files are in same namespace.
spec:
  selector: 
    app: grafana
  type: NodePort  
  ports:
    - port: 3000
      targetPort: 3000
      nodePort: 32000
```
I have included this files, You can access them here [Service.yml](./service.yml) 

Note: Make sure you have the basic knowledge of kuberentes. By default, the range of the service NodePorts is 30000-32768. So it means you can choose any range of your own.
When you will run this file, there is no need to port-forward and you can access this on port 
i.e 
``` <your-ip>:nodePort
```
This was how you can make use of grafana.