The following is the job definition of a gate to test changes to job definitions

- job:
    name: 'gate-jenkins-jjb'
    defaults: job_defaults
    concurrent: true
    parameters:
        - string: { name: GERRIT_REFSPEC, default: +refs/heads/master }
        - string: { name: GERRIT_BRANCH,  default: origin/master }
        - string: { name: DEBUG,  default: '' }
    description: |
        Managed by Jenkins Job Builder. Do not edit via web.
        <p>
        Gate against changes to job definitions
        </p>
    node: <node_label_CHANGEME>
    properties:
        - build-discarder:
            days-to-keep: 14
            artifact-days-to-keep: 14
    scm:
        - codeng-scm:
              project: '<project_that_holds_jobs_CHANGEME>
              branch: "master"
              refspec: "$GERRIT_REFSPEC"
    triggers:
        - trigger-rhos-qe-jenkins:
              file_paths:
                  - compare-type: 'REG_EXP'
                    pattern: '(jobs/.*|bin/.*|requirements\.txt)'
    builders:
        - shell: |
            #!/bin/bash
            set -euo pipefail
            IFS=$'\n\t'
            [ "${DEBUG:-0}" != 0 ] && set -x
            PIP_LOG=$WORKSPACE/pip.log

            tox -e jobs
    publishers:
        - archive:
            artifacts: '**/*.log'

Also, add this in tox.ini:

[testenv:jobs]
commands =
    {[testenv]commands}
    mkdir -p out-xml
    bash -c "XDG_CACHE_HOME={toxworkdir}/.jjb_cache jenkins-jobs --ignore-cache test --config-xml -o out-xml --recursive jobs 2>{envname}.log || \{ >&2 cat {envname}.log; exit 1; \}"
