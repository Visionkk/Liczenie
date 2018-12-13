package selenium.wordpresspageobjects.pages;

import org.openqa.selenium.WebDriver;

public class WpNotePage {
    private final WebDriver driver;

    public WpNotePage(WebDriver driver) {
        this.driver = driver;
    }

    public WpNotePage addComment(String comment, String author, String email) {
        // here you publish comment
        return new WpNotePage(driver);
    }

    public boolean commentExists(String comment, String author) {
        // here you check that comment is published
        return false
    }
}
