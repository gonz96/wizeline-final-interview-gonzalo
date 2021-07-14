package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    @FindBy(css = ".button-login")
    private WebElement loginButton;

    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void insertUsername(){
        WebElement usernameField = new WebDriverWait(driver, 2)
                .until(ExpectedConditions.elementToBeClickable(By.name("login.username")));
        usernameField.click();
    }

    public void insertPassword(){
        WebElement usernameField = new WebDriverWait(driver, 2)
                .until(ExpectedConditions.elementToBeClickable(By.name("login.password")));
        usernameField.click();
    }





}
