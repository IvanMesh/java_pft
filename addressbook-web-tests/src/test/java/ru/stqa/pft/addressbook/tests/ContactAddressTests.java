package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactAddressTests extends TestBase {

  @BeforeMethod
  public void ensurePrecondition() {
    if  (app.db().contacts().size() == 0) {
      app.goTo().homePage();
      app.contact().create(new ContactData().withName("Иван").withLastname("Мещеряков").withGroup("test1"));
    }
  }

  @Test
  public void testContactAddress() {
    app.goTo().homePage();
    ContactData contact = app.contact().all().iterator().next();

    assertThat(contact.getAddress(), equalTo(app.contact().infoFromEditForm(contact).getAddress()));
  }
}
