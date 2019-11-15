# Linux

<div align="center"><img src="../images/linux_map.png"></div><hr/>

## Checklist

Check your Linux educational progress with the following list:

- [ ] **File System Hierarchy**
  - [ ] `/`
  - [ ] `/bin` and `/sbin`
  - [ ] `/opt`
  - [ ] `/usr`
  - [ ] `/var`
  - [ ] `/home`

  - [ ] Check yourself
    - [ ] What is '/'?
    - [ ] What is stored in '/bin'?
    - [ ] What '/home' is usually used for?
    - [ ] What type of files can you find in '/var'?

- [ ] **Navigation**
  - [ ] `pwd` - where am I?

  - [ ] cd
    - [ ] relative vs. absolute paths
    - [ ] What will happen when running 'cd -'?

  - [ ] Check yourself
    - [ ] How to check your current path?

- [ ] **Files**
  - [ ] Commands
    - [ ] touch
    - [ ] rm
    - [ ] how to remove a directory?

  - [ ] `ls` - list files and directories
    - [ ] `-a` for listing hidden files
    - [ ] `-l` for list formt
    - [ ] `-t` order by time
    - [ ] `-F` better distinguish between regular files and directories

  - [ ] Check yourself
    - [ ] How to list hidden files?
    - [ ] What `cd ..` will do?

- [ ] **I/O redirection**

- [ ] **Network**
  - [ ] netstat

- [ ] **Users**
  - [ ] Commands
    - [ ] useradd
    - [ ] usermod
    - [ ] userdel
    - [ ] who
  - [ ] Nice to know commands
    - [ ] lastlog
  - [ ] Check yourself
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

## Learn Linux


Name | Comments
:------|:------:
[Linux Journey](https://linuxjourney.com) | Written guides + exercises + quiz
[Techmint Linux](https://www.tecmint.com/free-online-linux-learning-guide-for-beginners) | Written articles/lessons
[Linux Survival](https://linuxsurvival.com/linux-tutorial-introduction) | Interactive guide

## Books

Author | Title | Comments
:------ |:------:|:--------:
William Shotts | [The Linux Command Line](http://linuxcommand.org/tlcl.php) | Free |
Christopher Negus | [Linux Bible](https://www.wiley.com/en-us/Linux+Bible%2C+9th+Edition-p-9781118999875) | |

## Sites

Name | Comments
:------|:------:
[Linux From Scratch](http://www.linuxfromscratch.org) |
[Operating Systems: Three Easy Pieces](http://pages.cs.wisc.edu/~remzi/OSTEP) |


## Videos

Presenter | Video | Length | Level
:------ |:------|:------:|:--------:
Joseph Delgadillo | [The Complete Linux Course: Beginner to Power User!](https://www.youtube.com/watch?v=wBp0Rb-ZJak&t=6578s) | 07:23:52 | Beginner |

## Tweak OS

Fedora disable alert sound

`dconf write /org/gnome/desktop/sound/event-sounds "false"`

## Presentations

Author | Presentation | Level | Comments
:------ |:------|:--------:|:--------:
Arie Bregman | [Linux Networking](https://www.slideshare.net/ArieBregman/linux-networking-113100224) | Beginner | |
Andrew McNico | [tcpdump](https://www.slideshare.net/j0b1n/tcpdump-hunter?qid=b71dea53-7829-40a3-b82b-4a669383eac6) | Beginner | |

## Cheat Sheet

Get SElinux denials

```
semodule -DB

sudo ausearch -m avc -m user_avc -m selinux_err -m user_selinux_err -i -ts today
```
