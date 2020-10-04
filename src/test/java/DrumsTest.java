import enums.PercussionMethod;
import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {
    private Drums drums;

    @Before
    public void before(){
        drums = new Drums("Plastic", "Black", 235.50, 415.99, PercussionMethod.STRIKE);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Plastic", drums.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", drums.getColour());
    }

    @Test
    public void hasBuyingCost(){
        assertEquals(235.50, drums.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingCost(){
        assertEquals(415.99, drums.getSellingPrice(), 0.01);
    }
}

