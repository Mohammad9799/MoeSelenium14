package synchronizarionTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.praticeCybertekPages.DynamicLoading2Page;
import utillites.Driver;

public class ThreadSleepTests  {

   @Test
    public void threadSleepTest() throws Exception{

       Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");

       DynamicLoading2Page  dynamicLoading2Page = new DynamicLoading2Page();

       dynamicLoading2Page.startButton.click();

       Thread.sleep(6000);

       Assert.assertTrue(dynamicLoading2Page.helloWordText.isDisplayed(),"is not displayed!!");

   }





}
