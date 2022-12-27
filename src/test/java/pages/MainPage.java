package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import readConfig.ReadConfig;

import java.time.Duration;

public class MainPage extends AbstractPage {

    @FindBy(xpath = "//button[@type='button']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputUsername;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//input[@name='passwd']")
    private WebElement inputPassword;

    @FindBy(xpath = "//a[@data-t='button:pseudo']")
    private WebElement skipButton;


    public MainPage() {
        driver.get(ReadConfig.URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage authorization(String username, String password) {
        inputUsername.sendKeys(username);
        submitButton.click();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        inputPassword.sendKeys(password);
        submitButton.click();
        return this;
    }
}
