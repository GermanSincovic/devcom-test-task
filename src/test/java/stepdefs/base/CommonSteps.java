package stepdefs.base;

import io.cucumber.java.After;
import tools.driver.DriverManager;

public class CommonSteps extends BaseSteps {

  @After
  public void tearDown() {
    DriverManager.stop();
  }
}
