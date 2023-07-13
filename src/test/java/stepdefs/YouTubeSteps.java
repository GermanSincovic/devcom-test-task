package stepdefs;

import io.cucumber.java.en.Then;
import models.pages.YouTubePage;
import org.junit.Assert;
import stepdefs.base.BaseSteps;

public class YouTubeSteps extends BaseSteps {

  public YouTubePage youTubePage = new YouTubePage(driver);

  @Then("I should be redirected to the YouTube page")
  public void checkYouTubePageIsOpened() {
    Assert.assertTrue("Title does not contain: YouTube", youTubePage.getTitle().contains("YouTube"));
    Assert.assertTrue("Not YouTube URL", driver.getCurrentUrl().contains("youtube.com"));
  }
}
