## Virtualization

### Virsh CheatSheet

* List VMs: `virsh list --all`
* Shutdown VMs: `virsh shutdown <VM_NAME>`
* Delete VMs: `virsh undefine <VM_NAME>`

* List pools: `virsh pool-list`
* Delete pool content: `virsh pool-delete <POOL_NAME>`
* Deactivate pool: `virsh pool-destroy <POOL_NAME>`
* Delete the pool object: `virsh pool-undefine <POOL_NAME>`

* List networks: `virsh net-list`
* Delete network: `virsh net-undefine <NETWORK_NAME> && virsh net-destroy <NETWORK_NAME>`

### Vagrant Resources

Name | Description
:------|:------:
[Official Docs](https://www.vagrantup.com/intro/index.html) | Multi-container applications

#### Vagrant Cheatsheet

* Initialize vagrant file using Fedora image: `vagrant init fedora/33-cloud-base`
* Bring up the VM: `vagrant up`
* SSH into the machine: `vagrant ssh`
* Shutdown: `vagrant halt`
* Delete the VM: `vagrant destroy`
* Reload Vagrant configuration: `vagrant reload`
