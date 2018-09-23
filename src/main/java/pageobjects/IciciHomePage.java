package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/**
 * IciciHomePage - This class contains the webelements of the HomePage of ICICI Bank
 * @author aviral kumar
 */

public class IciciHomePage {


    //*[@id="main"]/div[2]/ul/li[9]/a/span

    WebDriver driver;

    @BeforeTest

    public void setup(){

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/V4/");

    }



}
