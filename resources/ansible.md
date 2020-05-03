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
