package tools.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class WebDriverFactory {

  public static WebDriver createWebDriver() {
    WebDriver driver;
    String webDriver = System.getProperty("browser", "chrome");
    switch (webDriver) {
      case "firefox":
        driver = new FirefoxDriver(new FirefoxOptions());
        return setDriverCommonConfiguration(driver);
      case "chrome":
      default:
        driver = new ChromeDriver(new ChromeOptions());
        return setDriverCommonConfiguration(driver);
    }
  }

  private static WebDriver setDriverCommonConfiguration(WebDriver driver) {
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    return driver;
  }

  private WebDriverFactory() {}
}
