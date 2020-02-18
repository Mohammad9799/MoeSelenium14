package locatorsTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TasksByXpath {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        if (driver.findElement(By.xpath("//a[@class='nav-link']")).isDisplayed()){
            System.out.println("Home button is Displayed");
        }else {
            System.out.println("Home button is Not Displayed");
        }


        if (driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2")).isDisplayed()){
            System.out.println("Header is Displayed");
        }else {
            System.out.println("Header is Not Displayed");
        }

        if (driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/label")).isDisplayed()){
            System.out.println("E-mail txt is Displayed");
        }else {
            System.out.println("E-mail txt is Not Displayed");
        }


        if (driver.findElement(By.xpath("//button[@class='radius']")).isDisplayed()){
            System.out.println("Retrieve password button is Displayed");
        }else {
            System.out.println("Retrieve password button is Not Displayed");
        }


        if (driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div")).isDisplayed()){
            System.out.println("Powered by Cybertek School txt is Displayed");
        }else {
            System.out.println("Powered by Cybertek School txt is  Not Displayed");
        }

        driver.close();



    }
}
