pipeline {
    agent any

    environment {
        INPUT = '121'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                sh 'javac java.java'
            }
        }

        stage('Execute') {
            steps {
                sh 'echo "$INPUT" | java java'
            }
        }
    }
}
