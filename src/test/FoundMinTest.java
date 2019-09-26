import org.junit.Assert;
import org.junit.Test;

public class FoundMinTest {

    @Test
    public void testTrue() throws Exception {
        FoundMin myFoundMin = new FoundMin();
        Assert.assertEquals(1, myFoundMin.findMinInArray(new int[]{5, 8, 9, 2, 1}));
        Assert.assertEquals(-4, myFoundMin.findMinInArray(new int[]{5, 8, 9, -4, 1}));
    }

    // TODO
}
