# Practice Sites

Name | Description
:------|:------:
[Exercism](https://exercism.io) | Over 48 languages and 2600 exercises
[LeetCode](https://leetcode.com) | Practice programming online
[Kevin Naughton Jr Channel](https://www.youtube.com/channel/UCKvwPt6BifPP54yzH99ff1g/videos) | Channel with interview questions from different companies 

# Other projects

Author | Name | Description
:------|:------|:------:
kdn251 | [Interviews](https://github.com/kdn251/interviews) | |

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
