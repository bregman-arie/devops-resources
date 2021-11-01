# Terraform

## Terraform Resources

https://project-awesome.org/shuaibiyy/awesome-terraform
[Terraform Script Builder](https://terraparty.com) | export valid Terraform scripts using UI

## Cloud

Name | Comments
:------|:------:
[terraformer](https://github.com/GoogleCloudPlatform/terraformer) | "A CLI tool that generates tf/json and tfstate files based on existing infrastructure (reverse Terraform)."
[terraforming](https://github.com/dtan4/terraforming) | "Export existing AWS resources to Terraform style (tf, tfstate)"

### Best Practices

#### tfstate

* Don't edit it manually. tfstate was designed to be manipulated by terraform and not by users directly.
* Store it in secured location (since it can include credentials and sensitive data in general)
* Backup it regularly so you can roll-back easily when needed 
* Store it in remote shared storage. This is especially needed when working in a team and the state can be updated by any of the team members
* Enabled versioning if the storage where you store the state file, supports it. Versioning is great for backups and roll-backs in case of an issue.
