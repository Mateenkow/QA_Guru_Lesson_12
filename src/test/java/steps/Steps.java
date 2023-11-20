package steps;

import driver.BaseTest;
import io.qameta.allure.Step;
import page.MainPage;
import page.RepositoryPage;
import page.SearchResultPage;

import static data.Data.*;

/**
 * @author mateenkov
 */

public class Steps {

    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    RepositoryPage repositoryPage = new RepositoryPage();

    @Step("Открыть страницу")
    public void openPage() {
        mainPage.openPage(BASE_URL);
    }

    @Step("Найти репозиторий" + REPO)
    public void searchRepo() {
        mainPage.searchRepo(REPO);
    }

    @Step("Открыть репозиторий" + REPO)
    public void openRepo() {
        searchResultPage.clickResultSearch(REPO);
    }

    @Step("Открыть ISSUE")
    public void openIssue() {
        repositoryPage.clickIssueTab();
    }

    @Step("Проверить в ISSUE наличие текста" + ISSUE)
    public void checkIssue() {
        repositoryPage.checkIssueName(ISSUE);
    }

}
