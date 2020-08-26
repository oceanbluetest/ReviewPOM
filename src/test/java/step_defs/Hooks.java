package step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Driver;
import utils.Screenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static Scenario currentScenario;

    @Before
    public void setUp(Scenario scenario){
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        currentScenario = scenario;
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed())
            Screenshot.takeScreenshot();
        Driver.quitDriver();
    }

}
