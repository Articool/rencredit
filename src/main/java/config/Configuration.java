package config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Configuration {

    public static WebDriver driver;

    @BeforeTest
    public void preCondition() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rencredit.ru/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    protected void finished() {
        String sessionID = ((RemoteWebDriver) driver).getSessionId().toString();
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
