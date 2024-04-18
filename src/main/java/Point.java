import java.awt.Graphics;
public class Point extends Shape {

    private int x;
    private int y;
    private boolean selected=false;

    public Point(int x, int y, boolean selected) {
        this.x = x;
        this.y = y;
        this.selected=selected;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(){}

    public boolean equals(Object obj) {

		if (obj instanceof Point) {
			Point p = (Point) obj;

			if (p.x == this.x && p.y == this.y)

				return true;

			else

				return false;

		} else {

			return false;

		}

	}
    public double distance(int x2, int y2) {
		int dx = x2 - x;
		int dy = y2 - y;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}
    
    public boolean contains(int x, int y) {
		return this.distance(x,y)<=2;
	}
    public String TOString (){
        return "("+this.x+","+this.y+")"; 
    }


    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public boolean GetSelected(){
        return this.selected;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    @Override
    public void moveBy(int byX, int byY) {
        this.x= x+byX;
        this.y= y+byY;
    }
    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
    @Override
    public void moveTo(int x, int y) {
        this.x=x;
        this.y=y;
    }
}
