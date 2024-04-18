package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactListHomePage;
import pages.ContactListLoginPage;
import pages.HW.RegisterAccount;

import java.time.Duration;

public class LoginTest {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");

        RegisterAccount R = new RegisterAccount(driver);

        R
                .enterfirstnme("Fatimah")
                .enterLastname("tester.123")
                .email("fateema2018@gmail.com")
                .telephone("0554328790")
                .password("12345")
                .Cpassword("12345")
                .Cagree()
                .Continuee();


    }
}