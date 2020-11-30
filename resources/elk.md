## ELK articles

Name | Comments
:------|:------:
[logz.io - complete-guide-elk-stack](https://logz.io/learn/complete-guide-elk-stack) | name says it all

## Logstash articles

Name | Comments
:------|:------:
[Logstash Grok Guide](https://logz.io/blog/logstash-grok) | Learn Grok, It's important to know

## Data Sets & Patterns

Name | Comments
:------|:------:
[Kaggle](https://www.kaggle.com) | Free Data Sets
[Logstash Patterns](https://github.com/logstash-plugins/logstash-patterns-core/tree/master/patterns) | Logstash Patterns Code
[Grok Patterns](https://github.com/logstash-plugins/logstash-patterns-core/blob/master/patterns/grok-patterns) | Logstash Patterns Code
[RE used by Grok](https://github.com/kkos/oniguruma/blob/master/doc/RE) |

## Elasticsearch Tools

Name | Comments
:------|:------:
[elasticsearch-dump](https://github.com/taskrabbit/elasticsearch-dump) | Import and export tools for elasticsearch

## Logstash Tools

Name | Comments
:------|:------:
[GrokDebug](https://grokdebug.herokuapp.com) | Test Grok Patterns

## Kibana Tools

Name | Comments
:------|:------:
[Rubban](https://github.com/sherifabdlnaby/rubban) | "Kibana Automatic Index Pattern Discovery and Other Curating Tasks"

## Elsaticsearch Cheat Sheet

* Test elasticsearch: `curl <es_host>:9200`
* List of APIs: `curl <es_host>:9200/_cat`
* List nodes: `curl <es_host>:9200/_cat/nodes`
* List nodes with headers: `curl <es_host>:9200/_cat/nodes?v`
* Check elasticsearch health (also good for checking number of nodes): `curl -X GET "localhost:9200/_cat/health?v"`
* List indexes: `curl 'localhost:9200/_cat/indices?v'`
* Create a new index called "customers" and add a document with the field name

```
curl -X PUT "localhost:9200/gamer/_doc/1?pretty" -H 'Content-Type: application/json' -d'
{
  "name": "John Doe"
}
'
```

* Add documents from a JSON file: `curl -H "Content-Type: application/json" -XPOST "localhost:9200/customer/_bulk?pretty&refresh" --data-binary "@customers.json"`
* Get the document with ID 1: `curl -X GET "localhost:9200/gamer/_doc/1"`
* List all indices: `curl "localhost:9200/_cat/indices?v"`

* Increase fields limit
```
PUT test_index/_settings
{
  "index.mapping.total_fields.limit": 2000
}
```

* Delete index from console UI: `DELETE /<index_name>`
* Delete all indexes from CLI: `curl -X DELETE 'http://<elasticsearch_address>:9200/_all` # Don't run this! it will delete also the Kibana index and you'll not have default space available

* Create cluster

```
# On the master node
dnf install -y elasticsearch
systemctl enable elasticsearch
vi /etc/elasticsearch/elasticsearch.yml
  set cluster.name
  set node.name
  set network.host to [_local_, _site_]
  set discovery.seed_hosts to master private IP address (or addresses if you are using multiple nodes)
  set cluster.inital_master_nodes to master node name(s)
  set node.master to true
  set node.data to false
  set node.ingest to true
  set node.ml to false
# On second node (and any additional node)
  set cluster.name
  set node.name
  set network.host to [_local_, _site_]
  set discovery.seed_hosts to master private IP address (or addresses if you are using multiple nodes)
  set cluster.inital_master_nodes to master node name(s)
  set node.master to false
  set node.master to true
  set node.ingest to false
  set node.ml to false
# On all nodes
systemctl start elasticsearch
```

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

* Load Parquet files

```
Use https://github.com/Parquet/parquet-compatibility/blob/master/parquet-compat/src/test/java/parquet/compat/test/ConvertUtils.java
Specifically https://github.com/Parquet/parquet-compatibility/blob/master/parquet-compat/src/test/java/parquet/compat/test/ConvertUtils.java#L111

Once it's convreted to CSV, you process it with

input {
    file {
        path => "/path/to/your/parquet/as/csv/file"
    }
}
filter {
    csv {
        columns => ["col1", "col2"]
    }
}
```

## Kibana Cheat Sheet

* Unlock Indexes (in case of forbbiden error)

```
PUT .kibana/_settings
{
"index": {
"blocks": {
"read_only_allow_delete": false
}
}
}
```

* Unlock specific index

```
PUT your_index_name/_settings
{
"index": {
"blocks": {
"read_only_allow_delete": "false"
}
}
}
```
