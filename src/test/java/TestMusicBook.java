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

    @Test
    public void hasBuyPrice() {
        assertEquals(2, book.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(12, book.getSellPrice());
    }

    @Test
    public void getMarkUpPrice() {
        assertEquals(10, book.getMarkUpPrice());
    }

}
