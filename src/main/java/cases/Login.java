/*Author: Gonzalo Illán Salvador
gonzillans@gmail.com
 */

package cases;

import static java.lang.Thread.sleep;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

import pages.NotesPage;

public class Login {
    //bien camel case
    private static final String USERNAME = "testuser@example.com";
    private static final String PASSWORD = "test123";
    private WebDriver driver;
    private static final String URL = "http://testapp.galenframework.com/";

    //crear un .properties con estos valores hardcodeados ******

    public Login() {
    }

    @Before //buena práctica
    public void initialize(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithValidUser(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickLoginButton();
        loginPage.insertUsername(USERNAME);
        loginPage.insertPassword(PASSWORD);
        loginPage.clickLoginButton();//

        NotesPage notesPage = PageFactory.initElements(driver, NotesPage.class);
        Assert.assertFalse("The notes page was not loaded", notesPage.isNotesPageLoaded());

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @After //buena práctica
    public void finish(){
        driver.close();
    }
}
