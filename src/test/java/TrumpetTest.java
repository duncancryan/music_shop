import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Brass", "Copper", 81.25, 230.00, true);
    }

    @Test
    public void doesHaveValves(){
        assertTrue(trumpet.checkValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Paaaarrrp! Fraaaapp!", trumpet.play());
    }

    @Test
    public void canCalculateMarkUpPercentage(){
        assertEquals(183, trumpet.calculateMarkUpPercentage());
    }

}
