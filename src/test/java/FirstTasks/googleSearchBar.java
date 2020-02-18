package FirstTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchBar {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        //driver.findElement(By.name("btnK")).click();



        String expectedTitle ="apple";
        String actualTitle = driver.getTitle();


        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Verification Title PASSED!!");
        }else {
            System.out.println("Verification Title FAILED!!");
        }

        driver.close();

    }
}
