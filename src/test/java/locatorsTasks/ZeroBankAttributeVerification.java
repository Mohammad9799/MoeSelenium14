package locatorsTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankAttributeVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        String actualAttribute = driver.findElement(By.partialLinkText("Forgot")).getAttribute("href");

        String expectedAttribute = "/forgot-password.html";



        if (actualAttribute.equals(expectedAttribute)){
            System.out.println("PASSED!!");
        }else {
            System.out.println("FAILED!!");
        }

         driver.close();
    }
}
