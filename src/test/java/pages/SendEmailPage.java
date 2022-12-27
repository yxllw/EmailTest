package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendEmailPage extends AbstractPage {

    @FindBy(xpath = "//a[@href='#compose']")
    private WebElement sendMailButton;

    @FindBy(xpath = "//div[@title='Кому']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@id='compose-field-subject-4']")
    private WebElement emailTheme;

    @FindBy(xpath = "//div[@title='Напишите что-нибудь']")
    private WebElement emailText;

    @FindBy(xpath = "//button[@class='Button2 Button2_pin_circle-circle " +
            "Button2_view_default Button2_size_l']")
    private WebElement sendButton;

    public SendEmailPage() {
        PageFactory.initElements(driver, this);
    }

    public SendEmailPage sendMail(String emailAddressValue, String emailThemeValue, String emailTextValue) {
        sendMailButton.click();
        emailAddress.sendKeys(emailAddressValue);
        emailTheme.sendKeys(emailThemeValue);
        emailText.sendKeys(emailTextValue);
        sendButton.click();
        return this;
    }
}
