import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void testGET() {
        Point test = new Point(5, 7);
        assertEquals(test.getX(), 5);
        assertEquals(test.getY(), 7);

    }
    @Test
    public void testSET() {
        Point test = new Point();
        test.setX(5);
        test.setY(7);   
        assertEquals(test.getX(), 5);
        assertEquals(test.getY(), 7);

    }
    @Test
    public void testSELECTABLE() {
        Point test1 = new Point(3, 5, true);
        Point test2 = new Point(3, 5, false);
        assertTrue(test1.GetSelected());
        assertFalse(test2.GetSelected());

    }
    @Test
    public void testDefault() {
        Point test1 = new Point();
        Point test2 = new Point();
        assertFalse(test2.GetSelected());

    }
    @Test
    public void testEquals() {
        Point test1 = new Point(1,2);
        Point test2 = new Point(2,1);
        assertFalse(test1.equals(test2));

    }
}
