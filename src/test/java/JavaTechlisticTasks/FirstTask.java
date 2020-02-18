package JavaTechlisticTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTask {
    public static void main(String[] args) {

//        1. Launch Firefox browser. (You can choose browser of your choice).
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//
//        2. Open this link - https://www.techlistic.com/

        driver.get("https://www.techlistic.com");
//
//        3. Maximize or set size of browser window.

        driver.manage().window().maximize();
//
//        4. Get Title of page and validate it with expected value.
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techlistic";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!!");
        }else {
            System.out.println("Title verification is FAILED!!");
        }
//
//        5. Get URL of current page and validate it with expected value.

        String actualURL = driver.getCurrentUrl();
        String expectURL = "https://www.techlistic.com/";

        if (actualURL.equals(expectURL)){
            System.out.println("URL verification is PASSED!!");
        }else {
            System.out.println("URL verification is FAILED!!");
        }
//
//        6. Get Page source of web page.


//
//        7. And Validate that page title is present in page source.
//
//        8. Close browser.
    }
}
