package page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

/**
 * @author mateenkov
 */

public class RepositoryPage {

    public RepositoryPage clickIssueTab() {
        $("#issues-tab").click();
        return this;
    }

    public RepositoryPage checkIssueName(String issue) {
        $(withText(issue)).should(Condition.exist);
        return this;
    }

}
