import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano  {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Steinway", "Black", 1500, 1800);
    }

    @Test
    public void canPlay() {
        assertEquals("I don't like mondays", piano.play());
    }

}
