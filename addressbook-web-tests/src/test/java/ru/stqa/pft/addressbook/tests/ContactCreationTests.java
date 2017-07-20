package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {

        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().fillNewContactForm(new ContactData("Иван", "Юрьевич", "Мещеряков", "Slickan", "МО, Ленинский р-н, пос. Развилка", "+7(999)813-80-83", "imeshcheriyakov@gmail.com", "test1"), true);
        app.getContactHelper().submitNewContactCreation();
        app.getNavigationHelper().gotoHomePage();
    }

}
