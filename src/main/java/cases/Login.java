package cases;

import com.sun.xml.internal.bind.v2.ClassFactory;
import core.TestBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.NotesPage;

public class Login extends TestBase {
    private String url;
    private String username;
    private String password;
    private WebDriver driver;

    public Login() {
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    @Before
    public void initialize(){
        switch (properties.getProperty("browser")){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.get(url);
                driver.manage().window().maximize();
                break;
            default:
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.get(url);
                driver.manage().window().maximize();


        }
    }


    @Test
    public void loginWithValidUser(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickOnLoginButton();
        loginPage.insertUsername(username);
        loginPage.insertPassword(password);
        loginPage.clickOnLoginButton();
        NotesPage notesPage = PageFactory.initElements(driver, NotesPage.class);
        Assert.assertTrue(notesPage.isPageLoaded());
    }
}
