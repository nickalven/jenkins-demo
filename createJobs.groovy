pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/nickalven/ThemeParkRide.git'
                    }
                    branch 'master'
                }
            }
        }
    }