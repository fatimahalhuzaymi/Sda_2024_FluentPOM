package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactListLoginPage;

import java.time.Duration;

public class RegisterTest {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        ContactListLoginPage RegisterPage = new ContactListLoginPage(driver);

        RegisterPage
                .enterEmail("sdatest@tester.com")
                .enterPassword("tester.123")
                .clickSubmit()
                .clickLogout();

    }
}
