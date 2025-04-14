package functionalTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.Signup;

import java.time.LocalDateTime;


public class SignupTest {

    WebDriver driver;

    Signup signup;


    @BeforeMethod
    public void setUp() throws InterruptedException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://file-sharing-application.netlify.app/signup");

        signup = new Signup(driver);

        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void verifySuccessSignup(){
        signup.NameField("Shankar");
        signup.EmailField("Shankargupta108@gmail.com");
        signup.PasswordField("Shankar@1234");
        signup.SignupButton();
    }

    @Test(priority = 2)
    public void verifyFailedSignup() throws InterruptedException {
        Thread.sleep(2000);
        signup.NameField("54321");
        signup.EmailField("Sahnkar@_ghghl.com");
        signup.PasswordField("Shankar@1234");
        signup.SignupButton();

    }

    @AfterMethod
    public void Quit(){
        driver.quit();
    }
}
