package seleniumci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

    public void startBrowser() {
        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    public void closeBrowser() {
        driver.quit();
}
}
