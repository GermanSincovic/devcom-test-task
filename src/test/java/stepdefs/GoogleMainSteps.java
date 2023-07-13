package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import models.pages.GoogleMainPage;
import org.junit.Assert;
import stepdefs.base.BaseSteps;

public class GoogleMainSteps extends BaseSteps {

  public GoogleMainPage googleMainPage = new GoogleMainPage(driver);

  @Given("I am on the Google homepage")
  public void openGoogleSearchPage() {
    googleMainPage.open();
    Assert.assertTrue("Not Google URL", driver.getCurrentUrl().contains("google.com"));
  }

  @When("I search for {string}")
  public void makeSearchQuery(String query) {
    googleMainPage.inputSearchQuery(query);
    googleMainPage.submitQuery();
  }

}
