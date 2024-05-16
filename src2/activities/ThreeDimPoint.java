package activities;

import activity1.Point;

public class ThreeDimPoint extends Point{

	private double z;
	public ThreeDimPoint() {
	super();
		z=0;
	}
	
	public ThreeDimPoint (double xCoor, double yCoor, double zCoor) {
		super();
		z = zCoor;
		
	}
	public double getZ() {
		return z;
	}
	public void setZ(double newZ) {
		z = newZ;
	
}
	public double distance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y)+ (z-p.z)*(z-p.z));
		}
	
	public String toString() {
		String str = "(" + x + ", " + y + ", " + z ")";
		return str;
		}
}
