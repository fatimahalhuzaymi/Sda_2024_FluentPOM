package pages.HW;

import io.cucumber.java.ja.然し;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.PanelUI;

public class RegisterAccount {

    WebDriver ldriver ;
    By FirstName = By.id("input-firstname");
    By LastName =By.id("input-lastname");
    By Email= By.id("input-email");
    By Telephone= By.id("input-telephone");
    By Password= By.id("input-password");
    By Password_Confirm = By.id("input-confirm");

    By agree = By.xpath("//*[@for=\"input-agree\"]");
    By Continue = By.xpath("//input[@type=\"submit\"]");


    public RegisterAccount (WebDriver gdriver){
        ldriver=gdriver;
    }

    public RegisterAccount enterfirstnme(String fname){
        ldriver.findElement(FirstName).sendKeys(fname);
        return this;
    }

    public RegisterAccount enterLastname(String lname){
        ldriver.findElement(LastName).sendKeys(lname);
        return this;
    }
    public RegisterAccount email(String  emaill){
        ldriver.findElement(Email).sendKeys(emaill);
        return this;
    }
    public RegisterAccount telephone(String tphone){
        ldriver.findElement(Telephone).sendKeys(tphone);
        return this;
    }
    public RegisterAccount password(String passworrd){
        ldriver.findElement(Password).sendKeys(passworrd);
        return this;
    }

    public RegisterAccount Cpassword(String cpassword){
        ldriver.findElement(Password_Confirm).sendKeys(cpassword);
        return this;
    }
    public RegisterAccount Cagree(){
        ldriver.findElement(agree).click();
        return this;
    }
     public RegisterAccount Continuee(){
        ldriver.findElement(Continue).click();
        return this;
     }

}
