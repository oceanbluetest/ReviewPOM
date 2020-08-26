package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class MyFavoritePage {

    public MyFavoritePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "fav_result_container")
    public WebElement tableText;
}
