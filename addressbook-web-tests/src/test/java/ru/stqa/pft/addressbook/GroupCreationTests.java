package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    wd.findElement(By.id("footer")).click();
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
