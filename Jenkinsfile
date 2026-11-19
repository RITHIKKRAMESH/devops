
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
                sh 'javac Main.java'
            }
        }

        stage('Execute') {
            steps {
                sh 'echo "$INPUT" | java Main'
            }
        }
    }
}

