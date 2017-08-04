package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by i.mescheryakov on 14.07.2017.
 */
public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void groupPage() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))) {
      return;
    }
    click(By.linkText("groups"));
  }

  public void homePage() {
    if (isElementPresent(By.id("maintable"))) {
      return;
    }
      click(By.linkText("home"));
  }
  public void addNewPage() {
    if (isElementPresent(By.tagName("h1")) &&
            wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry") &&
            isElementPresent(By.tagName("label")) &&
            wd.findElement(By.tagName("label")).getText().equals("Group")) {
      return;
    }
    click(By.linkText("add new"));
  }
}
