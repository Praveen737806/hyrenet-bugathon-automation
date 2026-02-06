🚀 HyreNet BugAThon – Selenium Automation Framework

This repository contains a Java-based Selenium Automation Framework developed for the HyreNet BugAThon – Quality Assurance Automation Challenge.
The framework is designed using Page Object Model (POM) with TestNG, Maven, and Extent Reports to automate critical workflows of the HyreNet platform and support efficient bug discovery and reporting.

📌 Project Objectives

Automate core functionalities of the HyreNet platform

Identify functional, UI, and validation bugs

Provide a scalable and maintainable automation framework

Generate professional HTML test execution reports

🛠️ Tech Stack

Java

Selenium WebDriver

TestNG

Maven

WebDriverManager

Extent Reports

Git & GitHub

📂 Project Structure
hyrenet-bugathon-automation
│
├── pom.xml
├── README.md
├── docs
│   └── BUG_REPORT.csv
│
├── reports
│   └── ExtentReport.html
│
└── src
    └── test
        ├── java
        │   ├── base
        │   │   └── BaseTest.java
        │   ├── pages
        │   │   ├── LoginPage.java
        │   │   └── AssessmentPage.java
        │   ├── tests
        │   │   ├── LoginTest.java
        │   │   └── AssessmentTest.java
        │   └── utils
        │       ├── ExtentManager.java
        │       └── TestListener.java
        └── resources
            └── testng.xml

🔑 Test Credentials
URL      : https://app.hyrenet.in/
Email    : hyrenet+bugathon@guvi.in
Password : hyrenettest@123

⚙️ Prerequisites

Java JDK 8 or above

Maven

Google Chrome Browser

Git

▶️ How to Run the Tests

Clone the repository:

git clone https://github.com/Praveen737806/hyrenet-bugathon-automation.git


Navigate to project folder:

cd hyrenet-bugathon-automation


Run tests:

mvn clean test

📊 Test Report

After execution, open:

reports/ExtentReport.html


This file contains:

Passed/Failed test cases

Execution time

Error details

🧪 Automated Test Scenarios

Login with valid credentials

Navigation to assessment section

Click Create Assessment

🐞 Bug Documentation

All identified bugs are documented in:

docs/BUG_REPORT.csv


Each bug contains:

Bug ID

Description

Steps to Reproduce

Expected Result

Actual Result

Severity

🎥 Execution Proof

A short execution video demonstrating:

Running automation

Chrome browser launch

Build success

Report generation

(Video link submitted via BugAThon form)

🏆 Highlights

Page Object Model (POM) Design

Explicit Waits & JavaScript fallback handling

Extent HTML Reporting

TestNG Listener Integration

Maven-based execution

👤 Author

Praveen
GitHub: https://github.com/Praveen737806
