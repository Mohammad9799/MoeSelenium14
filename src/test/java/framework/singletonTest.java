package framework;

import org.testng.annotations.Test;

public class singletonTest {

    @Test
    public void test(){
        String str1 = Singleton.getWord();

        String str2 = Singleton.getWord();


        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
    }
}
