package locatorsTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");
        driver.findElement(By.name("search_query")).sendKeys("Wooden spoon");

       driver.findElement(By.className("wt-input-btn-group__btn")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsy";


                if(actualTitle.equals(expectedTitle)){
                    System.out.println("PASSED!!");

                }else {
                    System.out.println("FAILED!!");
                }

                Thread.sleep(3000);
                driver.close();

    }
}
