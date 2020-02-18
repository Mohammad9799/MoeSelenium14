package CheckBoxesTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SecondPractise {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
       WebElement theCheckedMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));

        if (!theCheckedMessage.isDisplayed()){
            System.out.println("“Success – Check box it checked” this message is Not displayed(PASSED!!)");
        }else {
            System.out.println("“Success – Check box it checked” this message is displayed(FAILED!!)");
        }


        WebElement 	checkboxButton = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        checkboxButton.click();


        WebElement theCheckedMessage2 = driver.findElement(By.xpath("//div[@id='txtAge']"));


        if (theCheckedMessage2.isDisplayed()){
            System.out.println("“Success – 2 Check box it checked” this message is displayed(PASSED!!)");
        }else {
            System.out.println("“Success – 2 Check box it checked” this message is Not displayed(FAILED!!)");
        }

        driver.close();

    }
}
