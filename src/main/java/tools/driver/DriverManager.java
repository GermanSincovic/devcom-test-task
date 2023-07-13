package tools.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

  private static WebDriver driver;

  private DriverManager() {
  }

  public static WebDriver getDriver() {
    if (driver == null) {
      driver = WebDriverFactory.createWebDriver();
    }
    return driver;
  }

  public static void stop() {
    if (driver != null) {
      driver.quit();
      driver = null;
    }
  }

}
