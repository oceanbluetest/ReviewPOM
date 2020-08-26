package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonPage {
    public CommonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static final String CURRENT_DATETIME = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"));

    @FindBy(id = "home_link")
    public WebElement homeBtn;

    @FindBy(id = "search_restaurants_link")
    public WebElement searchRestBtn;

    @FindBy(id = "search_fun_places_link")
    public WebElement searchFunPlacesBtn;

    @FindBy(id = "my_favorites_link")
    public WebElement myFavBtn;

}
