
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
                echo 'Compiling Java application'
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
                echo 'Packaging Java application'
                sh 'mvn package'

                archiveArtifacts artifacts: 'target/*.jar',
                                 fingerprint: true
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Building Docker image'

                sh 'docker build -t java-automation-app:latest .'
            }
        }
    }

    post {
        success {
            echo 'Java CI/CD Pipeline completed successfully!'
            echo 'Docker image created successfully!'
        }

        failure {
            echo 'Pipeline failed. Check the Console Output.'
        }
    }
}
