package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

/**
 * Created by i.mescheryakov on 17.07.2017.
 */
public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePrecondition() {
    app.goTo().homePage();
    if (app.contact().list().size() == 0) {
      app.contact().create(new ContactData().withName("Иван").withLastname("Мещеряков").withGroup("test1"));
    }
  }

  @Test (enabled = true)
  public void testContactModification() {

    Set<ContactData> before = app.contact().all();
    ContactData modifiedContact = before.iterator().next();
    int index = before.size() - 1;
    ContactData contact = new ContactData().withId(before.get(index).getId()).withName("Иван").withLastname("Мещеряков");
    app.contact().modify(index, contact);
    Set<ContactData> after = app.contact().all();
    Assert.assertEquals(after.size(), before.size());

    before.remove(index);
    before.add(contact);
    Assert.assertEquals(after, before);
  }

}
