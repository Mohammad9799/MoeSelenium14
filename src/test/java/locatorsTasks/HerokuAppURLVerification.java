package locatorsTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuAppURLVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/forgot_password");

        driver.findElement(By.id("email")).sendKeys("hmohammad75@yahoo.com");

        driver.findElement(By.id("form_submit")).click();

        String expectedURL = "email_sent";
        String actualURL = driver.getCurrentUrl();


        if (actualURL.contains(expectedURL)){
            System.out.println("PASSED!!");
        }else {
            System.out.println("FAILED!!");
        }




    }
}
