package assg2_youngch20;
//Charles Young YOUNGCH20
public class ExtendedCircle {
double radius;
Point center;
public ExtendedCircle() {
	radius = 1;
	center = new Point();
}
public ExtendedCircle(double nradius) {
	this.radius = nradius;
	center = new Point();
}
public ExtendedCircle(double nradius, Point ncenter) {
	this.radius = nradius;
	this.center=ncenter;
	
}
//gets radius
public double getR() {
	return radius;
	}
//gets the center
public Point getC() {
	return center;
	}
//sets a new radius
public void setR(double newR) {
	radius = newR;
	}
//sets new point for center
public void setC(Point newC) {
	center = newC;
}
//cals area
public double compArea() {
	return Math.PI*radius *radius;
}
//cals the circumference
public double compCircumference() {
	return 2*Math.PI*radius;
}
//prints out radius and center cords
public String toString() {
	return "Radius: " + radius + "\n" + "Center: " + center.toString();
	
	}
//you would check if x,y are either larger or smaller or equal to radius
public int positionToCircle(Point c ) {
	if(c.distance(center) < radius) {
		return -1;
	}
	else if(c.distance(center) > radius) {
		return 1;
	}
	else {
		return 0;
	}
}
//shifts the circles location
public ExtendedCircle shift(int shiftX , int shiftY) {
	Point p1 = new Point(this.center.getX() + shiftX, this.center.getY() + shiftY);
	
	return new ExtendedCircle(radius , p1);
}
//sets circle scale
public ExtendedCircle scale(double radiusSize){
	return new ExtendedCircle(radius * radiusSize, center);
}
//test if the two circles overlap
public boolean overlap(ExtendedCircle circleTest){
	if (center.distance(circleTest.center) < radius + circleTest.radius){
		return true;
	}
	else
	{
		return false;
	}
}
//test if the circles equal each other
public boolean equals(Object obj) {
	if (!(obj instanceof ExtendedCircle)) {
        return false;
    }
    return (radius == ((ExtendedCircle) obj).radius && center == ((ExtendedCircle) obj).center);
}
}
