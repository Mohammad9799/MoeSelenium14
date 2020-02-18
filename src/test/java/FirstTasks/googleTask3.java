package FirstTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTask3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        Thread.sleep(4000);

        driver.findElement(By.linkText("Gmail")).click();
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        Thread.sleep(4000);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Gmail 1st title verification PASSED!!");
        }else {
            System.out.println("Gmail 1st title verification Failed!!");
        }

        driver.navigate().back();



        String expected2Title = "Google";
        String actual2Title = driver.getTitle();

        if (actual2Title.contains(expected2Title)){
            System.out.println("Google title verification PASSED!!");
        }else {
            System.out.println("Google title verification Failed!!");
        }
        Thread.sleep(4000);
        driver.navigate().forward();

        Thread.sleep(4000);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Gmail 2nd title verification PASSED!!");
        }else {
            System.out.println("Gmail 2nd title verification Failed!!");
        }

        driver.close();




    }
}
