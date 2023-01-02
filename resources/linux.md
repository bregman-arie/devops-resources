# Linux

<div align="center"><img src="../images/linux_map.png"></div><hr/>

## Learn Linux - Tutorials and Guides

Name | Comments
:------|:------:
[Linux Journey](https://linuxjourney.com) | Written guides + exercises + quiz
[Techmint Linux](https://www.tecmint.com/free-online-linux-learning-guide-for-beginners) | Written articles/lessons
[Linux Survival](https://linuxsurvival.com/linux-tutorial-introduction) | Interactive guide
[NixCraft](https://www.cyberciti.biz/) | Succinct guides
[Linux Filesystem Explained](https://www.linux.com/training-tutorials/linux-filesystem-explained) | NSIA
[Linux SysOps Handbook](https://abarrak.gitbook.io/linux-sysops-handbook) | A study notes book for the common knowledge and tasks of a Linux system admin.
[LinuxToday](https://www.linuxtoday.com) |  Contributor-driven news resources


## Linux Internals - Articles

Name | Comments
:------|:------:
[How are Unix pipes implemented?](https://toroid.org/unix-pipe-implementation) | 

## Linux Internals - Videos

Name | Comments
:------|:------:
[Understanding fork() system call for new process creation](https://www.youtube.com/watch?v=PwxTbksJ2fo) | 

## Learn Linux - Videos

Name | Comments
:------|:------:
[learnlinux.tv](https://www.learnlinux.tv) | Very practical videos on various topics

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

### Common Operations

* Copy files to a remote host: `rsync -azv dir USER:REMOTE_HOST_ADDR`
* View file size: `du -sh DIR/FILE`

### Users

* Who is connected: `w`

### Troubleshooting and Debugging

* see list of processes and the CPU and memory the consume: `top`
* show how long the server is up running: `uptime`
* List open files: `lsof`
* List open connections: `lsof -i`

### SElinux

Get SElinux denials

```
semodule -DB

sudo ausearch -m avc -m user_avc -m selinux_err -m user_selinux_err -i -ts today
```

### Communication

* Broadcast a message to everyone: `wall`

### Tmux

* Join a session `tmux a`
* Attach to existing session: `tmux attach -t <SESSION_NAME>`
* New tab: `ctrl + B + c`
* New session called "bla": `tmux new -s bla`

#### Virsh

* Destroy: `virsh destroy <vm_name>`
* Shutdown: `virsh shutdown <vm_name>`

#### Date

* year: `date +”%Y”`
* month: `date +”%m”`
* day: `date +”%a”`

#### Fedora

* Reset "interface text" value: `gsettings reset org.gnome.desktop.interface font-name`
* Reset "monospace text" value: `gsettings reset org.gnome.desktop.interface monospace-font-name`
* Reset "document text" value: `gsettings reset org.gnome.desktop.interface document-font-name`
* Reset "Legacy Window Titles": `gsettings reset org.gnome.desktop.wm.preferences titlebar-font`

#### Files

* Sort files by size: `ls -l | sort -nk5`
* Find broken links: `find /some/path -type l -exec test ! -e {} \; -print`

### LDAP

* LDAP search for a username: `ldapsearch -x -W -D username`
* LDAP search for a username specifying DC and ldap server: `ldapsearch -x -H ldap://ldap.blabla.com -LLL -b 'dc=DOMAIN,dc=com' "rhatNickName=abregman"`

### YAML

* Validate YAML file with Ruby: `ruby -ryaml -e "p YAML.load(STDIN.read)" < some_file.yaml`
* Validate YAML file with Python: `pip install pyyaml; python -c 'import yaml, sys; print(yaml.safe_load(sys.stdin))' < some_file.yaml`

### Misc

* Random string of 7 characters: `mkpasswd -l 8`
* Generate 8 digit random number: `shuf -i 9999999-99999999 -n 1`

## Checklist

Check your Linux educational progress with the following list:

- [ ] **File System Hierarchy**
  - [ ] `/` (aka root)
  - [ ] `/bin` and `/sbin`
  - [ ] `/opt`
  - [ ] `/usr`
  - [ ] `/var`
  - [ ] `/home`
  - [ ] `/etc`
  - [ ] `/proc`
  - [ ] `/tmp`

  - [ ] Test
    - [ ] What is '/'?
    - [ ] What is stored in '/bin'? what about `/etc`?
    - [ ] What '/home' is usually used for?
    - [ ] What type of files can you find in '/var'?
    - [ ] What is unique about `/tmp`?

- [ ] **Navigation**
  - [ ] Commands
    - [ ] `pwd` - where am I?
    - [ ] `cd` - change directory
  - [ ] relative vs. absolute paths

  - [ ] Test
    - [ ] How to check your current path?
    - [ ] Where `cd ..` will take you?
    - [ ] What would be the effect of running `cd .`?
    - [ ] What will happen when running 'cd -'?

- [ ] **Files**
  - [ ] Types of files
    - [ ] Regular
    - [ ] Directory
    - [ ] Socket
    - [ ] Block
    - [ ] Link

  - [ ] Commands
    - [ ] `ls` - list files and directories
      - [ ] `-a` for listing hidden files
      - [ ] `-l` for list formt
      - [ ] `-t` order by time
      - [ ] `-F` better distinguish between regular files and directories
    - [ ] `touch` - creating files (original intention is updating timestamp)
      - [ ] nice to know: `touch file{1..5}`
    - [ ] `rm` - remove files
      - [ ] `-r` for recursive
      - [ ] `-f` to force removal, no questions asked
    - [ ] `mkdir` - create directories
      - [ ] `-p` - for creating multiple nested directories
    - [ ] `rmdir` - remove directories
    - [ ] `echo` - display a line of text
    - [ ] `cat` - concatenate files (common usage: read a file)
    - [ ] `mv` - move files directories (also rename files and directories)
    - [ ] `cp` - copy a file
      - [ ] `-r` for recursive (copy a directory)

  - [ ] Test
    - [ ] How to list hidden files?
    - [ ] How to create an empty new file?
    - [ ] How to remove a directory?
    - [ ] How to rename a file?
    - [ ] How to copy an entire directory with all its files?

- [ ] Commands
    - [ ] `man` - manual for commands
    - [ ] `which` - get full path for given command
    - [ ] `whatis` - one-line manual page descriptions

- [ ] **I/O redirection**
  - [ ] File Descriptor
    - [ ] stdin 0 (input) <
    - [ ] stdout 1 (output) >
    - [ ] stderr 2 (error) 2>
  - [ ] Append >>

  - [ ] Test
    - [ ] How to redirect output?
    - [ ] What would be the result of the following command `blop 2> file`?

- [ ] Text Editor (one is enough)
  - [ ] vim
    - [ ] `i` to start typing
    - [ ] `:wq` to exit (or `shit+zz`)
  - [ ] nano
  - [ ] emacs
  - [ ] atom
  - [ ] sublime
  
  - [ ] Test (mainly for vim)
    - [ ] How to remove an entire line?
    - [ ] How to copy 5 lines?
    - [ ] How to jump to the end of the line
    - [ ] How to remove one word
    - [ ] How to jump to the end of the file

- [ ] **Users**
  - [ ] Commands
    - [ ] useradd
    - [ ] usermod
    - [ ] userdel
    - [ ] who

  - [ ] Nice to know commands
    - [ ] lastlog

  - [ ] Test
    - [ ] how to add a new user?
    - [ ] should you be using your user or root?

- [ ] **Network**
  - [ ] netstat

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
