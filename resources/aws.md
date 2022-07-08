# AWS

## Infrastructure

Name | Comments
:------|:------:
[infrastructure.aws](https://infrastructure.aws) | AWS Infrastructure Overview
[Regions and Availability Zones](https://aws.amazon.com/about-aws/global-infrastructure/regional-product-services) | See services list per region and AZ

## Tools and Projects

Name | Comments
:------|:------:
[Cloud Mapper](https://github.com/duo-labs/cloudmapper) | "analyze your Amazon Web Services (AWS) environments""
[EC2 Instances Info](https://www.ec2instances.info) | "Easy Amazon EC2 Instance Comparison"
[amazon-redshift-utils](https://github.com/awslabs/amazon-redshift-utils) | "Contains utilities, scripts and view which are useful in a Redshift environment"
[Cloudcraft](https://www.cloudcraft.co) | Automated AWS diagram mapping of your cloud resources.
[nOps](https://www.nops.io/devops/) | "for fast-moving DevOps teams helping them ... monitor, analyze, and manage provisioned cloud workloads.", **Not Free.**
[EC2Instances.info](https://instances.vantage.sh) | "Easy Amazon EC2 Instance Comparison"

## Blog Posts & Articles

Name | Comments
:------|:------:
[The Hitchhiker’s Guide to Redshift — part 1: With great power come performance issues](https://blog.atomdata.io/the-hitchhikers-guide-to-redshift-part-1-with-great-power-comes-performance-issues-748d293e0b18) | 

## IaC

Name | Comments
:------|:------:
[terraformer](https://github.com/GoogleCloudPlatform/terraformer) | "A CLI tool that generates tf/json and tfstate files based on existing infrastructure (reverse Terraform)."
[terraforming](https://github.com/dtan4/terraforming) | "Export existing AWS resources to Terraform style (tf, tfstate)"

## Videos

Name | Comments
:------|:------:
[Amazon Redshift Tutorial](https://www.youtube.com/watch?v=fc5WPKnbam8) | Edureka, 2018

## Certificates

Name | Comments
:------|:------:
[DevOpsBit Cloud Practitioner Summary](http://devopsbit.com/aws-cloud-practitioner) | 2020

## Interview Questions

Name | Description
:------|:------:
[devops-interview-questions repository](https://github.com/bregman-arie/devops-interview-questions/#aws) | Over 100 questions
[AWS interview questions and answers](https://www.besanttechnologies.com/aws-interview-questions-and-answers) | 250 AWS interview questions

### Best Practices

#### IAM

* Set up MFA
* Delete root account access keys
* Create IAM users instead of using root for daily management

### Cheat Sheet

### IAM

* List users: `aws iam list-users`

### EC2

* List instances: `aws ec2 describe-instances`
* Remove security group rules:

```
aws ec2 revoke-security-group-ingress \
    --group-name someHTTPSecurityGroup
    --protocol tcp \
    --port 80 \
    --cidr 0.0.0.0/0`
```

* Add security group rules:

```
aws ec2 authorize-security-group-ingress \
    --group-name someHTTPSecurityGroup
    --protocol tcp \
    --port 80 \
    --cidr 0.0.0.0/0
```

### RDS

* Encryption in PostgreSQL: `rds.force_ssl=1 (parameter groups)`
* Encryption in MySQL: `GRANT USAGE ON *.* TO 'mysqluser'@'%' REQUIRE SSL;`

