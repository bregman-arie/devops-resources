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

## Logstash Tools

Name | Comments
:------|:------:
[GrokDebug](https://grokdebug.herokuapp.com) | Test Grok Patterns

## Kibana Tools

Name | Comments
:------|:------:
[Rubban](https://github.com/sherifabdlnaby/rubban) | "Kibana Automatic Index Pattern Discovery and Other Curating Tasks"


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

## Elsaticsearch Cheat Sheet

* Test elasticsearch

```
curl localhost:9200
```

* List indexes

```
curl 'localhost:9200/_cat/indices?v'
```
