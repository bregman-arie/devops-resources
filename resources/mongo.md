# MongoDB

## Tutorials

Name | Description
:------|:------:
[Guru99 MongoDB Tutorial](https://www.guru99.com/what-is-mongodb.html) | MongoDB Tutorial
[Tutorialspoint Tutorial](https://www.tutorialspoint.com/mongodb) | MongoDB Tutorial

## Cheat Sheet

### Mongo Shell

I assume the following for the purpose of the examples:
  * DB name: usage_patterns
  * Collection name: accounts

* DB stats: `db.stats()`
* Switch to a DB: `use usage_patterns`

* show collections: `show collections`
* Count the number of documents in a collection: `db.accounts.count()`
* Remove all the documents from a collection: `db.accounts.remove({})`

* Export Mongo DB into JSON file: `mongoexport --db=usage_patterns --collection=accounts --out=data.json`

#### Aggregations

* Count the number of documents: `db.accounts.aggregate([ { "$count": "number of documents" }])`
* Show only the sub element "attachment_uuids": `db.accounts.aggregate( [ {$project: {"hosts.attachment_uuids": 1, _id:0}} ] )`

### Mongo Python

* Add new element to an arrray only if it doesn't exists already

```
mongo_client.update(
        { "account_number": account_num },
        { "$addToSet": { "hosts": {'hostname': hostname} } }
    )
```

* Add a new element to an array in sub-document (if it doesn't exists already):

```
 mongo_client.update_one(
        { "account_number": account_num, "hosts.hostname": hostname },
        { "$addToSet": { "hosts.$.attachment_uuids": attachment_uuid } }
    )
```
