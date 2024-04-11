public class Point {

    private int x=5;
    private int y=5;
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
}
