public class Shape {

    public double compareTo(Point p1, Point p2){
        return p1.rastojanjeIzmedjuDveTacke(p1.getX(), p2.getY(), 0, 0) - p2.rastojanjeIzmedjuDveTacke(p2.getX(), p2.getY(), 0, 0);
    }

    public void moveTo(Point p, int byX, int byY){
        p.x = byX;
        p.y = byY;
    }
    
    public void moveBy(Point p, int byX, int byY){
        p.x += byX;
        p.y += byY;
    }
}
