package ru.stqa.pft.mantis.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.lanwen.verbalregex.VerbalExpression;
import ru.stqa.pft.mantis.model.MailMessage;
import ru.stqa.pft.mantis.model.User;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class PasswordChangeTests extends TestBase {

  private User testUser;

  @BeforeMethod
  public void startMailServer() throws IOException, MessagingException {
    app.mail().start();
    List<User> users = app.db().users();
    if (users.size() > 0){
      for (int i =0; i < users.size(); i++) {
        if (users.get(i).getName().equals("administrator")) {
          users.remove(i);
        }
      }
      testUser = users.get(users.size() - 1);
    } else {
      throw new RuntimeException("No users in database");
    }
  }

  @Test
  public void testChangePassword() throws IOException, MessagingException {
    app.login().login("administrator", "root");
    app.login().resetPassword(testUser.getName());
    List<MailMessage> mailMessages = app.mail().waitForMail(1, 10000);
    String confirmationLink = findChangePawwordConfirmationLink(mailMessages);
    String newPassword = "newPassword";
    app.registration().finish(confirmationLink, newPassword);
    assertTrue(app.newSession().login(testUser.getName(), newPassword));
  }

  private String findChangePawwordConfirmationLink(List<MailMessage> mailMessages) {
    VerbalExpression regex = VerbalExpression.regex().find("http://").nonSpace().oneOrMore().build();
    return regex.getText(mailMessages.iterator().next().text);
  }

  @AfterMethod(alwaysRun = true)
  public void stopMailServer() {
    app.mail().stop();
  }
}