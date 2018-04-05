import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMusicStand {

    MusicStand stand;

    @Before
    public void before() {
        stand = new MusicStand("Red", 5, 8);
    }

    @Test
    public void hasColor() {
        assertEquals("Red", stand.getColor());
    }

}
