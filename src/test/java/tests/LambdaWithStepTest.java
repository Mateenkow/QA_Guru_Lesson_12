package tests;

import driver.BaseTest;
import org.junit.jupiter.api.Test;
import page.MainPage;
import page.RepositoryPage;
import page.SearchResultPage;

import static data.Data.*;
import static io.qameta.allure.Allure.step;

public class LambdaWithStepTest extends BaseTest {

    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    RepositoryPage repositoryPage = new RepositoryPage();

    @Test
    void lambdaWithStepTest() {

        step("Открыть главную страницу", () -> {
            mainPage.openPage(BASE_URL);
        });
        step("Найти репозиторий" + "<" + REPO + ">", () -> {
            mainPage.searchRepo(REPO);
        });
        step("Открыть репозиторий" + "<" + REPO + ">", () -> {
            searchResultPage.clickResultSearch(REPO);
        });
        step("Открыть Issues", () -> {
            repositoryPage.clickIssueTab();
        });
        step("Проверить что в Issue содержиться текст" + "<" + ISSUE + ">", () -> {
            repositoryPage.checkIssueName(ISSUE);
        });
    }
}