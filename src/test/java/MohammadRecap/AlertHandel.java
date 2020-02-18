package MohammadRecap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utillites.Driver;

public class AlertHandel {


    @Test
    public void clickOk()throws Exception{

        Driver.getDriver().get("http://practice.cybertekschool.com/javascript_alerts");



        WebElement pressOk = Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
        pressOk.click();

        Thread.sleep(3000);

        Alert alert  = Driver.getDriver().switchTo().alert();
        alert.accept();

Driver.getDriver().switchTo().parentFrame();

        WebElement pressConfirm = Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
        pressConfirm.click();

        Thread.sleep(2000);

        Driver.getDriver().switchTo().alert().dismiss();

        Driver.getDriver().switchTo().parentFrame();

        WebElement writeSomething = Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
        writeSomething.click();

        Thread.sleep(2000);

        Driver.getDriver().switchTo().alert();

        alert.sendKeys("sfsaf");
        alert.accept();


        Driver.getDriver().switchTo().parentFrame();

        Driver.closeDriver();

    }

}
