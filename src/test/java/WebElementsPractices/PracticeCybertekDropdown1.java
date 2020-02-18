package WebElementsPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeCybertekDropdown1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select select = new Select(stateDropdown);


        String txt = select.getFirstSelectedOption().getText();

        System.out.println(txt);

        Thread.sleep(2000);

        //selectByVisibleText:

        select.selectByVisibleText("California");

        //selectByIndex:
        select.selectByIndex(12);

        //selectByTheAttributeValue:
        select.selectByValue("FL");


        String expectedOption = "Florida";
        String actualOption = select.getFirstSelectedOption().getText();

        if (actualOption.equals(expectedOption)){
            System.out.println("PASSED!!");
        }else {
            System.out.println("FAILED!!");
        }



    }
}
