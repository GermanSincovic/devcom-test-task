package models;

import org.openqa.selenium.WebElement;

public class GoogleResult {

  private WebElement webElement;

  private String titleShort;

  private String domain;

  private String link;

  public WebElement getWebElement() {
    return webElement;
  }

  public GoogleResult setWebElement(WebElement webElement) {
    this.webElement = webElement;
    return this;
  }

  public String getTitleShort() {
    return titleShort;
  }

  public GoogleResult setTitleShort(String titleShort) {
    this.titleShort = titleShort;
    return this;
  }

  public String getDomain() {
    return domain;
  }

  public GoogleResult setDomain(String domain) {
    this.domain = domain;
    return this;
  }

  public String getLink() {
    return link;
  }

  public GoogleResult setLink(String link) {
    this.link = link;
    return this;
  }
}
