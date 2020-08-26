package utils;

import io.cucumber.java.Scenario;
import pages.CommonPage;
import step_defs.Hooks;

public class CucumberUtils {

    public static void logInfo(String msg, boolean takeScreenshot){
        Scenario scenario = Hooks.currentScenario;
        scenario.log(CommonPage.CURRENT_DATETIME + " INFO: " + msg);
        if (takeScreenshot)
            Screenshot.takeScreenshot();
    }
}
