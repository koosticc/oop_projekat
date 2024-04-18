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
        Point test3 = new Point();
        Point test4 = new Point();
        assertFalse(test3.GetSelected());
        assertFalse(test4.GetSelected());
    }
    @Test
    public void testEquals() {
        Point test1 = new Point(1,2);
        Point test2 = new Point(2,1);
        assertFalse(test1.equals(test2));

    }
    @Test
    public void testDistance() {
        Point test1 = new Point(2, 2);
        double d1=test1.distance(2, 0);
        assertEquals(d1, 2);

    }
    @Test
    public void testContains() {
        Point test1 = new Point(2, 2);
        double d1=test1.distance(2, 0);
        assertTrue(test1.contains(3, 3));

    }
    @Test
    public void TestExtends(){
        assertTrue(Shape.class.isAssignableFrom(Point.class));
        assertFalse(Point.class.isAssignableFrom(Shape.class));
    }

}
