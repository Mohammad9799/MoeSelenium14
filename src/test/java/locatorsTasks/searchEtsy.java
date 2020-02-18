package locatorsTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchEtsy {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        driver.findElement(By.xpath("//*[@id=\"global-enhancements-search-query]")).sendKeys("Wooden Spoon");

        driver.findElement(By.xpath("//button[@value='Search']")).click();

        if (driver.getTitle().contains("wooden Spoon")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }


    }
}
