package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import utils.ConfigReader;
import utils.CucumberUtils;
import utils.Driver;
import utils.Screenshot;

public class HomePageTest {

    @Given("I open homepage")
    public void i_open_homepage() {
        WebDriverManager.chromedriver().setup();
        Driver.getDriver().get(ConfigReader.readProperty("url", Driver.propertyPath));
        Screenshot.takeScreenshot();
    }

    @Then("I verify title is {string}")
    public void i_verify_title_is(String title) {
        CucumberUtils.logInfo("Expected title is: " + title + " | Actual title is: " + Driver.getDriver().getTitle(),true);
        Assert.assertEquals(Driver.getDriver().getTitle(), title);
        Driver.getDriver().quit();
    }
}
