## ELK articles

https://logz.io/learn/complete-guide-elk-stack

## Logstash Videos

## Data Sets

https://www.kaggle.com

## Tools

https://grokdebug.herokuapp.com

## Logstash Cheat Sheet

* input - filebeat

```
input {
  beats {
    port => 5044
  }
}
```

* Check if Logstash receiving logs from filebeat:

```
tcpdump -Xni eth0 port 5140
```

## Elsaticsearch Cheat Sheet

* Test elasticsearch

```
curl localhost:9200
```
