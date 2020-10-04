import enums.ReedCount;
import instruments.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FluteTest {

    private Flute flute;

    @Before
    public void before(){
        flute = new Flute("Nickel", "Silver", 40.00, 89.99, ReedCount.NONE);
    }

    @Test
    public void hasReedCountOfNone(){
        assertEquals(0, flute.getReedCountInt());
    }

    @Test
    public void canPlay(){
        assertEquals("Oooh, oooohhooohh", flute.play());
    }
}
