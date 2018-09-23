package appModule;


import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
/**
 * SingInAction class used to log in to the application
 * @author aviralkumar
 */

public class SignInAction {


    /**
     * Method is used to click on the account
     * @param driver
     */
    public static void Execute(WebDriver driver){

        HomePage.lnk_MyAccount(driver).click();
    }

}
