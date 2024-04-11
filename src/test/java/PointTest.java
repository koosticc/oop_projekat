import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void test_getXTrebaDaVrati5AkoJeKlasaInstanciranaSaXjednako5() {
        Point test = new Point(5, 5);
        assertEquals(test.getX(), 5);
    }

    @Test
    public void test_prazanKonstruktor() {
        Point test = new Point();
        assertNotEquals(test, null);
    }
}
