package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.WebElement;

/**
 * HomePage -- page object model class for HomePage
 * @author Aviral Kumar
 */

public class HomePage {



    private static WebElement element = null; //stores the webelement

    /**
     * Finds out the Myaccount element in the homepage
     * @param driver is the webdriver to locate element
     * @return Returns the WebElement back
     */

    public static WebElement lnk_MyAccount(WebDriver driver){


        element = driver.findElement(By.id("account"));

        return element;


    }

    /**
     * Finds and returns the Log_Out Element
     * @param driver is the WebDriver
     * @return returns the WebElement back
     */

    public static WebElement Lnk_LogOut(WebDriver driver){

        element = driver.findElement(By.id("account_logout"));

        return element;
    }

}
