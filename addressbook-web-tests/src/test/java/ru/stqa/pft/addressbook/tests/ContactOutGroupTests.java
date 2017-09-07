package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactOutGroupTests extends TestBase {

  @BeforeMethod
  public void ensurePrecondition() {
    Groups groups = app.db().groups();
    Contacts contacts = app.db().contacts();
    app.goTo().homePage();
    if  (app.db().contacts().size() == 0) {
      app.goTo().homePage();
      app.contact().create(new ContactData().withName("name 0").withLastname("lastname 0").inGroup(groups.iterator().next()));
    }
    if (app.db().groups().size() == 0) {
      app.goTo().groupPage();
      app.group().create(new GroupData().withName("test1"));
    }
    for(ContactData contact : contacts) {
      if (contact.getGroups().size() == 0) {
        GroupData addedGroup = groups.iterator().next();
        ContactData contactToGroup = contacts.iterator().next();
        app.contact().selectContactById(contactToGroup.getId());
        app.contact().contactToGroup(addedGroup.getId());
      }
    }
  }

  @Test
  public void testContactOutGroup () {
    app.goTo().homePage();
    Contacts before = app.db().contacts();
    ContactData contactToGroup = before.iterator().next();
    GroupData removeGroup = contactToGroup.getGroups().iterator().next();

    app.contact().removeContactFromGroup(removeGroup.getId());
    app.contact().selectContactById(contactToGroup.getId());
    app.contact().click(By.cssSelector("input[name='remove']"));

    Contacts after = app.db().contacts();
    after.remove(contactToGroup);

    ContactData newContactToGroup = new ContactData();
    for (ContactData contact : before) {
      if(contact.equals(contactToGroup)) {
        contact.getGroups().remove(removeGroup);
        after.add(contact);
      }
    }
    newContactToGroup.getGroups().remove(removeGroup);
    System.out.println(newContactToGroup);

    assertThat(after, equalTo(before));
  }
}
