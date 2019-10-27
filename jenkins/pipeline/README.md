## Pipeline in a nutshell

* A moment of history: Pipeline plugin was developed after the success
  of Build Flow Plugin and it was first called 'Workflow Plugin'.

* It's considered to be better than freestyle type because it's implemented
  in code, survives restarts and can be extended easily.

* Pipeline supports two syntaxes, Declarative and Scripted.

* [Here](https://github.com/bregman-arie/jenkins-goodies/blob/master/pipeline/basic_declarative_pipeline) is an example for simple declarative pipeline

    * 'step' is a single task and tells Jenkins what to do.
    * 'stage' is a collection of steps. Example for stages: 'Test', 'Build', 'Deploy'.
    * 'node' allocates an executor and workspace for executing the steps in all the stages

* To use Jenkins pipeline, you need Jenkins 2 and Pipeline plugin installed.

* Scripted pipeline is written in Groovy.

* You can create a new pipeline by using Jenkins UI or adding a Jenkinsfile in the relevant repository. Using Jenkinsfile is recommended.

* To declare pipeline with UI -> click on 'new item', enter the name, choose 'Pipeline' from type options and click on 'save'.

* You can use https://<my-jenkins>/pipeline-syntax as built-in documentation for generating simple or complex
  pipeline snippets.

* There are several types of variables supported in a pipeline. You can find updated reference on global variables
  here: https://<my-jenkins>/pipeline-syntax/globals

    * env variables are accessible from Groovy code with 'env.<var_name>'.
    * params are read-only variables exposed for you to use in the pipeline.
    * currentBuild variables are set in the context of a specific build

* A reference of the available steps can be found [here](https://jenkins.io/doc/pipeline/steps).
  There is also such reference in your Jenkins instance https://<my-jenkins>/pipeline-syntax/html

* Pipeline examples can be found [here](https://jenkins.io/doc/pipeline/examples)
