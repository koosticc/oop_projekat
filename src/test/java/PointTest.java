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

    @Test
    public void test_rastojanjeIzmedjuDveTacke() {
        Point test = new Point();
        assertEquals(test.rastojanjeIzmedjuDveTacke(2, 2, 4, 2), 2);
    }

    @Test
    public void test_daLiSadrziTacku(){
        Point test = new Point();
        assertTrue(test.daLiSadrziTacku(0, 0, 0, 0) <= 2);
    }

    @Test
    public void test_toString(){
        Point test = new Point();
        assertEquals(test.toString(3, 2), "(3,2)");
    }

    @Test
    public void test_compareTo(){
        Point test1 = new Point(2, 2);
        Point test2 = new Point(2, 2);
        assertEquals(test1.compareTo(test1, test2), 0);
    }

    @Test
    public void test_equals(){
        Point test1 = new Point();
        Point test2 = new Point();
        assertTrue(test1.equals(test1, test2));
    }
}
