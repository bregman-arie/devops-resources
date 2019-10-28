def jobs = Jenkins.instance.items.findAll { job -> job.name =~ /the_regex/ }
    
jobs.each { job ->
    println job.name
    //job.delete()
}
