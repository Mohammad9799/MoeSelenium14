package locatorsTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = driver.findElement(By.className("page-header")).getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("PASSED!!");
        }else {
            System.out.println("Failed");
        }
        driver.close();

    }
}
