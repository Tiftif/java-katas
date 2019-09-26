import org.junit.Assert;
import org.junit.Test;

public class HelloYouTest {

    @Test
    public void testHelloYou() throws Exception {
        HelloYou myHelloYou = new HelloYou();
        Assert.assertEquals("Hello Barbara", myHelloYou.getName("Barbara"));
        Assert.assertEquals("Hello World", myHelloYou.getName(null));
    }

}
