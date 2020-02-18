package TusedayPractice28;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class secondTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //1. Open	browser
        // 2. Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3. Enter username: “Tester”
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // 4. Enter password: “test”
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // 5. Click on Login button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        // 6. Click on Order
        driver.findElement(By.linkText("Order")).click();
        // 7. Select familyAlbum from product, set quantity to 2
        WebElement orderButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));

        Select select = new Select(orderButton);

        select.selectByVisibleText("FamilyAlbum");

        WebElement inputQuantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));

        inputQuantity.sendKeys(Keys.BACK_SPACE);
        inputQuantity.sendKeys("2");


        // 8. Click to “Calculate” button
        WebElement calculateButton = driver.findElement(By.className("btn_dark"));
        calculateButton.click();

        // 9. Fill address Info with JavaFaker • Generate: name, street, city, state, zip code
        WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement streetName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement cityName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement stateName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zipCode = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        Faker faker = new Faker();
        customerName.sendKeys(faker.name().fullName());
        streetName.sendKeys(faker.address().streetName());
        cityName.sendKeys(faker.address().city());
        stateName.sendKeys(faker.address().state());
        zipCode.sendKeys(faker.address().zipCode().replaceAll("-",""));


        // 10. Click on “visa” radio button
        WebElement visaButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaButton.click();
        // 11. Generate card number using JavaFaker
        WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        //-----------------------------------------------------
        WebElement cardDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        cardDate.sendKeys("10/25");

        // 12. Click on “Process”
        WebElement processButton = driver.findElement(By.linkText("Process"));
        processButton.click();

        // 13. Verify success message “New order has been successfully added.”
        WebElement theMessageInTheEnd = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
        if (theMessageInTheEnd.isDisplayed()){
            System.out.println("Message displayed. Order placed. PASS!");
        }else {
            System.out.println("Message displayed. Order placed. FAILED!");
        }


        driver.close();
    }
}
