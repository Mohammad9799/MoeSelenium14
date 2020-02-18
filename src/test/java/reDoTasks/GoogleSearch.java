package reDoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.WeakHashMap;

public class GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

//        driver.findElement(By.className("gNO89b")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification is PASSED!!");
        }else {
            System.out.println("Title verification is FAILED!!");
        }

        driver.findElement(By.className("LC20lb")).click();

    }
}
