import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {


    Shop shop;
    ISell item;

    @Before
    public void before() {
        shop = new Shop("Rock City");
        item = new MusicBook("Guns and Roses Appetite for Tabs", 2, 12);

    }

    @Test
    public void hasName() {
        assertEquals("Rock City", shop.getName());
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.stockCount());
    }

}
