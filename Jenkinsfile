def gv

pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage("build") {
            steps {
                script{
                    gv.myscript('TEST') {
                        def y = "My variable"
                        print y
                    }
                }
            }
        }
    }
}
