package Selllll;

import org.junit.Assert;
import org.junit.Test;


public class LashadkaTest {
    @Test
    public void loshadkaRenameTest(){
        Lashadka konik = new Lashadka();
        String helloMessage = konik.sayHello();
        Assert.assertTrue(helloMessage.contains("Cesar"));
    }
}
