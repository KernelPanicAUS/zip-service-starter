#!groovy
pipeline {
    agent { label 'codebuilder' }
    stages {
        stage('build') {
            steps {
                sh 'npm --version'
            }
        }
    }
}
