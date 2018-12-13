package selenium.pageobjects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BiforAfter {

protected WebDriver driver;

    @BeforeEach
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    public void quitBrowser() {
    driver.quit();
    }
}
