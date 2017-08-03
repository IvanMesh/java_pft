package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {


    @Test (enabled = false)
    public void testContactCreation() {
        List<ContactData> before = app.getContactHelper().getContactList();
        ContactData contact = create();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);

        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }

    private ContactData create() {
        app.goTo().gotoAddNewPage();
        ContactData contact = new ContactData("Иван",  "Мещеря1ков",  "МО, Ленинский р-н, пос. Развилка", "79998138083", "imeshcheriyakov@gmail.com", "1");
        app.getContactHelper().fillNewContactForm(contact, true);
        app.getContactHelper().submitNewContactCreation();
        app.goTo().gotoHomePage();
        return contact;
    }
}
