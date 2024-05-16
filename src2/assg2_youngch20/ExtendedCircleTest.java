package assg2_youngch20;
//Charles Young YOUNGCH20
public class ExtendedCircleTest {
	public static void main(String[] args) {
		Point x1=new Point();
		Point x2=new Point(3,5);
		System.out.println("Cord1:"+x1.toString());
		System.out.println("Cord2:"+x2.toString());
		System.out.println();
		System.out.println("xCord:"+x1.getX());
		System.out.println("yCord:"+x1.getY());
		x1.setX(4);
		x1.setY(7);
		System.out.println("xCord:"+x1.getX());
		System.out.println("yCord:"+x1.getY());
		System.out.println();
		System.out.println("Distance:"+x1.distance(x2));
		System.out.println();
		System.out.println("Does x1 equal x2:"+x1.equal(x2));
		x2.setX(4);
		x2.setY(7);
		System.out.println("Does x1 equal x2:"+x1.equal(x2));
		System.out.println();
		ExtendedCircle s1 = new ExtendedCircle();
		ExtendedCircle s2 = new ExtendedCircle(2.5);
		ExtendedCircle s3 = new ExtendedCircle(7,x2);
		System.out.println("Circle 1: \n"+ s1);
		System.out.println();
		System.out.println("Circle 2: \n"+ s2);
		System.out.println();
		System.out.println("Circle 3: \n"+ s3);
		System.out.println();
		System.out.println("Radius:"+s1.getR());
		System.out.println();
		System.out.println("Center:"+s1.getC());
		System.out.println();
		s1.setC(x2);
		s1.setR(5);
		
		System.out.println("Circumference:"+s1.compCircumference());
		System.out.println();
		
		
		System.out.println("Position to Circle -1=inside , 0=on circle, 1=outside:"+s1.positionToCircle(x2));
		x2.setX(4);
		x2.setY(7);
		System.out.println();
		System.out.println("Position to Circle -1=inside , 0=on circle, 1=outside:"+s1.positionToCircle(x2));
		x2.setX(0);
		System.out.println();
		System.out.println("Position to Circle -1=inside , 0=on circle, 1=outside:"+s1.positionToCircle(x2));
		
		System.out.println();
		System.out.println("Area:"+s1.compArea());
		System.out.println();
		System.out.println("Shift: \n"+s1.shift(3, -2));
		System.out.println();
		System.out.println("Scale:\n"+s1.scale(3));
		System.out.println();
		System.out.println("Equal:"+s1.equals(s3));
		s1.setC(x2);
		s1.setR(3);
		System.out.println();
		s3.setC(x2);
		s3.setR(3);
		System.out.println("Equal:"+s1.equals(s3));
		
		System.out.println("Does the two cicles overlap: "+s1.overlap(s3));
		
	}
}
