## Prometheus

### Exporters

Name | Comments
:------|:------:
[Blackbox Exporter](https://github.com/prometheus/blackbox_exporter) |  "blackbox probing of endpoints over HTTP, HTTPS, DNS, TCP and ICMP"
Elastic_Search Exporter | Prometheus exporter for various metrics about ElasticSearch, written in Go. 

**How to Setup Prometheus in Kubernetes cluster for Elastic Search ?**

To Setup Prometheus in Kubernetes so that we can monitor third party applications like elastic search , we will make use of elastic search exporter which was written in go language and it is now maintained by Prometheus Community. Elastic search exporter will run as a side car container alongside Elastic Search.

now to run as side car container we will just use its image and specify the port:

```
 containers:
      - name: exporter
        image: justwatch/elasticsearch_exporter:1.0.2
        ports:
        - containerPort: 9108
        args: ['-es.uri=http://localhost:9200']
 ```       

Now we will also create a config file for Prometheus:

```
apiVersion: v1
data:
  prometheus.yml: |-
    global:
      scrape_interval: 15s 
      evaluation_interval: 15s 
    scrape_configs:
      - job_name: "prometheus"
        static_configs:
          - targets: ["localhost:9090"]
      - job_name: "exporter"
        static_configs:
          - targets: ["elasticsearch:9108"]
kind: ConfigMap
metadata:
  name: pr-conf
  namespace: elk
```  
  
  
Here make sure you either write your own namespace or create this elk namespace before running.

Now next we will write a deployment file for Prometheus.
```

apiVersion: apps/v1
kind: Deployment
metadata:
  namespace: elk
  labels:
    app: pr
  name: pr
spec:
  replicas: 1
  selector:
    matchLabels:
      app: pr
  template:
    metadata:
      creationTimestamp: null
      labels:
        app: pr
    spec:
      containers:
      - image: prom/prometheus
        name: prometheus
        ports:
        - containerPort: 9090
        volumeMounts:
        - name: data
          mountPath: /etc/prometheus
      volumes: 
      - name: data
        configMap:
          name: pr-conf
          items:
              - key:  prometheus.yml
                path: prometheus.yml

        
```

​        
​        Now we will create a service file for nodePort , so that we can access it through our browser through our <node-ip>:<node-port>  

```
 apiVersion: v1
kind: Service
metadata:
  name: prometheus
  namespace: elk
  
spec:
  selector: 
    app: pr
  type: NodePort  
  ports:
    - port: 9090
      targetPort: 9090
      nodePort: 32200
```
Now we will be able to access the prometheus on 32200 which is our nodePort  so start all the services one by one and you're good to go and also we can use Grafana for visualisation too along with prometheus.

