package RecapSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SecondTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/");

        WebElement JavaLink = driver.findElement(By.linkText("Java Tutorial"));

        JavaLink.click();



        driver.navigate().back();

        WebElement seleniumLink = driver.findElement(By.linkText("Selenium Tutorial"));

        seleniumLink.click();

        driver.navigate().back();

        WebElement seleniumButton = driver.findElement(By.xpath("//*[@id='PageList1']/div/div[1]/div[1]/div/ul/li[2]/a"));

        seleniumButton.click();

        WebElement seleniumBlogs = driver.findElement(By.linkText("Selenium Blogs"));

        seleniumBlogs.click();

        

        String expectedTitle = "Top Selenium Blogs";

        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!!");
        }else {
            System.out.println("Title verification is FAILED");
        }











    }
}
