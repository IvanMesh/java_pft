package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by i.mescheryakov on 14.07.2017.
 */
public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }


  public void submitNewContactCreation() {
      click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillNewContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getИмя());
    type(By.name("middlename"), contactData.getОтчество());
    type(By.name("lastname"), contactData.getФамилия());
    type(By.name("nickname"), contactData.getНик());
    type(By.name("address"), contactData.getАдрес());
    type(By.name("mobile"), contactData.getТелефон());
    type(By.name("email"), contactData.getПочта());
    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }


  public void initContactDeletion() {
    click(By.xpath("//div/div[4]/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();
  }

  public void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  public void initContactModification() {
    click(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }



  public boolean isThereAContact() {

    return isElementPresent(By.name("selected[]"));
  }


  public void createContact(ContactData contact, boolean creation) {
    wd.findElement(By.xpath("//div[@id='nav']//a[.='add new']")).click();
    fillNewContactForm(contact, true);
    submitNewContactCreation();
    wd.findElement(By.xpath("//div[@id='nav']//a[.='home']")).click();
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }
}
