package FirstTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTaskNum5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification Title PASSED!!");
        }else {
            System.out.println("Verification Title FAILED!!");
        }

        // Username entree I used id here
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        // Password entree I used id here
         driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String expected2ndTitle = "Web Orders";
        String actual2ndTitle = driver.getTitle();

        if (actual2ndTitle.equals(expected2ndTitle)){
            System.out.println("Verification Title PASSED!!");
        }else {
            System.out.println("Verification Title FAILED!!");
        }
        Thread.sleep(3000);

        driver.close();






    }
}
