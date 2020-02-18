package CheckBoxesTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ThirdPractise {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement CheckAllButton = driver.findElement(By.xpath("//input[@id='check1']"));


        if (CheckAllButton.getAttribute("value").equals("Check All")){
            System.out.println("Check All button verification is(PASSED)!!");
        }else {
            System.out.println("Check All button verification is(FAILED)!!");
        }

        WebElement clickCheckAllButton = driver.findElement(By.xpath("//input[@id='check1']"));

        clickCheckAllButton.click();

WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='button']/../div[1]/label/input[@class='cb1-element']"));

WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='button']/../div[2]/label/input[@class='cb1-element']"));

WebElement checkBox3 = driver.findElement(By.xpath("//input[@type='button']/../div[3]/label/input[@class='cb1-element']"));

WebElement checkBox4 = driver.findElement(By.xpath("//input[@type='button']/../div[4]/label/input[@class='cb1-element']"));


         if (checkBox1.isSelected()){
             System.out.println("Check Box (1) is selected (PASSED)!!!!");
         }else {
             System.out.println("Check Box (1) is selected (FAILED)!!!!");
         }

        if (checkBox2.isSelected()){
            System.out.println("Check Box (2) is selected (PASSED)!!!!");
        }else {
            System.out.println("Check Box (2) is selected (FAILED)!!!!");
        }


        if (checkBox3.isSelected()){
            System.out.println("Check Box (3) is selected (PASSED)!!!!");
        }else {
            System.out.println("Check Box (3) is selected (FAILED)!!!!");
        }


        if (checkBox4.isSelected()){
            System.out.println("Check Box (4) is selected (PASSED)!!!!");
        }else {
            System.out.println("Check Box (4) is selected (FAILED)!!!!");
        }


        if (CheckAllButton.getAttribute("value").equals("Uncheck All")){
            System.out.println("Uncheck All button verification is(PASSED)!!");
        }else {
            System.out.println("Uncheck All button verification is(FAILED)!!");
        }






driver.findElement(By.xpath("//input[@type='button']/../div[1]/label/input[@type='checkbox']")).click();










    }
}
