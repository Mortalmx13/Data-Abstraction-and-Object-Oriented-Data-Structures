package assg5_youngch20;
//Charles Young YOUNGCH20
public class Point {
private int x, y;

public Point() {
	x=0;
	y=0;
}
public Point(int xCord,int yCord) {
	this.x = xCord;
	this.y = yCord;
}
//gets xcord
public int getX() {
	return x;
	}
//gets ycord
public int getY() {
	return y;
	}
//sets xcord
public void setX(int newX) {
	x = newX;
	}
//sets ycord
public void setY(int newY) {
	y = newY;
}
//cals the distance of pts x and y
public double distance(Point valXY) {
	return Math.sqrt((x-valXY.x)*(x-valXY.x) + (y-valXY.y)*(y-valXY.y));
	}

public String toString() {
	String str = "(" + x + ", " + y + ")";
	return str;
	}
//sees if the points equal each other
public boolean equal(Object spot) {
    if (!(spot instanceof Point)) {
          return false;
      }
      return (x == ((Point) spot).x && y == ((Point) spot).y);
}
}
