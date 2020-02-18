package reDoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLoginAuthentication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("1- Title verification is PASSED!!");
        }else {
            System.out.println("1- Title verification is FAILED!!");
        }

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        String actualAppTitle = driver.getTitle();
        String expectedAppTitle = "Web Orders";

        System.out.println();

        if (actualAppTitle.equals(expectedAppTitle)){
            System.out.println("2- Title verification is PASSED!!");
        }else {
            System.out.println("2- Title verification is FAILED!!");
        }


    }
}
