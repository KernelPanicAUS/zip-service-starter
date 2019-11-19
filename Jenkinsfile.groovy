pipeline {
    agent {
        label 'codebuild'
        docker { image 'node:7-alpine' }
    }
    stages {
        stage('build') {
            steps {
                sh 'npm --version'
            }
        }
    }
}
