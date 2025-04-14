package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

    private By emailField = By.xpath("//input[@placeholder='example@gmail.com']");

    private By passwordField = By.xpath("//input[@placeholder='Enter Your Password']");

    private By signupButton = By.xpath("//button[text()='Login']");

    private By successMessage = By.xpath("//h1[text()='Logged In Successfully']");

    private By failMessage = By.xpath("//div[text()='Your password is invalid!']");

    public Login (WebDriver driver){
        this.driver = driver;
    }

    public void EmailField(String uemail){
        driver.findElement(emailField).sendKeys(uemail);
    }

    public void PasswordField(String upassword){
        driver.findElement(passwordField).sendKeys(upassword);
    }

    public void SignupButton(){driver.findElement(signupButton).click();}
}
