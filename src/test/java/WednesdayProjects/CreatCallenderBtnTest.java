package WednesdayProjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utillites.VytrackUtils;

public class CreatCallenderBtnTest {
    public static void main(String[] args) {

        String createCalenderBtn = "a[title='Create Calendar event']";


        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        VytrackUtils.login(driver,"storemanager85","UserUser123");

        VytrackUtils.navigateToModule(driver,"Activities","Calendar Events");


        if (driver.findElement(By.cssSelector(createCalenderBtn)).isDisplayed()){
            System.out.println("Test 2 - PASSE");
        }else {
            System.out.println("Test 2 - FAILED");
        }
    }
}
