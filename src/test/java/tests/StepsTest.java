package tests;

import driver.BaseTest;
import org.junit.jupiter.api.Test;
import steps.Steps;

/**
 * @author mateenkov
 */

public class StepsTest extends BaseTest {

    @Test
    void stepsTest() {
        Steps step = new Steps();
        step.openPage();
        step.searchRepo();
        step.openRepo();
        step.openIssue();
        step.checkIssue();
    }

}
