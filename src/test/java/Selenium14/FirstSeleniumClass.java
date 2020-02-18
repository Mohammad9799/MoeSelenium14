package Selenium14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");


        System.out.println(driver.getTitle());
        driver.navigate().forward();
//        Thread.sleep(2000);
        driver.navigate().refresh();
//        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.navigate().to("https://www.facebook.com");
        System.out.println(driver.getTitle());
    }
}
