package selenium.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.stream.Stream;


public class WordpressTests {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        }

    @Test
    public void PublicCommentOnFirstPost() {
        driver.get("http://automatyzacja.benedykt.net/");

        driver.findElement(By.className("entry-title"))
                .findElement(By.tagName("a"))
                .click();

        Assertions.assertEquals(1, driver.findElements(By.cssSelector("body.single-post")).size(),
                "Single note page is displayed");

        WebElement comment = driver.findElement(By.name("comment"));
        comment.sendKeys("719a0132-a6ee-4c63-8730-d401c2a81488");

        WebElement author = driver.findElement(By.name("author"));
        author.sendKeys("Rumcajs");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("kkaczor@visionapartments.com");

        WebElement submit = driver.findElement(By.name("submit"));
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        jsExec.executeScript("arguments[0].scrollIntoView(true);", submit);
        submit.click();
    }

    @AfterEach
    public void closeDriver() {
         driver.quit();
        }
}
