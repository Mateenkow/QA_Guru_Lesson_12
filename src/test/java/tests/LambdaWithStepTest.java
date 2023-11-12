package tests;

import driver.BaseTest;
import org.junit.jupiter.api.Test;
import page.GitHubPage;

import static io.qameta.allure.Allure.step;
import static page.GitHubPage.*;

public class LambdaWithStepTest extends BaseTest {

    GitHubPage gitHubPage = new GitHubPage();

    @Test
    void lambdaWithStepTest() {

        step("Открыть главную страницу", () -> {
            gitHubPage.openPage(BASE_URL);
        });
        step("Найти репозиторий" + "<" + REPO + ">", () -> {
            gitHubPage.searchRepo(REPO);
        });
        step("Открыть репозиторий" + "<" + REPO + ">", () -> {
            gitHubPage.clickResultSearch(REPO);
        });
        step("Открыть Issues", () -> {
            gitHubPage.clickIssueTab();
        });
        step("Проверить что в Issue содержиться текст" + "<" + ISSUE + ">", () -> {
            gitHubPage.checkIssueName(ISSUE);
        });
    }
}