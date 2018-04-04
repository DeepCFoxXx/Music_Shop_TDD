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
    public void hasColor() {
        assertEquals("White", piano.getColor());
    }

    @Test
    public void hasType() {
        assertEquals("Grand Piano", piano.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(20000, piano.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(40000, piano.getSellPrice());
    }

    @Test
    public void getMarkupPrice() {
        assertEquals(20000, piano.getMarkupPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("I don't like mondays", piano.play());
    }

}
