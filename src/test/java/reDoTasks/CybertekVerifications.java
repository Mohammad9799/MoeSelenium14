package reDoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekVerifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.cybertekschool.com");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "cybertekschool";

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification is PASSED!!");
        }else {
            System.out.println("URL verification is FAILED!!");
        }
        String actualTitle = driver.getTitle();
        String expectedTitle = "Cybertek";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!!");
        }else {
            System.out.println("Title verification is FAILED!!");
        }


    }
}
