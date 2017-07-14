package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {

        app.gotoAddNewPage();
        app.fillNewContactForm(new ContactData("Иван", "Юрьевич", "Мещеряков", "Slickan", "МО, Ленинский р-н, пос. Развилка", "+7(999)813-80-83", "imeshcheriyakov@gmail.com"));
        app.submitNewContactCreation();
        app.gotoHomePage();
    }

}
