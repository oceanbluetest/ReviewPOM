package stepImpl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CucumberUtils;
import utils.Driver;

public class MyFavoriteImpl {

    public void openPage(String pageName){
        switch (pageName.toLowerCase()){
            case "my favorites": Driver.getDriver().findElement(By.linkText(pageName)).click();
                break;
            default:
                System.out.println("Invalid page name");
        }
        CucumberUtils.logInfo("Opened page: " + pageName, true);
    }
}
