import enums.ReedCount;
import instruments.Drums;
import instruments.Flute;
import instruments.Trumpet;
import miscellaneousItems.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;

    private DrumSticks drumSticks;
    private Flute flute;
    private Trumpet trumpet;

    @Before
    public void before(){
        shop = new Shop();
        drumSticks = new DrumSticks("A lovely pair of walnut drum sticks", 8.50, 17.99);
        flute = new Flute("Nickel", "Silver", 40.00, 89.99, ReedCount.NONE);
        trumpet = new Trumpet("Brass", "Copper", 81.25, 230.00, true);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(drumSticks);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(drumSticks);
        shop.removeFromStock(drumSticks);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculateTotalProfit(){

    }
}
