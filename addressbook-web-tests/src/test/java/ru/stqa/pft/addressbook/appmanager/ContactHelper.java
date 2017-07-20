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

  public void fillNewContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getИмя());
    type(By.name("middlename"), contactData.getОтчество());
    type(By.name("lastname"), contactData.getФамилия());
    type(By.name("nickname"), contactData.getНик());
    type(By.name("address"), contactData.getАдрес());
    type(By.name("mobile"), contactData.getТелефон());
    type(By.name("email"), contactData.getПочта());
  }

    public void gotoAddNewPage() {
    click(By.linkText("add new"));
  }

  public void initContactDeletion() {
    click(By.xpath("//div/div[4]/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void initContactModification() {
    click(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }
}
