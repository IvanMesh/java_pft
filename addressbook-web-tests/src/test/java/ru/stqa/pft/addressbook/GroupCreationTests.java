package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    app.wd.findElement(By.id("footer")).click();
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
