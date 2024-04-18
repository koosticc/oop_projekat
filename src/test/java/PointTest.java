import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void testGET() {
        Point test1 = new Point(5, 7);
        assertEquals(test1.getX(), 5);
        assertEquals(test1.getY(), 7);

    }
    @Test
    public void testSET() {
        Point test1 = new Point();
        test1.setX(5);
        test1.setY(7);   
        assertEquals(test1.getX(), 5);
        assertEquals(test1.getY(), 7);

    }
    @Test
    public void testSELECTABLE() {
        Point test3 = new Point(3, 5, true);
        Point test4 = new Point(3, 5, false);
        assertTrue(test3.GetSelected());
        assertFalse(test4.GetSelected());

    }
    @Test
    public void testDefault() {
        Point test1 = new Point();
        assertNotEquals(test1, null);
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
    @Test
    public void KonstruktorTest(){
        Point test = new Point(4,5,true);
        assertEquals(test.getX(), 4);
        assertEquals(test.getY(),5);
        assertEquals(test.GetSelected(), true);
    }
    @Test
    public void Test_Za_TOString(){
        Point test=new Point(3, 5);
        String teststring=test.TOString();
        String text= "(3,5)";
        assertEquals(teststring, text);
    }
    @Test
    public void testMoveTo() {
        Point test = new Point(2, 3);
        Point test1 = new Point(5, 6);
        test.moveTo(5, 6);
        assertTrue(test.equals(test1));
    }

}
