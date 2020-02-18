package reDoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.findElement(By.className("gb_g")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("1- Title verification is PASSED!!!");
        }else {
            System.out.println("1- Title verification is FAILED!!!");
        }

        driver.navigate().back();

        String actualGoogleTitle = driver.getTitle();
        String expectedGoogleTitle = "Google";

        System.out.println("---------");

        if (actualGoogleTitle.contains(expectedGoogleTitle)){
            System.out.println("2- Title verification is PASSED!!!");
        }else {
            System.out.println("2- Title verification is FAILED!!!");
        }

        driver.navigate().forward();

        String actualGmailTitle = driver.getTitle();
        String expectedGmailTitle = "Gmail";

        System.out.println("----------");

        if (actualGmailTitle.contains(expectedGmailTitle)){
            System.out.println("3- Title verification is PASSED!!!");
        }else {
            System.out.println("3- Title verification is FAILED!!!");
        }





        driver.close();

    }
}
