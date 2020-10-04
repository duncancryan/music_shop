import enums.StringMethod;
import instruments.AcousticGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AcousticGuitarTest {

    private AcousticGuitar acousticGuitar;

    @Before
    public void before(){
        acousticGuitar = new AcousticGuitar("Wood", "Brown", 64.50, 149.99, 6, StringMethod.STRUM, false);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, acousticGuitar.getNumberOfStrings());
    }

    @Test
    public void hasStringMethod(){
        assertEquals("Strum", acousticGuitar.getMethodString());
    }

    @Test
    public void isNotElectric(){
        assertFalse(acousticGuitar.isElectric());
    }

    @Test
    public void canPlay(){
        assertEquals("Struuuuumm, Struum Strum!", acousticGuitar.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(85.49, acousticGuitar.calculateMarkUp(), 0.01);
    }
}
