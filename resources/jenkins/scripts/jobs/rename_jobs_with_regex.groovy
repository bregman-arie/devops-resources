def jobs = Jenkins.instance.items.findAll { job -> job.name =~ /the_regex/ }
def newNameAddition = 'test2'
    
jobs.each { job ->
    currentName = job.name
    job.renameTo(job.name + newNameAddition);
    println "\nRenamed " + currentName + " to " + currentName + newNameAddition + "\n";
}
