package selenium.pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMainPage {

    private final WebDriver gmpDriver;
    private static final String GOOGLE_PAGE_URL = "https://google.com";
    private static final By LOC_SEARCH_BOX = By.name("q");

    public GoogleMainPage(WebDriver driver) {
        this.gmpDriver = driver;
        this.gmpDriver.get(GOOGLE_PAGE_URL);
    }

    public GoogleResultPage search(String searchQuery) {
        WebElement searchBox = gmpDriver.findElement(LOC_SEARCH_BOX);
        searchBox.sendKeys(searchQuery);
        searchBox.submit();
    }
}
