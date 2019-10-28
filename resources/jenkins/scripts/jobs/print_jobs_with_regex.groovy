jobs = jenkins.model.Jenkins.instance.items.findAll { job -> job.name =~ /network.*10_((?!SRIOV).)*$/ }

println "Number of jobs: " + jobs.size() + "\n"

jobs.each { job -> println job.name }
