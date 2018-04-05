import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMusicStand {

    MusicStand stand;

    @Before
    public void before() {
        stand = new MusicStand("Red", 5, 10);
    }

    @Test
    public void hasColor() {
        assertEquals("Red", stand.getColor());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5, stand.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10, stand.getSellPrice());
    }

    @Test
    public void hasMarkupPrice() {
        assertEquals(5, stand.getMarkupPrice());
    }

}
