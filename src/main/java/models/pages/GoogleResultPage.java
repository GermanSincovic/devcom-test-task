package models.pages;

import models.pages.base.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GoogleResultPage extends BasePageObject {

  @FindBy(tagName = "h3")
  private List<WebElement> resultTitles;

  @FindBy(how = How.ID, id = "pnnext")
  private WebElement buttonNextPage;

  @FindBy(how = How.ID, id = "pnprev")
  private WebElement buttonPrevPage;

  public GoogleResultPage(WebDriver driver) {
    super(driver);
  }

  public List<WebElement> getResultTitles() {
    return resultTitles;
  }

  public WebElement getButtonNextPage() {
    return buttonNextPage;
  }

  public WebElement getButtonPrevPage() {
    return buttonPrevPage;
  }
}
