import java.lang.Math;

public class Point {

    double x;
    double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public double rastojanjeIzmedjuDveTacke(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}
