package stepdefs.base;

import org.openqa.selenium.WebDriver;
import tools.driver.DriverManager;

public abstract class BaseSteps {

  public final WebDriver driver = DriverManager.getDriver();
}
