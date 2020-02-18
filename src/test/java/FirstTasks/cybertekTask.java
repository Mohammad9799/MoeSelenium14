package FirstTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cybertekTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.cybertekschool.com");

        String expectedTitle = "Cyberteck";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Cybertek title verification PASSED!!");
        }else {
            System.out.println("Cybertek title verification Failed!!");
        }

        String expctedUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if (actualTitle.contains(expctedUrl)){
            System.out.println("Cybertek URL verification PASSED!!");
        }else {
            System.out.println("Cybertek URL verification Failed!!");
        }







        driver.close();

    }
}
