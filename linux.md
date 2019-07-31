# Linux

## Checklist

Check your Linux educational progress with the following list:

- [ ] **Basic commands**
  - [ ] pwd
  - [ ] ls
    - [ ] How to list hidden files?
    - [ ] How to list content using long list format?
  - [ ] cd
    - [ ] What 'cd ..' means?
    - [ ] What will happen when running 'cd -'?
  - [ ] touch
  - [ ] rm
      - [ ] how to remove a directory?

- [ ] **File system hierarchy**
  - [ ] What is '/'?
  - [ ] What is stored in '/bin'?
  - [ ] What '/home' is usually used for?
  - [ ] What can you find in '/var'?

- [ ] **I/O redirection**

- [ ] **Network**
    - [ ] netstat

- [ ] **Users**
    - [ ] commands
        - [ ] useradd
        - [ ] usermod
        - [ ] who
    - [ ] how to add a new user?
    - [ ] should you be using your user or root?

- [ ] **Monitoring and performence commands**
    - [ ] top
    - [ ] stat

- [ ] **Processes**
    - [ ] Running in ackground (&)

- [ ] **Archives**
    - [ ] what is it good for
    - [ ] tar
    - [ ] zip
    - [ ] commands
        - [ ] create an archive
        - [ ] list archive's content
        - [ ] remove an archive

- [ ] **Storage, Filesystem**
    - [ ] inode
    - [ ] 

## Books

Author | Title | Comments
:------ |:------:|:--------:
William Shotts | [The Linux Command Line](http://linuxcommand.org/tlcl.php) | Free |
Christopher Negus | [Linux Bible](https://www.wiley.com/en-us/Linux+Bible%2C+9th+Edition-p-9781118999875) | |


## Videos

Presenter | Video | Length | Level
:------ |:------|:------:|:--------:
Joseph Delgadillo | [The Complete Linux Course: Beginner to Power User!](https://www.youtube.com/watch?v=wBp0Rb-ZJak&t=6578s) | 07:23:52 | Beginner |


## Interview Questions

* What is the different between a soft link and hard link?

```
hard link is the same file, using the same inode.
soft link is a shortcut to another file, using a different inode.

soft links can be created between different file systems while
hard link can be created only within the same file system.
```

* How to run a process in background and why to do that in the first place?
```
You can achieve that by specifying & at end of the command.
As to Why? since some commands/processes can take a lot of time to finish
execution or run forever
```

* What signal is used when you run 'kill <process id>'?
```
The default signal is SIGTERM (15). This signal kills
process gracefully which means it allows it to save current
state configuration.
followup questions:
what is SIGKILL?
what other signals there are?
```
