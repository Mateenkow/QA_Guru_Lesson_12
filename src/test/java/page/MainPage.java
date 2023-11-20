package page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * @author mateenkov
 */

public class MainPage {

    public MainPage openPage(String url) {
        open(url);
        return this;
    }

    public MainPage searchRepo(String repo) {
        $(".search-input").click();
        $("#query-builder-test").sendKeys(repo);
        $("#query-builder-test").pressEnter();
        return this;
    }



}
