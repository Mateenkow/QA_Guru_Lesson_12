package page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

/**
 * @author mateenkov
 */

public class GitHubPage {

    public static final String REPO =  "Mateenkow/QA_guru_lesson_11";
    public static final String ISSUE =  "Test Issue";
    public static final String BASE_URL = "https://github.com/";


    public GitHubPage openPage(String url){
        open(url);
        return this;
    }

    public GitHubPage searchRepo(String repo){
        $(".search-input").click();
        $("#query-builder-test").sendKeys(repo);
        $("#query-builder-test").pressEnter();
        return this;
    }

    public GitHubPage clickResultSearch(String repo){
        $(linkText(repo)).click();
        return this;
    }

    public GitHubPage clickIssueTab () {
        $("#issues-tab").click();
        return this;
    }

    public void checkIssueName (String issue) {
        $(withText(issue)).should(Condition.exist);
    }


}
