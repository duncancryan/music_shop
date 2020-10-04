import miscellaneousItems.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("A lovely pair of walnut drum sticks", 8.50, 17.99);
    }

    @Test
    public void hasDescription(){
        assertEquals("A lovely pair of walnut drum sticks", drumSticks.getDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(8.50, drumSticks.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(17.99, drumSticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(112, drumSticks.calculateMarkUp());
    }
}
