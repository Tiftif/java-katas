import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() throws Exception {
        FizzBuzz myFizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", myFizzBuzz.getWord(3));
        Assert.assertEquals("Buzz", myFizzBuzz.getWord(5));
        Assert.assertEquals("FizzBuzz", myFizzBuzz.getWord(15));
        Assert.assertEquals("11", myFizzBuzz.getWord(11));
        Assert.assertEquals("17", myFizzBuzz.getWord(17));
    }

}
