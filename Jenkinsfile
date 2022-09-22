def gv

pipeline {
    agent none
    stages {
        stage("init") {
            steps {
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage("build") {
            steps {
                script{
                    gv.buildApp()
                }
            }
        }
    }
}
