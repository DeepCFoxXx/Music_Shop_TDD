import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano  {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("SHADD", "White", 20000, 40000);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("SHADD", piano.getManufacturer());
    }

    @Test
    public void canPlay() {
        assertEquals("I don't like mondays", piano.play());
    }

}