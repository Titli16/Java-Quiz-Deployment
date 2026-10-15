# Java Quiz Application — Deployment and Production Phase

## Project summary
A console-based Java multiple-choice quiz with 10 questions, four options per question, answer checking, score and percentage calculation, input validation, and replay functionality.

## Requirements
- Java Development Kit (JDK), Java 8 or later recommended
- Terminal or VS Code

## Compile and run
```bash
javac QuizApplication.java
java QuizApplication
```

## Test checklist
- Choose a correct option.
- Choose an incorrect option.
- Enter text instead of a number.
- Enter 0 and 5 to test range validation.
- Complete the quiz and verify score/percentage.
- Test replay with `yes` and exit with `no`.

## Deployment status
This is currently a local console application. Uploading this repository shares the source code; it does not make the quiz a hosted web application. A clean-environment test should be performed before distribution. Only claim staging or production deployment as completed after actually performing and verifying it.

## Security and dependencies
The basic project uses core Java and does not require external libraries or a database. Do not commit passwords, tokens, or personal information. If the project is extended into an online application, add appropriate authentication, secure configuration, monitoring, and backup procedures.

## Repository URL
Add your actual GitHub repository URL after creating and uploading the repository.
