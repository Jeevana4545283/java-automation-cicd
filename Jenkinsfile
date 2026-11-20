
pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Source code checkout from GitHub'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running automated tests'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Java Maven build completed successfully!'
        }
        failure {
            echo 'Build failed. Check the console output.'
        }
    }
}
