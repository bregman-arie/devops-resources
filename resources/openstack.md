# OpenStack

## Checklist

- [ ] **Components & Services**
  - [ ] Neutron (Networking)
  - [ ] Cinder (Storage)
  - [ ] Nova (Compute)

- [ ] **Neutron**
  - [ ] Agents
  - [ ] Server

## Resources

Name | Description
:------|:------:
[OpenStack Operator Tools](https://github.com/openstack/osops-tools-contrib) | Tools and scripts for neutron, nova, etc.
[Infrared](https://github.com/redhat-openstack/infrared) | OpenStack Deployment with Ansible

## Cheatsheet

### Infrared

* Add plugin: `infrared plugin add <plugin_path>`
* Add plugin when the spec not in root directory: `infrared plugin add <plugin_path> --src-path infrared_plugin`
* Remove plugin: `infrared plugin remove <plugin_name>`

* Import workspace (= inventory update): `infrared workspace import https://my-jenkins.com/job/blipblop/1/artifact/workspace.tgz`
* List nodes in inventory/workspace: `infrared workspace node-list`

* If you get error when executing external plugin: "no such role" then you need to create a soft link: 
```
mkdir ~/.infrared/plugins/<plugin_name>/infrared_plugin/roles
ln -s ~/<plugin_name> ~/.infrared/plugins/<plugin_name>/infrared_plugin/roles/<plugin_name>
```

### Servers

* List openstack instances: `openstack server list`
