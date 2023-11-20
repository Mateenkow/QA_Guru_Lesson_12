package driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {


    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeAll
    public static void setUp() {
        Configuration.browserSize = System.getProperty("windowSize", "1920x1080");
        Configuration.pageLoadStrategy = "eager";

    }

    @AfterAll
    public static void tearDown() {
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
    @AfterEach
    void clear() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }

}
