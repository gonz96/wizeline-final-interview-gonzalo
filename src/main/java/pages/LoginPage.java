package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    @FindBy(css = ".button-login") //buen uso
    private WebElement loginButton;
    @FindBy(name = "login.username")
    private WebElement usernameField;
    @FindBy(name = "login.password")
    private WebElement passwordField;



    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void insertUsername(String username){
        WebElement usernameFld = new WebDriverWait(driver,2).
                until(ExpectedConditions.elementToBeClickable(By.name("login.username"))); //buen uso
        usernameFld.sendKeys(username);
    }

    public void insertPassword(String password){
        WebElement passwordFld = new WebDriverWait(driver,2).
                until(ExpectedConditions.elementToBeClickable(By.name("login.password")));
        passwordFld.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }



}
