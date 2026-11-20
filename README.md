
# Java Automation CI/CD Project 🚀

An automated Continuous Integration and Continuous Deployment (CI/CD) pipeline for a Java application using Jenkins, Maven, JUnit 5, Docker, GitHub, and Docker Hub.

## 📌 Project Overview

This project demonstrates how to automate the Java application development workflow using DevOps tools.

Whenever code is pushed to GitHub, a GitHub Webhook triggers Jenkins automatically. Jenkins then builds, tests, packages, and creates a Docker image before pushing it to Docker Hub.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java 17 | Application development |
| Maven | Build automation |
| JUnit 5 | Automated testing |
| Jenkins | CI/CD pipeline |
| Git & GitHub | Version control |
| GitHub Webhooks | Automatic build triggers |
| Docker | Containerization |
| Docker Hub | Image repository |

## 🏗️ Project Architecture

```text
Developer
    |
    v
GitHub Repository
    |
    v
GitHub Webhook
    |
    v
Jenkins Pipeline
    |
    v
Maven Build
    |
    v
JUnit 5 Testing
    |
    v
Maven Packaging
    |
    v
Docker Image Build
    |
    v
Docker Hub Push
    |
    v
Docker Container Execution
```

## ⚙️ Jenkins Pipeline Stages

1. **Checkout:** Retrieves source code from GitHub.
2. **Build:** Compiles the Java application using Maven.
3. **Test:** Executes automated JUnit 5 test cases.
4. **Package:** Generates the application JAR file.
5. **Docker Build:** Creates a Docker image.
6. **Docker Hub Login & Push:** Pushes the image to Docker Hub.

## 🧪 Automated Testing

JUnit 5 is used to execute automated test cases.

Current test cases:
- Addition test
- Subtraction test

Latest verified test results:

```text
Tests run: 2
Failures: 0
Errors: 0
Skipped: 0
BUILD SUCCESS
```

## 🐳 Docker Hub

Docker image:

`sapavath/java-automation-app:latest`

Pull the image:

```bash
docker pull sapavath/java-automation-app:latest
```

Run the container:

```bash
docker run --rm sapavath/java-automation-app:latest
```

## 🚀 Run Locally

Clone the repository:

```bash
git clone https://github.com/Jeevana4545283/java-automation-cicd.git
```

Navigate to the project:

```bash
cd java-automation-cicd
```

Build the application:

```bash
mvn clean package
```

Run automated tests:

```bash
mvn test
```

## 📂 Project Structure

```text
java-automation-cicd/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── App.java
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── automation/
│                   └── AppTest.java
│
├── Dockerfile
├── Jenkinsfile
├── pom.xml
└── .gitignore
```

## ✅ Project Achievements

- Implemented an automated Jenkins CI/CD pipeline.
- Integrated GitHub with Jenkins using webhooks.
- Configured Maven build automation.
- Implemented JUnit 5 automated testing.
- Containerized the Java application using Docker.
- Published Docker images to Docker Hub.
- Successfully executed the Docker container.
- Verified successful automatic Jenkins builds.

## 👩‍💻 Author

**Jeevana Sapavath**

GitHub: https://github.com/Jeevana4545283
