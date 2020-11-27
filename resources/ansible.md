## Ansible

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