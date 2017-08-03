package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by i.mescheryakov on 17.07.2017.
 */
public class ContactModificationTests extends TestBase {

  @Test (enabled = false)
  public void testContactModification() {

    app.goTo().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData( "Иван",  "Мещеряков",  "МО, Ленинский р-н, пос. Развилка", "79998138083", "imeshcheriyakov@gmail.com", "test1"), true);
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().initContactModification(before.size() - 1);
    ContactData contact = new ContactData(before.get(before.size() - 1).getId(),"Иван",  "Мещеряков",  "МО, Ленинский р-н, пос. Развилка", "79998138083", "imeshcheriyakov@gmail.com", null);
    app.getContactHelper().fillNewContactForm(contact, false);
    app.getContactHelper().submitContactModification();
    app.goTo().gotoHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(after, before);
  }
}
