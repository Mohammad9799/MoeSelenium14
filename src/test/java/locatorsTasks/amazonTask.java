package locatorsTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.Amazon.com");

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Apple");

        driver.findElement(By.cssSelector("input[type='submit']")).click();


        if (driver.getTitle().contains("Apple")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.close();

    }
}
