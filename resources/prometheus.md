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

![image-20211213175431699](/home/knoldus/.config/Typora/typora-user-images/image-20211213175431699.png)



Here make sure you either write your own namespace or create this elk namespace before running.

Now next we will write a deployment file for Prometheus.

![img](https://lh5.googleusercontent.com/PBFqRyBv5ZroL8jKco99Eegycd6xp7RlJAi_e03FHXN4nMmmXPnqXfe2mchZbK8uhxxtZtcDbq-xWd9M6C4jHVRTfleQMTgtBpqz07mXKAyBYuTVOnUkFfkrVuq8WFV5ODXERQW2)


​        
​        Now we will create a service file for nodePort , so that we can access it through our browser through our <node-ip>:<node-port>  

![image-20211213175056154](/home/knoldus/.config/Typora/typora-user-images/image-20211213175056154.png)

Now we will be able to access the prometheus on 32200 which is our nodePort  so start all the services one by one and you're good to go and also we can use Grafana for visualisation too along with prometheus.

