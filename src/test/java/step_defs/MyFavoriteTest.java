package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MyFavoritePage;
import stepImpl.MyFavoriteImpl;
import utils.CucumberUtils;

public class MyFavoriteTest extends MyFavoriteImpl {

    @Then("I verify {string} text is displayed")
    public void i_verify_text_is_displayed(String displayedText) {
        MyFavoritePage myFavoritePage = new MyFavoritePage();
        String actualText = myFavoritePage.tableText.getText();
        Assert.assertEquals(displayedText, actualText);
        CucumberUtils.logInfo("Expected text: " + displayedText + " | Actual text: " + actualText, true);
    }

    //TODO: consolidate with a "public void i_open_homepage()" step in HomePageStep class
    @When("I open {string} page")
    public void iOpenPage(String pageName) {
        openPage(pageName);
    }
}
