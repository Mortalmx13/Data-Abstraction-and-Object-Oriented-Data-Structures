/** * @author Qin Ding * This program tests the Point class.  */
package activity3;
public class PointTest {
	public static void main(String[] args) {
		Point p1, p2, p3;
		p1 = new Point();
		p2 = new Point(2.5, 4.8);
		p3 = new Point (3, 7.5);
		System.out.println("The three points are:");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("The distance between " + p1.toString() + " and " + p2.toString() + " is: " + p1.distance(p2));
		System.out.println("The distance between " + p1.toString() + " and " + p3.toString() + " is: " + p1.distance(p3));
		System.out.println("The distance between " + p3.toString() + " and " + p3.toString() + " is: " + p2.distance(p3));
		}
	}