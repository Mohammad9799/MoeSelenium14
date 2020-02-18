package framework;

import org.testng.annotations.Test;
import utillites.Driver;

public class DriverTest {

    @Test
    public void test(){
        Driver.getDriver().get("https://www.amazon.com");
    }



}
