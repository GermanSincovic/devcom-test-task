# Java Automation Framework

This is a small automation framework created to support Java-based test automation for web applications. The framework is capable of running tests on Chrome and Firefox browsers. It is built using the Page Object Model design pattern and leverages Selenium WebDriver, Maven, JUnit/TestNG, and Cucumber.

## Setup and Execution

### Prerequisites

Make sure you have the following software installed on your system:

- Java Development Kit (JDK)
- Maven
- Chrome browser
- Firefox browser

### Clone the Repository

`git clone https://github.com/GermanSincovic/devcom-test-task`

### Build the Project

Navigate to the project directory and execute the following command to build the project and download the dependencies:

`mvn clean install`

### Configuration

The framework supports running tests on both Chrome and Firefox browsers. By default, tests are executed on Chrome. To run tests on Firefox, set the `browser` environment variable to `firefox`.

### Running Tests

Execute the following command to run the tests:

`mvn test`

To run tests on Firefox, use the following command:

`mvn test -Dbrowser=firefox`

The tests will be executed using the specified browser.
