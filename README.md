## Course: DevOps CA3
## Author: [Dehinde Shogbanmu]
## Student No: X00078774
## Date: [22-12-2024]
## Project Name: Calculator Web Application
## Overview
This project is a simple Calculator Application built with Java, managed using Gradle. The project demonstrates essential CI/CD practices such as clean code structure, unit testing, security, and deployment via pipeline implementation using Azure DevOps.

Key highlights of this project:
- Minimum Functional Features: A CalculatorWebAppApplication class.
- CI/CD Pipeline: Automated build and test using Azure DevOps Pipeline.
- Testing: Unit tests implemented with JUnit 5, Performance tests with JMeter and UAT test with Selenium to ensure reliability.
- Gradle for Dependency Management: Streamlined builds and task configuration.

## Technologies Used
- Programming Language: Java Version 17
- Build Tool: Gradle 8.11.1
- Testing Framework: JUnit 5, JMeter, and Selenium
- CI/CD Tool: Azure DevOps Pipeline
- Version Control: Azure DevOps Repo with .gitignore configured
- IDE: Visual Studio Code
- Git commands
- Web application framework: SpringBoot
- Code Analysis: SonarQube
- Security: OWASP Check and Microsoft Security DevOps

## Local Development Setup
### Step 1: Clone the Repository
Clone the repository from GitHub using the following command in your terminal or command prompt: git clone <repository-url>
cd <repository-directory>
### Step 2: Configure Gradle
Navigate to the project directory and run the following command to configure Gradle: ./gradlew clean build
### Step 3: Run the Application
Run the application using the following command: ./gradlew bootRun

## Application
 ### Calculator

## CI/CD Pipeline Implementation
The CI/CD pipeline is implemented using Azure DevOps. The pipeline consists of the following stages:
- Build
- Code Analysis
- Security Scanning
- Dependency Security
- Deploy
### Step 1: Configure Azure DevOps
Create a new Azure DevOps project and configure the pipeline using the a YAML file in azure-pipelines
### Step 2: Save and Run the Pipeline
Run the pipeline by clicking the "Run pipeline" button in Azure DevOps.
### Step 3: Verify the Pipeline
Verify the pipeline by checking the stages as outlined above with in the summary sections.

## Testing Strategy
To ensure the code is reliable and maintainable, I implemented the following testing strategy:
- Unit Tests: Write unit tests for operand operations to ensure it works as expected using JUnit 5.
- Performance Test: write a test plan to test to ensure page response using JMeter.
- UAT Test: CalculateWorkFlowTest to calculate operand operations via the web application using Selenium.
- Test files are located at src/test/java/com/example/calculator/.
- Cover key functionality such as:
    - Add operand.
    - Subtract operand.
    - Multiply operand.
    - Divide operand.
- Run unit test using ./gradlew clean test
- Run performance test using ./gradlew bootRun and start test on JMeter
- Run UAT test using ./gradlew bootRun on one terminal and ./gradlew test --tests CalculatorWorkflowTest on another terminal.

## Troubleshooting Guide
If you encounter any issues during the pipeline run, refer to the following troubleshooting guide:
- Check the pipeline logs for any errors or warnings.
- Verify that the Gradle wrapper file is correctly configured.
- Ensure that the JDK version and architecture match the pipeline settings.
- Ensure the Sonarkeys and other API keys are configures properly
- Verify that the plugins, dependencies and test are properly included in build.gradle

