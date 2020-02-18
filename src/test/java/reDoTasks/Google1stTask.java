package reDoTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1stTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

     if (actualTitle.equals(expectedTitle)){
         System.out.println("Google Title verification is PASSED!!!!");
     }else {
         System.out.println("Google Title verification is FAILED!!!!");
     }

     driver.close();


    }
}
