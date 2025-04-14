package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload {
    WebDriver driver;

    private By emailField = By.xpath("//input[@placeholder='example@gmail.com']");

    private By passwordField = By.xpath("//input[@placeholder='Enter Your Password']");

    private By LoginButton = By.xpath("//button[text()='Login']");

    private By FileUploadField = By.xpath("//input[@class='chakra-input css-1c4cd9x']");

    private By CheckBoxField = By.xpath("//span[text()='Set Password']");

    private By SetPasswordField = By.xpath("//input[@placeholder='Set Password']");

    private By UploadFileField = By.xpath("//button[text()='Upload File']");

    private By successMessage = By.xpath("//h1[text()='Logged In Successfully']");

    private By failMessage = By.xpath("//div[text()='Your password is invalid!']");

    public FileUpload (WebDriver driver){
        this.driver = driver;
    }

    public void EmailField(String uemail){
        driver.findElement(emailField).sendKeys(uemail);
    }

    public void PasswordField(String upassword){
        driver.findElement(passwordField).sendKeys(upassword);
    }

    public void LoginButton(){driver.findElement(LoginButton).click();}

    public void FileUploadfield(String path){
        driver.findElement(FileUploadField).sendKeys(path);

    }

    public void CheckBoxSelection(){driver.findElement(CheckBoxField).click();}

    public void SetPassword(){driver.findElement(SetPasswordField).sendKeys("Ram@shankar108");}

    public void UploadFile(){driver.findElement(UploadFileField).click();}
}
