def job = jenkins.model.Jenkins.instance.getItem('dashboard');
def currentName = job.name;
def newName = 'test2';

job.renameTo(newName);

println "\nRenamed " + currentName + " to " + newName;
