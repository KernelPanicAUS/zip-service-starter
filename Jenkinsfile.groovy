pipeline {
  agent {
    label 'codebuilder'
    docker { image 'node:7-alpine' }
  }
  stages {
    stage('Build') {
      steps {
        sh 'node --version'
      }
    }
  }
}
