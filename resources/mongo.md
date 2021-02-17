# MongoDB

## Tutorials

Name | Description
:------|:------:
[Guru99 MongoDB Tutorial](https://www.guru99.com/what-is-mongodb.html) | MongoDB Tutorial
[Tutorialspoint Tutorial](https://www.tutorialspoint.com/mongodb) | MongoDB Tutorial

## Cheat Sheet

### Mongo Shell

#### General

* DB stats: `db.stats()`
* Switch to a DB: `use DB_NAME`
* Show collections: `show collections`
* Show all the document in a collection: `db.COLLECTION_NAME.find({})`
* Count the number of documents in a collection: `db.COLLECTION_NAME.count()`
* Remove all the documents from a collection: `db.COLLECTION_NAME.remove({})`
* Rename field: ```db.hosts.updateMany( {}, { $rename: { "CURRENT_FIELD_NAME": "NEW_FIELD_NAME" } } )```

#### Mongoexport 

* Export Mongo DB collection to a JSON file: `mongoexport --db=DB_NAME --collection=COLLECTION_NAME --out=data.json`
* Export specific fields from a Mongo DB collection to a  JSON file: `mongoexport --db=DB_NAME  --fields=FIELD_NAME,FIELD_NAME2 --collection=COLLECTION_NAME --out=data.json`

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

* Add all the elements in an array to an array in document (This is not about adding the array as it is but adding the elements of it):

```
mongo_client.update_one(
    {'_id': 1},
    {'$addToSet': {'some_list': { '$each': [1, 2, 3]} }}, upsert=True)
```
