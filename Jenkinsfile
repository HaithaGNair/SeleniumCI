pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    triggers {
        githubPush()   // Webhook trigger
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/<your-username>/selenium-ci.git'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Reports') {
            steps {
                echo "Test Execution Completed"
            }
        }
    }

    post {
        success {
            echo "✔ Pipeline Successful!"
        }
        failure {
            echo "❌ Pipeline Failed!"
        }
    }
}
