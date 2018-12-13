package selenium.wordpresspageobjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import selenium.wordpresspageobjects.pages.WpMainPage;
import selenium.wordpresspageobjects.pages.WpNotePage;

import java.util.UUID;

public class WordPressTest extends BaseTest {

    @Test
    public void canAddCommentToFirstNote() {
        // open wordpress main page
        // open first note
        // add comment to the note
        // check that comment is added
        String comment = generateRandomText();
        String author = generateRandomText();
        String email = generateRandomEmail();

        WpMainPage mainPage = new WpMainPage(driver);
        WpNotePage latestNote = mainPage.openLatestNote();
        WpNotePage latestNotewithComment = latestNote.addComment(comment, author, email);

        Assertions.assertTrue(latestNotewithComment.commentExists(comment, author));
    }

    private String generateRandomEmail() {
        return generateRandomText() + "@testdomain.com";
    }

    private String generateRandomText() {
        return UUID.randomUUID().toString();
    }
}
