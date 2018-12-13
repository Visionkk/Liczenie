package selenium.pageobjects;

import org.junit.jupiter.api.Test;
import selenium.pageobjects.BiforAfter;
import selenium.pageobjects.pages.GoogleMainPage;
import selenium.pageobjects.pages.GoogleResultPage;

public class GoogleTests extends BiforAfter {

    @Test
    public void canFindScrumOrgOnGoogle() {
        String scrumOrgUrl = "https://www.scrum.org/";
        String scrumOrgPageTitle = "Scrum.org: Hompeage";

        GoogleMainPage googlePage = new GoogleMainPage(driver);
        GoogleResultPage resultPage = googlePage.search("Scrum.org");

        assertTrue(resultPage.containsResults(scrumOrgUrl));
        assertTrue(resultPage.containsResultsWithTitle(scrumOrgUrl, scrumOrgPageTitle), 
                "Scrum.org page has correct title")
    }

    private void assertTrue(boolean containsResults) {
    }

    @Test


}
