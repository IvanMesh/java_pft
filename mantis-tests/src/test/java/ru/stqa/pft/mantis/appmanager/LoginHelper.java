package ru.stqa.pft.mantis.appmanager;

import org.openqa.selenium.By;

public class LoginHelper extends HelperBase {

  public LoginHelper(ApplicationManager app) {
    super(app);
  }

  public void login(String userName, String password){
    wd.get(app.getProperty("web.baseUrl") + "/login_page.php");
    type(By.name("username"), userName);
    click(By.cssSelector("input[type='submit']"));
    type(By.name("password"), password);
    click(By.cssSelector("input[type='submit']"));

  }

  public void resetPassword(String userName){

    click(By.xpath(".//*[@id='sidebar']/ul/li[7]/a/span"));
    click(By.xpath(".//*[@id='main-container']/div[2]/div[2]/div/ul/li[2]/a"));
    type(By.id("username"), userName);
    click(By.xpath(".//*[@id='manage-user-edit-form']/input[2]"));
    click(By.xpath(".//*[@id='manage-user-reset-form']/fieldset/span/input"));
  }

}