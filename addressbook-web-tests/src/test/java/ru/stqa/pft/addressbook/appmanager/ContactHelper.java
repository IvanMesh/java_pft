package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by i.mescheryakov on 14.07.2017.
 */
public class ContactHelper extends HelperBase{

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }


  public void submitNewContactCreation() {
      click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  public void fillNewContactForm(ContactData contactDate) {
    firstname(By.name("firstname"), contactDate.getИмя());
    firstname(By.name("middlename"), contactDate.getОтчество());
    firstname(By.name("lastname"), contactDate.getФамилия());
    firstname(By.name("nickname"), contactDate.getНик());
    firstname(By.name("address"), contactDate.getАдрес());
    firstname(By.name("mobile"), contactDate.getТелефон());
    firstname(By.name("email"), contactDate.getПочта());
  }

  private void firstname(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void gotoAddNewPage() {
    click(By.linkText("add new"));
  }
}
