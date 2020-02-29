# Network

## Docs

Name | Comments
:------|:------:
[TCP/IP networking referen](http://www.penguintutor.com/linux/basic-network-reference)

## Books

Author | Title | Comments
:------ |:------:|:--------:
James Kurose & Keith Ross | Computer Networking: A Top-Down Approach | Great for beginners 
Andrew S. Tanenbaum | Computer Networks | Commonly used by academic networking courses 
Richard Stevens | TCP/IP illustrated | 
Richard Stevens                                              |                   UNIX Network Programming                   |                                                              
OccupyTheWeb                                                 | Linux Basics for Hackers: Getting Started with Networking, Scripting, and Security in Kali |          Includes a chapter on wireless networking           
Evi Nemeth & Garth Snyder & Trent R. Hein &  Ben Whaley & Dan Mackin |        UNIX and Linux System Administration Handbook         | A great book on Linux and there is a dedicated chapter for Linux networking 

## Videos - Basic Networking Concepts

Presenter | Video | Length | Level
:------ |:------|:------:|:--------:
Rene Molenaar | [Address Resolution Protocol (ARP) Explained](https://www.youtube.com/watch?v=xTOyZ6TWQdM) | 00:05:13 | Beginner |
Eli the Computer Guy | [The OSI Model Demystified](https://www.youtube.com/watch?v=HEEnLZV2wGI) | 00:18:40 | Beginner |
Pieter De Decker | [Hub, Switch or Router? Network Devices Explained](https://www.youtube.com/watch?v=Ofjsh_E4HFY) | 00:07:39 | Beginner |
Pieter De Decker | [How Network Address Translation Works](https://www.youtube.com/watch?v=QBqPzHEDzvo) | 00:10:04 | Beginner |
Pieter De Decker | [How DHCP Works](https://www.youtube.com/watch?v=RUZohsAxPxQ) | 00:07:55 | Beginner |
Pieter De Decker | [UDP and TCP: Comparison of Transport Protocols](https://www.youtube.com/watch?v=Vdc8TCESIg8) | 00:11:34 | Beginner |
Ricky Tapia | [CSMA/CD](https://www.youtube.com/watch?v=IAKncL67Pp4) | 00:04:01 | Beginner |


## Videos - Linux

Presenter | Video | Length | Level
:------ |:------|:------:|:--------:
David Mahler | [Introduction to Linux Network Namespaces](https://www.youtube.com/watch?v=_WgUwUf1d34) | 00:25:50 | Beginner |


## Videos - OpenvSwitch

Presenter | Video | Slides | Length | Level
:------ |:------|:------:|:--------:|:--------:
David Mahler | [Introduction to Open vSwitch](https://www.youtube.com/watch?v=rYW7kQRyUvA) | | 00:14:35 | Beginner |
David Mahler | [An Introduction to Open vSwitch](https://www.youtube.com/watch?v=_PCRNUB7oNw) | [Slides](http://openvswitch.org/slides/openvswitch.en-2.pdf)| 00:35:49 | First half beginners, second half intermediate level |


## Videos - OpenFlow

Presenter | Video | Length | Level | Comments
:------ |:------|:------:|:--------:|:--------:
David Mahler | [Introduction to OpenFlow](https://www.youtube.com/watch?v=l25Ukkmk6Sk) | 00:15:25 | Beginner | |
Steven Wallace | [Describes the OpenFlow flow table](https://www.youtube.com/watch?v=-xLQHld3fPI) | 00:03:00 | Beginner | |
David Mahler | [OpenFlow with multiple Flow Tables](https://www.youtube.com/watch?v=TD5wmoD7XOE) | 00:09:30 | Intermediate | |
David Mahler | [OpenFlow flow entries on Open vSwitch (OVS)](https://www.youtube.com/watch?v=FyV4MoQ3T0I) | 00:14:22 | Intermediate | Required Knowledge: Open vSwitch |

## Videos - OpenStack Neutron

Presenter | Video | Length | Level | Comments
:------ |:------|:------:|:--------:|:--------:
[Shalu George & Naveen Joy] | [Neutron networking demystified for beginners](https://www.youtube.com/watch?v=c-x90PZFv8k) | 00:39:53 | Beginner | 2017 |
David Mahler | [Introduction to OpenStack Neutron](https://www.youtube.com/watch?v=yqFpyubsYfE) | 00:19:38 | Beginner | |
Assaf Muller | [Introduction to OpenStack Neutron](https://www.youtube.com/watch?v=IGGgVuZe7UA) | 00:33:20 | Beginner | |
Rossella Sblendido | [I Can't Ping My VM! Learn How to Debug Neutron and Solve Common Problems](https://www.youtube.com/watch?v=aNA8Pvewu2M) | 00:42:16 | Intermediate | Required Knowledge: neutron basics |
David Mahler | [OpenStack Neutron Packet Walkthrough (DVR)](https://www.youtube.com/watch?v=7IXEtUEZslg) | 00:44:56 | Intermediate | Required Knowledge: neutron, openvswitch, namespaces and openflow |
Mohamed Elsakhawy | [Neutron- Where Did My Packets Go?](https://www.youtube.com/watch?v=uKgMp5c6R-4) | 00:39:32 | Beginner | |

## Checklist - Network Newbie

- [ ] **OSI model**
  - [ ] What layers the OSI model has and what is the purpose of each one of them?

- [ ] **Ethernet**
  - [ ] What is CSMA/CD and how it works?

- [ ] **MAC address**
  - [ ] What is it used for? Is it unique?
  - [ ] How many bits are in a MAC address?

- [ ] **IP address**
  - [ ] What is it used for? Is it unique worldwide?
  - [ ] What are the two parts of an IP address?
  - [ ] How many bits are in an IP address?

- [ ] **Subnets**
  - [ ] Two hosts are on the same subnet if they have the same '_____'
  - [ ] What is a netmask?
  - [ ] What two syntaxes exist for expressing a netmask?

- [ ] **ARP**
  - [ ] Which layer of the OSI model do ARP belong to?
  - [ ] What ARP table includes?
  - [ ] Give an example of how ARP protocol works

- [ ] **IP**
  - [ ] What it defines?
  - [ ] What is a routing table? When is it being used?

- [ ] **TCP**
  - [ ] What are the differences between TCP and UDP? When would you prefer to use TCP over UDP?
  - [ ] What is a "three-way handshake"?

- [ ] **UDP** 
  - [ ] Why UDP considered to be unreliable when compared to TCP?
  - [ ] Which layer of the OSI model do UDP belong to?

- [ ] **DHCP**
  - [ ] How DHCP client locates the DHCP server?
  - [ ] Does the client has to be on the same local network as the server?
  - [ ] How the exchange between client and the server looks like? what steps are included?
  - [ ] Is it using TCP or UDP?
  - [ ] What ports is it using?

- [ ] **Netowrk Devices**
  - [ ] What is a HUB?
  - [ ] What is a Switch?
    - [ ] Forwarding table or (aka forwarding information base)
  - [ ] What is a Router?
  - [ ] What are differences between the three devices above?

- [ ] **Delivery schemes**
  - [ ] What is unicast?
  - [ ] What is multicast?
  - [ ] What is broadcast?
    - [ ] What is the broadcast address?
    - [ ] What protocols use broadcast?
    - [ ] What is a broadcast domain?

- [ ] **VLAN**
  - [ ] What are the advantages of using VLAN?
  - [ ] What is the range for VLAN IDs?
  - [ ] What is a trunk port?

- [ ] **Topologies**
  - [ ] Bus topology
  - [ ] Ring topology
  - [ ] Star topology
  - [ ] Tree topology

- [ ] **IP**
  - [ ] What layer of OSP model it belongs to?
  - [ ] IPv4
  - [ ] IPv6
    - [ ] Why IPv6 is needed if IPv4 exists?

- [ ] **ICMP**
  - [ ] What is it used for?
  - [ ] How do you use it?

- [ ] **NAT**
  - [ ] What is it and why it's needed?
  - [ ] What is SNAT? how it is different from NAT?
  - [ ] What is DNAT? how it is different from SNAT?

## Intermediate

- [ ] **Routing**
  - [ ] Distance Vector Routing
    - [ ] "Count-to-infinity" problem
  - [ ] Dijkstra's algorithm

- [ ] **TCP**
  - [ ] Silly window syndrome
    - [ ] Nagle's algorithm
    - [ ] Clark's solution

## Linux Networking

- [ ] **Commands**
  - [ ] ping
  - [ ] ip addr
  - [ ] ip neigh
  - [ ] ip link
  - [ ] ip route
  - [ ] ip netns
  - [ ] ethtool
  - [ ] netstat
  - [ ] traceroute
  - [ ] tcpdump
  - [ ] mtr

- [ ] **ARP**
  - [ ] How to view the contents of the ARP cache?
  - [ ] How to initiate an ARP request manually?

- [ ] **MTU**
  - [ ] How to see what is the MTU of a given interface?
  - [ ] How do you set MTU?

- [ ] **Namespaces**
  - [ ] How to create & delete namespaces?
  - [ ] How to enter a specific namespace?

- [ ] **Routing*
  - [ ] How to display the routing table?
  - [ ] How to print the IP address of each router that an IP packet traverses along its path to its destination?

- [ ] **ICMP**
  - [ ] How do you use it?

## Academic Level

- [ ] **Digital Modulation**
  - [ ] What is Amplitude Shift keying?
  - [ ] What is Frequency Shift Keying?
  - [ ] What is Phase Shift keying?

- [ ] **Multiplexing**
  - [ ] What is it used for and how it works?

- [ ] **Wireless networks**
  - [ ] The hidden terminal problem
  - [ ] The exposed terminal problem
  - [ ] **MACA**
    - [ ] What is RTS?
    - [ ] What is CTS?

- [ ] **ALOHA**
  - [ ] Pure
  - [ ] Slotted

- [ ] **Noisy-channel coding theorem**
  - [ ] Shannon capacity/limit

- [ ] **CSMA**
  - [ ] The Binary Exponential Backoff Algorithm

- [ ] **Stop and Wait**

- [ ] **The adaptive tree walk**

- [ ] **Cryptography**
  - [ ] Symmetric
  - [ ] Asymmetric
  - [ ] Digital Signature

- [ ] **Error Detection**
  - [ ] Parity Bit
  - [ ] Checksum
  - [ ] CRC code

- [ ] Data transmission
  - [ ] Piggybacking

- [ ] **Error Correction**
    - [ ] Hamming Code
    - [ ] Reed Solomon code
    - [ ] The NASA binary convolutional code
    - [ ] Low-Density Parity Check code

## Cloud Networking (OpenStack Neutron)

- [ ] **Components**
  - [ ] API Server
  - [ ] Plugins
  - [ ] Agents
  - [ ] Messaging Queue

- [ ] **Entities**
  - [ ] Network
  - [ ] Router
  - [ ] Port
  - [ ] Subnet
  - [ ] Security Group

- [ ] **ML2 Plugin**
  - [ ] What is it used for?
  - [ ] Explain type drivers
  - [ ] Explain mechanism drivers

- [ ] **dnsmasq***

- [ ] **Floating IP**

- [ ] **Provider Network**
