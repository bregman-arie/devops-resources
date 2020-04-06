// Remove builds older than 5 days

builds = Jenkins.instance.getItem('test2').getBuilds()
def daysToKeep = 5
 
builds.each{ build ->
  def runningSince = groovy.time.TimeCategory.minus( new Date(), build.getTime() ).getDays();
  if (runningSince > daysToKeep){
    build.delete();
    println "Build " + build + "was deleted since it was built " + runningSince + " days ago";
  }
}  
