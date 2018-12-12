package selenium.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeleniumTests {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void canFindCodeSprintersOnGoogle(){

        driver.get("https://www.google.com/");


        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("code sprinters");
        searchBox.submit();

        Stream<WebElement> searchResults = driver.findElements(By.cssSelector("div.rc")).stream();
        Stream<WebElement> resultFiltered = searchResults
                .filter(r->r.findElement(By.cssSelector("div.r > a")).getAttribute("href").equals("http://agileszkolenia.pl/"));
        List<WebElement> resultsList = resultFiltered.collect(Collectors.toList());

        Assertions.assertEquals(2, resultsList.size());

        WebElement result = resultsList.get(0);
        Assertions.assertEquals("agileszkolenia.pl/", resultsList.get(0).findElement(By.tagName("cite")).getText());

        }

        @AfterEach
    public void closeDriver() {
        driver.quit();
        }
    }
