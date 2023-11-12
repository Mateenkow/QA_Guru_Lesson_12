package steps;

import driver.BaseTest;
import io.qameta.allure.Step;
import page.GitHubPage;

import static page.GitHubPage.*;

/**
 * @author mateenkov
 */

public class Steps extends BaseTest {

    GitHubPage gitHubPage = new GitHubPage();

    @Step("Открыть страницу")
    public void openPage() {
        gitHubPage.openPage(BASE_URL);
    }

    @Step("Найти репозиторий" + REPO)
    public void searchRepo() {
        gitHubPage.searchRepo(REPO);
    }

    @Step("Открыть репозиторий" + REPO)
    public void openRepo() {
        gitHubPage.clickResultSearch(REPO);
    }

    @Step("Открыть ISSUE")
    public void openIssue() {
        gitHubPage.clickIssueTab();
    }

    @Step("Проверить в ISSUE наличие текста" + ISSUE)
    public void checkIssue() {
        gitHubPage.checkIssueName(ISSUE);
    }

}
