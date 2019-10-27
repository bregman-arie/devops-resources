jobs = jenkins.model.Jenkins.instance.getJobNames()

println "Number of jobs: " + jobs.size()
println "\nList of jobs:\n" + jobs.join("\n")


/*

Another version:

jobs = jenkins.model.Jenkins.instance.items

println "Number of jobs: " + jobs.size()
println "\nList of jobs:\n"

jobs.each { job -> println job.name }

*/
