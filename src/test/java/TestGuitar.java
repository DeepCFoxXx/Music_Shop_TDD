import org.junit.Before;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Gibson SG","Black", 6, 800, 1600);
    }


}
