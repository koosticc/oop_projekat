import java.lang.Math;

public class Point extends Shape{

    int x;
    int y;
    boolean selected;

    public Point(){
        this.x = 0;
        this.y = 0;
        this.selected = false;
    }

    public double daLiSadrziTacku(int x1, int y1, int x2, int y2){
        return rastojanjeIzmedjuDveTacke(x1, y1, x2, y2);
    }

    public double rastojanjeIzmedjuDveTacke(int x1, int y1, int x2, int y2){
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    public String toString(int x, int y){
        String s = "(" + Integer.toString(x) + "," + Integer.toString(y) + ")";
        return s;
    }

    public boolean equals(Point p1, Point p2){
        if(p1.x == p2.x && p1.y == p2.y){
            return true;
        }
        else{
            return false;
            
        }
    }

    @Override
    public double compareTo(Point p1, Point p2) {
        return super.compareTo(p1, p2);
    }

    @Override
    public void moveBy(Point p, int x, int y){
        super.moveBy(p, x, y);
    }

    @Override
    public void moveTo(Point p, int x, int y){
        super.moveTo(p, x, y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
