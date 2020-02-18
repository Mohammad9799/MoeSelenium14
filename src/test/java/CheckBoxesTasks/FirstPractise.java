package CheckBoxesTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstPractise {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        driver.get("http://practice.cybertekschool.com/checkboxes");

        if (!driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected()){
            System.out.println("CheckBox 1 verification is PASSED!!!");

        }else {
            System.out.println("CheckBox 1 verification is FAILED!!!");
        }



        if (driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected()){
            System.out.println("CheckBox 2 verification is PASSED!!!");
        }else {
            System.out.println("CheckBox 2 verification is FAILED!!!");
        }

        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();

        System.out.println("----------------------------");


        if (driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected()){
            System.out.println("CheckBox 1 verification(2) is PASSED!!!");

        }else {
            System.out.println("CheckBox 1 verification(2) is FAILED!!!");
        }


        if (!driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected()){
            System.out.println("CheckBox 2 verification(2) is PASSED!!!");
        }else {
            System.out.println("CheckBox 2 verification(2) is FAILED!!!");
        }

        driver.close();

    }
}
