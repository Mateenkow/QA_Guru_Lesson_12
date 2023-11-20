package page;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

/**
 * @author mateenkov
 */

public class SearchResultPage {

    public SearchResultPage clickResultSearch(String repo) {
        $(linkText(repo)).click();
        return this;
    }

}
