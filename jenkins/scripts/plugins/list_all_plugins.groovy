Jenkins.instance.pluginManager.plugins.sort { it.getShortName() }.each{ plugin -> println "${plugin.getShortName()}:${plugin.getVersion()}" }
