# Interview Questions

## General

* What is data serialization?

```
The process of converting structured data to a format allows sharing or storing
it in a form that allows recovery of its origina structure.

Data serilization can be used also to minimize the data's size to use less disk space
or bandwidth
```

## Configuration Management

* Why do we need configuration management? What is it good for?

## CM - Puppet

* How puppet works?
* What its advantages over other CM technologies?
* What is a manifest?
* Can you write a simple manifest for starting a service and install package?

## Python newbie

* What data type supported in Python and which of them are mutable?
  What function can you use to show that a certain data type is mutable?

```
The mutable data types are:

    List
    Dictionary
    Set
    
The immutable data types are:

    Numbers (int, float, ...)
    String
    Bool
    Tuple

The id function can be used to check if a given variable is mutable or not.
```

* What is PEP8? Give an example of 5 style guidelines

```
PEP8 is a list of coding conventions and style guidelines for Python

5 style guidelines:

    1. Limit all lines to a maximum of 79 characters.
    2. Surround top-level function and class definitions with two blank lines.
    3. Use commas when making a tuple of one element
    4. Use spaces (and not tabs) for indentation
    5. Use 4 spaces per indentation level
```

## I know Python

* What _ is used for in Python?

```
1. Translation lookup in i18n
2. Hold the result of the last executed expression or statement
3. As a general purpose "throwaway" variable name. For example: x, y, _ = get_data() (x and y are used but since we don't care about third variable, we "threw it away").
```

## Interview Questions - Docker

* What is Dockerfile?
* What is docker compose and how you use it?

    A tool for defining multi-container Docker applications.

* I would like to build a multi-container application which consists of Flask and Redit. How would you do it?

## Interview Questions - Nomad

* What is a nomad cluster? What gossip protocol used for?

## Machine Learning

* What distinguishes a machine learning algorithm from a non-machine learning algorithm?

The ability to adapt its behaviours to a new input with human intervention.

* What is the outcome of a machine learning algorithm?

The outcome is known as machine learning model. This a function which output certain results when given the input.

## Bash

* What is "$?""
* What is $$
* What is $@ (separate arguement) $* (single argument)
* Write a function that sums all the given numbers

## Linux

* What process states are there?
    - (D) Uninterupptable sleep (= system call like read). You can't kill or interuupt it
    - (S) Inturruptable sleep. Waits for timeslot or event but will handle a signal immediately
    - (T) Stopped state. You can stop with ^Z or kill -STOP
* What is a zombie process? Does it bothers you if you see a lot of zombie processes?

* What is a signal? What is the default signal when you kill a process? SIGTERM. What other Signals there are?
*
* What are kernel parameters? How do you change them?
* Soft link vs. hard link?
* What is the error in the file <error1>?


OpenStack
=========
1. What projects did you use with OpenStack?
2. How OpenStack services communicate between themselves?
3. What is the flat network? vlan network? what are vxlan and gre?
4. You want to bring up an instance with external connectivity, how do you do it?
5. What are you using to check which openstack version used?

Git
===

1. You have 3 commits and you want to merge them together, how would you do it?
2. You want to move fourth commit to the top. how would you do it? 
3. Branching model

MongoDB
=======
1. What is a document? What is a collection?
2. What is an aggregator?

DevOps
======

1. What is the purpose of DevOps? How do you explain someone what is your role?
2. What did you use for automation?
3. What did you use for monitoring?
4. What did you use for configuration management?

DNS
==========
1. What is A record?
2. What is the equivalent IPv6 record of A record?
3. What transportation DNS is using?
4. What is MX record?
