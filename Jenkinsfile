
pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    environment {
        DOCKER_IMAGE = 'sapavath/java-automation-app'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code'
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
                echo 'Running Maven test phase'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
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
                sh 'docker build -t $DOCKER_IMAGE:latest .'
            }
        }

        stage('Docker Hub Login & Push') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-credentials',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    sh '''
                        printf '%s' "$DOCKER_PASS" | docker login \
                            -u "$DOCKER_USER" --password-stdin

                        docker push "$DOCKER_IMAGE:latest"

                        docker logout
                    '''
                }
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline completed successfully!'
            echo 'JUnit Test Reports published successfully!'
            echo 'Docker image pushed to Docker Hub!'
        }

        failure {
            echo 'Pipeline failed. Check Console Output.'
        }
    }
}
