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

  public void fillNewContactForm(ContactData contactDate) {
    type(By.name("firstname"), contactDate.getИмя());
    type(By.name("middlename"), contactDate.getОтчество());
    type(By.name("lastname"), contactDate.getФамилия());
    type(By.name("nickname"), contactDate.getНик());
    type(By.name("address"), contactDate.getАдрес());
    type(By.name("mobile"), contactDate.getТелефон());
    type(By.name("email"), contactDate.getПочта());
  }

    public void gotoAddNewPage() {
    click(By.linkText("add new"));
  }

  public void initContactDeletion() {
    click(By.xpath("//div/div[4]/form[2]/div[2]/input"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }
}
