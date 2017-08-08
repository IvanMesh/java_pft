package ru.stqa.pft.addressbook.tests;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.testng.Assert.*;

/**
 * Created by i.mescheryakov on 17.07.2017.
 */
public class ContactDelitionTests extends TestBase {

  @BeforeMethod
  public void ensurePrecondition() {
    app.goTo().homePage();
    if (app.contact().all().size() == 0) {
      app.contact().create(new ContactData().withName("Иван").withLastname("Мещеряков").withGroup("test1"));
    }
  }
  
  @Test (enabled = true)
  public void testContactDelition() {

    Contacts before = app.contact().all();
    ContactData deletedContact = before.iterator().next();
    int index = before.size() - 1;
    app.contact().delete(deletedContact);
    assertThat(app.contact().count(), equalTo(before.size() + 1));
    Contacts after = app.contact().all();
    assertThat(after, equalTo(before.without(deletedContact)));
  }
}
