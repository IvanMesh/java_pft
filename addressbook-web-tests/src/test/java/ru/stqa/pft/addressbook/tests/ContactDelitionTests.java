package ru.stqa.pft.addressbook.tests;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by i.mescheryakov on 17.07.2017.
 */
public class ContactDelitionTests extends TestBase {
  
  @Test
  public void testContactDelition() {

    app.getNavigationHelper().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Иван", "Юрьевич", "Мещеряков", "Slickan", "МО, Ленинский р-н, пос. Развилка", "+7(999)813-80-83", "imeshcheriyakov@gmail.com", null), false);
      }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactDeletion();

  }

}
