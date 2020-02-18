package testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGClass {


    @BeforeClass
    public void setUp(){
        System.out.println("beforeClass is running...");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method is running...");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod is running...");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass is running...");
    }

    @Test
    public void firstTest(){
        System.out.println("1st test is running...");
        Assert.assertEquals("actualValue","actualValue","First test is failed");
    }







    @Test
    public void secondTest(){
        System.out.println("2nd test running...");
        String letter = "b";
        Assert.assertTrue("sentence".contains(letter),"Sentence does not contain: " + letter);
    }




}
