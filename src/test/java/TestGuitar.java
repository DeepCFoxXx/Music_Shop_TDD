import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Gibson SG","Black", 6, 800, 1600);
    }

    @Test
    public void hasModel() {
        assertEquals("Gibson SG", guitar.getModel());
    }

    @Test
    public void hasColor() {
        assertEquals("Black", guitar.getColor());
    }

    @Test
    public void hasType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void getCostPrice() {
        assertEquals(800, guitar.getCostPrice());
    }

    @Test
    public void getRetailPrice() {
        assertEquals(1600, guitar.getRetailPrice());
    }

    @Test
    public void getMarkupPrice() {
        assertEquals(800, guitar.getMarkupPrice());
    }

}
