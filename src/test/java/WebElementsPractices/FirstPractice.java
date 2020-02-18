package WebElementsPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.openxcell.com");


     List<WebElement> theLinks =  driver.findElements(By.xpath("//body//a"));

     int expectedNum = 190;
     int actualNum = theLinks.size();


     if (expectedNum==actualNum){
         System.out.println("(1) PASSED!!");
     }else {
         System.out.println("(1) FAILED");
     }

int counter = 0;

     for (WebElement link : theLinks){
         System.out.println(link.getText());

         if (link.getText().equals("")){
             counter++;
         }
     }

     int expectedNumOfLinksWithNoText = 188;
     int actualNumOfLinksWithNoText = counter;


     if (expectedNumOfLinksWithNoText == actualNumOfLinksWithNoText){
         System.out.println("PASSED(2)");
     }else {
         System.out.println("FAILED(2)");
     }









    }
}
