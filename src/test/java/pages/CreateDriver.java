package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import readConfig.ReadConfig;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class CreateDriver {
    private WebDriver driver;

    @BeforeClass
    public void setup() throws IOException {
        ReadConfig.loadConfig();
        setupDriver();
    }

    @AfterTest
    public void close() {
        driver.close();
        driver.quit();
    }

    @Deprecated
    private void setupDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        AbstractPage.setDriver(driver);
    }
}
