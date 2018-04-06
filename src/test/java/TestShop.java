import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {


    Shop shop;
    ISell musicBook;
    ISell piano;
    ISell musicStand;
    ISell guitar;

    @Before
    public void before() {
        shop = new Shop("Rock City");
        musicBook = new MusicBook("Guns and Roses Appetite for Tabs", 2, 12);
        piano = new Piano("SHADD", "White", 20000, 40000);
        musicStand = new MusicStand("Red", 5, 10);
        guitar = new Guitar("Gibson SG","Black", 6, 800, 1600);
    }

    @Test
    public void hasName() {
        assertEquals("Rock City", shop.getName());
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddGuitarToStock() {
        guitar = new Guitar("Gibson SG","Black", 6, 800, 1600);
        shop.addToStock(guitar);
        assertEquals(1, shop.stockCount());
    }

}
