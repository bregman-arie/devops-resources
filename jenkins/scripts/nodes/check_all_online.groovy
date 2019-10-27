// Check if all slaves are online. Fail the script if not.

int excode = 0

for (slave in hudson.model.Hudson.instance.slaves) {

    if (slave.getComputer().isOffline().toString() == "true"){
     println('The Slave ' + slave.name + " is offline");
     excode++;
    }  
}

if (excode > 0) {
    println("We have a Slave down! I repeat, we have a slave down!");
    return 1;
}
