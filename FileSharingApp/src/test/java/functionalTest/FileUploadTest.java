package functionalTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.FileUpload;

public class FileUploadTest {

    WebDriver driver;

    FileUpload fileUpload;

    @BeforeMethod
    public void StartLogin() throws InterruptedException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://file-sharing-application.netlify.app/login");

        fileUpload = new FileUpload(driver);

        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void verifySuccessLogin() throws InterruptedException {
        fileUpload.EmailField("shankargupta@gmail.com");
        fileUpload.PasswordField("Shankar@1234");
        fileUpload.LoginButton();
        Thread.sleep(2000);
        fileUpload.FileUploadfield("/Users/paraskumarzumbaralalsanghavi/Downloads/Mindmap.png");
        fileUpload.CheckBoxSelection();
        fileUpload.SetPassword();
        fileUpload.UploadFile();
    }
}
