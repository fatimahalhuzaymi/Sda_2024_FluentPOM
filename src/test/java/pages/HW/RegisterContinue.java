package pages.HW;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterContinue {
    WebDriver ldriver;

    By countinuee = By.xpath("//h1[contains(text(),'Created')]");

    public RegisterContinue (WebDriver gdriver){
        ldriver=gdriver;
    }
    public void CorrectRegister(){
        WebElement title= ldriver.findElement(countinuee);
        Assert.assertTrue(title.isDisplayed());
    }
}
