import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMusicBook {

    MusicBook book;

    @Before
    public void before() {
        book = new MusicBook("Guns and Roses Appetite for Tabs", 2, 12);
    }

    @Test
    public void hasTitle() {
        assertEquals("Guns and Roses Appetite for Tabs", book.getTitle());
    }

}
