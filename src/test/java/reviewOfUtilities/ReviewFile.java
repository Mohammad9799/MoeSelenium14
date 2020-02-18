package reviewOfUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utillites.Driver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class ReviewFile {

    public static void main(String[] args)throws Exception {

        Properties properties = new Properties();

        FileInputStream file = new FileInputStream("review.properties");

        properties.load(file);

        String DAY = properties.getProperty("day");

        System.out.println(DAY);
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys(properties.getProperty("item") + Keys.ENTER);

        System.out.println(Driver.getDriver().getTitle());


    }


}
