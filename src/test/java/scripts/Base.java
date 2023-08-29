package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Page;
import utils.Driver;


public class Base {
    Page wholeFoodsPage;

    public static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
