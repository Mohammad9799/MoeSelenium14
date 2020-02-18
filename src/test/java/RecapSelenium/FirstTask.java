package RecapSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/");


        String expectedTitle = "Techlistic";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!!");
        }else {
            System.out.println("Title verification is FAILED!!");
        }



        String expectedURL = "https://www.techlistic.com/";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)) {
            System.out.println("URL verification is PASSED!!");
        }else {
            System.out.println("URL verification is FAILED!!");
        }


        String webSource = driver.getPageSource();

        if (webSource.contains(expectedTitle)) {
            System.out.println("Web source verification is PASSED!!");
        }else {
            System.out.println("Web source verification is FAILED!!");
        }


        driver.close();




    }
}
