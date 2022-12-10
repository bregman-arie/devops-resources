# Python

## Learning Python (Courses)

Name | Description
:------|:------:
[Introduction To Python Programming](https://www.udemy.com/course/pythonforbeginnersintro) | Free, Udemy
[Python for Beginner](https://www.udemy.com/course/python-hackcc) | Free, Udemy
[Learn Python](https://www.youtube.com/watch?v=rfscVS0vtbw&feature=emb_logo) | Free, freeCodeCamp
[Learn Python from Scratch](https://www.educative.io/courses/learn-python-from-scratch) | Free, educative.io

## Learning Python (Tutorials and Interactive platforms)

Name | Description
:------|:------:
[HackerRank](https://www.hackerrank.com) | Python challenges/exercises
[LeetCode](https://leetcode.com) | Python challenges/exercises
[Exercism](https://exercism.io) | Python challenges/exercises
[py4e](https://www.py4e.com) | Python lessons and materials
[W3 Python](https://www.w3schools.com/python) | Python tutorial
[Mode Python Tutorial](https://mode.com/python-tutorial) | Python Tutorial
[Khan Academy](https://www.khanacademy.org) | Python courses and lessons
[Python resources for everybody](https://learnbyexample.github.io/py_resources) | Python written resources

## Modules

Name | Description
:------|:------:
subprocess | Spawn new processes (=execute commands).
agithub | Rest API client for rapid prototyping on any rest API.

## Books

Author | Title | Comments
:------ |:------:|:--------:
Jeff Knupp | Writing Idiomatic Python 3.3 | |
Dane Hillard | [Publishing Python Packages](https://www.manning.com/books/publishing-python-packages) | |
Yong Cui | [Python How-To](https://www.manning.com/books/python-how-to) | |
Pael Anni | [Let's Talk Python](https://www.manning.com/books/lets-talk-python)) | |

## Articles, Tutorials & Blog Posts

Author | Article | Level | Comments
:------ |:------|:--------:|:--------:
Megha Mohan | [Mutable vs Immutable Objects in Python](https://medium.com/@meghamohan/mutable-and-immutable-side-of-python-c2145cf72747) | Beginner | |
Kenneth Reitz | [The Hitchhiker’s Guide to Python](http://docs.python-guide.org/en/latest) | | |
Kenneth Reitz | [Serialization](https://docs.python-guide.org/scenarios/serialization/) | | |

## Libraries, Frameworks & Tools

Name | Description
:------:|:-------:
[Natural Language Toolkit](https://www.nltk.org)  | Platform for language processing programming |
[Flask](http://flask.pocoo.org)  | Web microframework based on Werkzeug, Jinja 2
[Django](https://www.djangoproject.com)  | Web framework with batteries included
[Mypy](http://mypy-lang.org) | Static type checker
[Pandas](https://pandas.pydata.org) | "open source data analysis and manipulation tool"

### Cheat Sheet

#### YAML

* Read YAML
```
with open(r'/file/path') as file:
```

#### Files

* Read remote file(s)

```
from fabric import Connection

with Connection(host) as conn:
    with conn.sftp().open(path) as stream:
    ...
```

#### Dictionaries

* Define dictionary: `some_dict = {'first_number': 2017, 'second_number': 2022}`
* Add item to dictionary: `some_dict['third_number'] = 1991`
* Remove last item: `some_dict.popitem()`
* Remove item by key: `some_dict.pop("third_number")`
* Get all keys without values: `some_dict.keys()`
* Get all values without keys: `some_dict.values()`
* Access item: `some_dict['first_number']` or `some_dict.get('second_number')`
* Number of items in the dictionary: `len(some_dict)`
* Update value of a certain key: `some_dict.update({"first_number": 02017})

## Python Checklist

<div align="center"><img src="images/python_map.png"></div><hr/>

## Checklist

- [ ] **Data Types**
  - [ ] Numbers (int, long, float, complex)
  - [ ] List
  - [ ] Dictionary
  - [ ] String
  - [ ] Tuple

- [ ] **Mutability**
  - [ ] What data types are mutable?
  - [ ] What data types are immutable?

- [ ] **PEP8**
  - [ ] What is it?
  - [ ] Give an example of three coding conventions Python developers should always follow

- [ ] **Errors & Exceptions**
  - [ ] How do you handle exceptions?

- [ ] Iterators
  - [ ] What 'enumerate' is used for?

- [ ] **List Comprehensions**
  - [ ] Is it better than for loop? If yes, why?
  - [ ] How to perform list comprehensions for nested lists?

- [ ] Data serialization
    [ ] How you do with Python?

- [ ] **Type Annotations**

- [ ] **Dataclass**

- [ ] **What's that?**
  - [ ] What _ is used for in Python?

- [ ] Meta-programming

- [ ] Descriptors

- [ ] Decorators

 [ ] Context Managers

- [ ] Buffering Protocol
