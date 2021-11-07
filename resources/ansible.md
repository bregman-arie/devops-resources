## Ansible

### Learn Ansible

Name | Comments
:------ |:--------:
[Ansible 101 - Jeff Geerling](https://www.youtube.com/watch?v=goclfp6a2IQ&list=RDCMUCR-DXc1voovS8nhAvccRZhg&index=1) | Comprehensive practical way to learn Ansible
[What is Ansible? - TechWorld with Nana](https://www.youtube.com/watch?v=1id6ERvfozo) | High-level short overview of Ansible
[Learning Ansible basics - Red Hat](https://www.redhat.com/en/topics/automation/learning-ansible-tutorial) | Red Hat's guide on how to learn Ansible basics + links to the content itself
[Introduction to Ansible - 2021](https://medium.com/@bagusays/introduction-to-ansible-82f2bc12cd87) |

### Articles

Name | Comments
:------ |:--------:
[Writing reliable Ansible Playbooks - 2021](https://dev.to/xlab_si/writing-reliable-ansible-playbooks-295i) | 
[A CI/CD Pipeline Project for a Trunk-Based Development Strategy in a Kubernetes Environment](https://medium.com/swlh/a-ci-cd-pipeline-project-for-a-trunk-based-development-strategy-in-a-kubernetes-environment-c4ffea9700fe) |

### Books

Name | Comments
:------ |:--------:
[Ansible for DevOps](https://www.amazon.com/Ansible-DevOps-Server-configuration-management/dp/098639341X) | 
[Ansible: From Beginner to Pro](https://www.amazon.com/Ansible-Beginner-Pro-Michael-Heap/dp/1484216601) |
[Ansible: Up and Running](https://www.amazon.com/Ansible-Automating-Configuration-Management-Deployment/dp/1491979801) |


### Cheat Sheet

* Check if list has elements

```
when: my_list | length > 0
```

* Update all packages

```
- name: Update system packages
  package:
    state: latest
    name: "*"
```

* Update packages informations and display packages informations

```
- name: Update packages informations
  package_facts:
    manager: "auto"

- name: Display all installed packages informations
  debug:
    msg: "{{ ansible_facts.packages }}"

- name: Display all Chromium package informations
  debug:
    msg: "{{ ansible_facts.packages['chromium'] }}"
  when: "'chromium' in ansible_facts.packages"
```
