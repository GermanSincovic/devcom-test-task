package stepdefs;

import io.cucumber.java.en.When;
import models.pages.GoogleResultPage;
import org.openqa.selenium.NotFoundException;
import stepdefs.base.BaseSteps;

public class GoogleResultSteps extends BaseSteps {

  public GoogleResultPage googleResultPage = new GoogleResultPage(driver);

  @When("I click on the YouTube link")
  public void clickOnYouTubeLink() {
    googleResultPage.getResultTitles().stream()
        .filter(we -> we.getText().equalsIgnoreCase("YouTube"))
        .findFirst()
        .orElseThrow(NotFoundException::new)
        .click();
  }
}
