package seleniumci;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseClass{
  @Test
  public void verifyGoogleTitle() {
      startBrowser();
      String title = driver.getTitle();
      Assert.assertTrue(title.contains("Google"));
      closeBrowser();
  }
}
