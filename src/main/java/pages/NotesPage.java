package pages;

import org.omg.CORBA.SetOverrideType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotesPage {
    @FindBy(css = ".button-login")
    private WebElement loginButton;

    private WebDriver driver;
    public NotesPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        return driver.findElement(By.id("my-notes-page")).isDisplayed();
        System.out.println("this is a test");
        
    }



}
