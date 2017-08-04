package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;
import java.util.Set;

/**
 * Created by i.mescheryakov on 17.07.2017.
 */
public class ContactDelitionTests extends TestBase {

  @BeforeMethod
  public void ensurePrecondition() {
    app.goTo().homePage();
    if (app.contact().list().size() == 0) {
      app.contact().create(new ContactData().withName("Иван").withLastname("Мещеряков").withGroup("test1"));
    }
  }
  
  @Test (enabled = true)
  public void testContactDelition() {

    Set<ContactData> before = app.contact().all();
    ContactData deletedContact = before.iterator().next();
    int index = before.size() - 1;
    app.contact().delete(deletedContact);
    Set<ContactData> after = app.contact().all();
    Assert.assertEquals(after.size(), before.size() -1);

    before.remove(deletedContact);
      Assert.assertEquals(before, after);

  }
}
