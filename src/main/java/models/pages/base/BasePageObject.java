package models.pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePageObject {

  protected WebDriver driver;
  protected String title;

  public BasePageObject(WebDriver driver){
    this.driver = driver;
    this.title = driver.getTitle();
    PageFactory.initElements(driver, this);
  }

  public void waitUntilVisible(WebElement element, int seconds) {
    new WebDriverWait(driver, Duration.ofSeconds(seconds))
            .until(ExpectedConditions.visibilityOf(element));
  }

  public String getTitle() {
    return this.title;
  }

}
