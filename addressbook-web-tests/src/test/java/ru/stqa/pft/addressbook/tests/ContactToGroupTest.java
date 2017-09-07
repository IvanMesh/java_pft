package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ContactToGroupTest extends TestBase {

  @BeforeMethod
  public void ensurePrecondition() {
    Groups groups = app.db().groups();
    if  (app.db().contacts().size() == 0) {
      app.goTo().homePage();
      app.contact().create(new ContactData().withName("name 0").withLastname("lastname 0").inGroup(groups.iterator().next()));
    }
    if (app.db().groups().size() == 0) {
      app.goTo().groupPage();
      app.group().create(new GroupData().withName("test1"));
    }
  }

  @Test
  public void testContactToGroup() {
    app.goTo().homePage();
    Groups group = app.db().groups();
    Contacts before = app.db().contacts();

    GroupData addedGroup = group.iterator().next();
    ContactData contactToGroup = before.iterator().next();

    app.contact().selectContactById(contactToGroup.getId());
    app.contact().contactToGroup(addedGroup.getId());

    Contacts after = app.db().contacts();

    assertThat(after, equalTo(before.without(contactToGroup).withAdded(contactToGroup.inGroup(addedGroup))));

  }
}
