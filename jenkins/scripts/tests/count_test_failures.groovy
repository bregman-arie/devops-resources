import jenkins.*
import jenkins.model.*
import hudson.*
import hudson.model.*
  
def jobNameStartsWith = 'DFG-network-neutron'
def textToMatch = "Traceback"

Jenkins.instance.items.findAll { it.displayName.startsWith(jobNameStartsWith) }
.each { job ->   
  if(job.builds) {    
    def build = job.isBuilding() ? job.builds[1] : job.builds[0]

    def log = build.logFile.text
    def regexPattern = "(?i).*${textToMatch}.*"
    def summary = log =~ /${regexPattern}/
    println "${summary.size()}: $job.displayName"
  }
}
return ""
