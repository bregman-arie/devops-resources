# Terraform

## Terraform Resources

https://project-awesome.org/shuaibiyy/awesome-terraform
[Terraform Script Builder](https://terraparty.com) | export valid Terraform scripts using UI

## Projects

Name | Comments
:------|:------:
[terraformer](https://github.com/GoogleCloudPlatform/terraformer) | "A CLI tool that generates tf/json and tfstate files based on existing infrastructure (reverse Terraform)."
[terraforming](https://github.com/dtan4/terraforming) | "Export existing AWS resources to Terraform style (tf, tfstate)"
[terrascan](https://github.com/tenable/terrascan) | "Detect compliance and security violations across Infrastructure as Code to mitigate risk before provisioning cloud native infrastructure"
[terraform-kvm](https://github.com/dmacvicar/terraform-provider-libvirt) | "It's a one Terraform Provider for KVM"

### Best Practices

#### tfstate

* Don't edit it manually. tfstate was designed to be manipulated by terraform and not by users directly.
* Store it in secured location (since it can include credentials and sensitive data in general)
* Backup it regularly so you can roll-back easily when needed 
* Store it in remote shared storage. This is especially needed when working in a team and the state can be updated by any of the team members
* Enabled versioning if the storage where you store the state file, supports it. Versioning is great for backups and roll-backs in case of an issue.

### Cheat Sheet

* Initialize terraform: `terraform init`
* See what Terraform will execute if running apply: `terraform plan`
* Apply Terraform configuration/code: `terraform apply`
* Cleanup, remove Terraform generated resources: `terraform destroy`

* Dependency graph: `terraform graph`

#### State

* Show state: `terraform show`
* List resources from the state: `terraform state list`
* Rename resource: `terraform state mv`
* Import existing infrastructure into state: `terraform import`

#### Variables

* Pass var: `terraform -var`
* Pass vars file: `terraform -var-file`

* List all outputs: `terraform output`
* Get specific output: `terraform output <OUTPUT_VAR>`

#### Data sources

* Get data: `data.<PROVIDER_AND_TYPE>.<NAME>.<ATTRBIUTE>`

#### Backends

* Use variables in a remote backend: `terraform init -backend-config=some_backend_partial_conf.hcl`

#### Workspaces

* Create a new workspace: `terraform workspace new <WORKSPACE_NAME>`
* Show current workspace: `terraform workspace show`

#### Productivity

* Console: `terraform console`
