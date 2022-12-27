package emailTest;

import org.testng.annotations.Test;
import pages.*;
import readConfig.ReadConfig;

public class EmailTest extends CreateDriver {

    @Test
    public void sendEmail() {
        String emailTheme = "Тестовое задание";
        String emailText = "Добрый день\n" +
                "Простейший автотест готов\n" +
                "Кузьмин Олег Витальевич.";
        MainPage mainPage = new MainPage();
        mainPage.authorization(ReadConfig.username, ReadConfig.password);

        SendEmailPage sendEmailPage = new SendEmailPage();
        sendEmailPage.sendMail(ReadConfig.emailAddress, emailTheme, emailText);
    }
}
