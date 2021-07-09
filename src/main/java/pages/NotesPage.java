package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotesPage {



    private WebDriver driver;

    public NotesPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isNotesPageLoaded(){
        return driver.findElement(By.id("my-notes-page")).isDisplayed();
    }



}
