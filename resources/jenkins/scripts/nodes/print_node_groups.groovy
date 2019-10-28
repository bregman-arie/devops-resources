import jenkins.model.Jenkins;

def list = []
def description = ''

def slave_label_map = [:]
for (slave in Jenkins.instance.slaves) {
    description = slave.getNodeDescription()
    if (description.contains('<#{') && description.contains('}#>')) {
        words = slave.getLabelString().split()
        def labelListForSlave = []
        words.each() {
            labelListForSlave.add(it);
            list.add(it)
        }
        slave_label_map.put(slave.name, labelListForSlave)
    }
}
list.unique()
