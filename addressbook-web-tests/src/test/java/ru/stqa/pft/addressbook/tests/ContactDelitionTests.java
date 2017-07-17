package ru.stqa.pft.addressbook.tests;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by i.mescheryakov on 17.07.2017.
 */
public class ContactDelitionTests extends TestBase {
  
  @Test
  public void testContactDelition() {

    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactDeletion();

  }

}
