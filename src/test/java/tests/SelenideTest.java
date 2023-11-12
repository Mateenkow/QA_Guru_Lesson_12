package tests;


import driver.BaseTest;
import org.junit.jupiter.api.Test;
import page.GitHubPage;

import static page.GitHubPage.*;

public class SelenideTest extends BaseTest {

    GitHubPage gitHubPage = new GitHubPage();

    @Test
    void selenideTest() {
        gitHubPage.openPage(BASE_URL)
                .searchRepo(REPO)
                .clickResultSearch(REPO)
                .clickIssueTab()
                .checkIssueName(ISSUE);
    }

}