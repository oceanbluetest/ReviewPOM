package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;
    public static final String propertyPath = "src/test/resources/conf/config.properties";

    public static WebDriver getDriver(){
        if (driver==null)
            initializeDriver(ConfigReader.readProperty("browser", propertyPath));
        return driver;
    }

    public static void quitDriver(){
        getDriver().quit();
        driver = null;
    }

    private static void initializeDriver(String browser){
        switch (browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                System.out.println("Invalid browser type");
        }
    }
}
