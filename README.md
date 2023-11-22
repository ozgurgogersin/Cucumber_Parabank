# Parabank Project - Automated Testing with Cucumber

## 1. Parallel Login Testing Demo With   <img src="https://github.com/devicons/devicon/blob/master/icons/cucumber/cucumber-plain.svg"  alt="Cucumber" width="40" height="40"/>&nbsp;&nbsp;&nbsp;

### Feature: Login Functionality with Parallel 

This feature file, `ParallelLogin.feature`, is designed to demonstrate the parallel execution of the login functionality with different browsers. The goal is to showcase how the Cucumber tests can run concurrently across multiple browsers, allowing for efficient and speedy test execution.

### Scenario Outline:

The scenario outlined in this feature file covers the login functionality using valid test data for various browsers, including Chrome, Firefox, and Edge. The use of scenario outlines and examples enables the same scenario to be executed in parallel with different sets of data.

#### Examples:

| `<browser>` | `<userName>`   | `<passWord>`   |
|-------------|-------------|------------|
| <img src="https://www.google.com/chrome/static/images/chrome-logo.svg"  alt="Chrome" width="40" height="40"/>&nbsp;&nbsp;&nbsp;| ozgurTest22 | Qwerty!123 |
| <img src="https://upload.wikimedia.org/wikipedia/commons/a/a0/Firefox_logo%2C_2019.svg"  alt="Firefox" width="40" height="40"/>&nbsp;&nbsp;&nbsp;| ozgurTest22 | Qwerty!123 |
| <img src="https://upload.wikimedia.org/wikipedia/commons/7/7e/Microsoft_Edge_logo_%282019%29.png"  alt="Edge" width="40" height="40"/>&nbsp;&nbsp;&nbsp;| ozgurTest22 | Qwerty!123 |

### Running the Tests:

To run the tests in parallel, use the provided TestNG runners configured for parallel execution.

# 2. Bill Pay Functionality

## Feature: Bill Pay Functionality

This feature file, `BillPay.feature`, covers scenarios for testing the bill pay functionality using various sets of data.

### Scenario Outline: Get Login

This scenario outlines the steps to log in with valid credentials and asserts the successful login.

#### Examples:

| userName    | passWord   |
|-------------|------------|
| ozgurTest22 | Qwerty!123 |

### Scenario Outline: Testing Bill Pay Function

This scenario outlines the steps to test the bill pay function with different sets of data.

#### Examples:

| PayeeName        | Amount |
|------------------|--------|
| Electricity Bill | 85     |
| Water Bill       | 45     |
| Gas Bill         | 150    |
| Internet Bill    | 60     |

# 3. Jenkins Integration  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Jenkins_logo.svg/226px-Jenkins_logo.svg.png?20120629215426" alt="Jenkins" width="40" height="40"/>&nbsp;&nbsp;&nbsp;

The `_03_RunnerForBillPayJenkins` runner class is configured to execute Cucumber tests within the Jenkins integration, ensuring a smooth and automated testing process as part of our continuous integration and delivery workflow.
