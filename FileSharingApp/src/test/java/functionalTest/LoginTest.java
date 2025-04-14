package functionalTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.Login;

public class LoginTest {

    WebDriver driver;

    Login login;


    @BeforeMethod
    public void setUp() throws InterruptedException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://file-sharing-application.netlify.app/login");

        login = new Login(driver);

        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void verifySuccessSignup(){
        login.EmailField("shankargupta@gmail.com");
        login.PasswordField("Shankar@1234");
        login.SignupButton();
    }

    @Test(priority = 2)
    public void verifyFailedSignup() throws InterruptedException {
        Thread.sleep(2000);
        login.EmailField("shankar@hhh.com");
        login.PasswordField("Shankar@1234");
        login.SignupButton();

    }
    @AfterMethod
    public void Quit(){
        driver.quit();
    }
}
