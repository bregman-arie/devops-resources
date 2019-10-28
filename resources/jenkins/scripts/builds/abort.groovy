Jenkins.instance.getItemByFullName("<JOB_NAME>").getBuildByNumber(<BUILD_NUMBER>).finish(hudson.model.Result.ABORTED, new java.io.IOException("Aborting build")); 
