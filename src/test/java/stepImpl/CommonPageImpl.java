package stepImpl;

import org.junit.Assert;
import pages.CommonPage;
import utils.CucumberUtils;

import java.util.List;

public class CommonPageImpl {

    public void verifyNavButtonsEnabled(List<String> list){
        CommonPage commonPage = new CommonPage();
        for (String button: list){
            switch (button.toLowerCase()){
                case "home":
                    Assert.assertTrue(commonPage.homeBtn.isEnabled());
                    break;
                case "search restaurants":
                    Assert.assertTrue(commonPage.searchRestBtn.isEnabled());
                    break;
                case "search fun places":
                    Assert.assertTrue(commonPage.searchFunPlacesBtn.isEnabled());
                    break;
                case "my favorites":
                    Assert.assertTrue(commonPage.myFavBtn.isEnabled());
                    break;
                default:
                    System.out.println("Invalid button name");
            }
            CucumberUtils.logInfo("Successfully verified button: |" + button + "| is enabled", true);
        }
    }
}
