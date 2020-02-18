package locatorsTasks;

import com.google.gson.internal.$Gson$Preconditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationZeroBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");

        driver.findElement(By.name("submit")).click();

       if (driver.findElement(By.linkText("username")).isDisplayed()){
           System.out.println("Username verification is PASSED!!");
           System.out.println("Username is displayed on the page");
       }else {
           System.out.println("Username verification is Failed!");
       }
        System.out.println();

       String actualTitle = driver.getTitle();
       String expectedTitle = "Zero - Account Summary";

       if (actualTitle.equals(expectedTitle)){
           System.out.println("Title PASSED");
       }else {
           System.out.println("Title FAILED");
       }
        System.out.println();

       String actualLinkTitle = driver.findElement(By.linkText("Account Summary")).getAttribute("href");
       String expectedLinkTitle = "account-summary";

       if (actualLinkTitle.contains(expectedLinkTitle)){
           System.out.println("PASSED LINK");
       }else {
           System.out.println("FAILED LINK");
       }



driver.close();



    }
}
