package tests;

import driver.BaseTest;
import org.junit.jupiter.api.Test;
import page.MainPage;
import page.RepositoryPage;
import page.SearchResultPage;

import static data.Data.*;
public class SelenideTest extends BaseTest {
    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    RepositoryPage repositoryPage = new RepositoryPage();

    @Test
    void selenideTest() {
        mainPage.openPage(BASE_URL)
                .searchRepo(REPO);

        searchResultPage.clickResultSearch(REPO);

        repositoryPage.clickIssueTab()
                .checkIssueName(ISSUE);
    }

}