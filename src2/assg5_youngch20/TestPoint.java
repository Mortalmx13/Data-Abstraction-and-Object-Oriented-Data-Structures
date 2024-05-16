package assg5_youngch20;
//Charles Young YOUNGCH20
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPoint {

	private Point x, y,w,z,u;
	
	@Before
	public void setUp() {
		x= new Point();
		y= new Point(1,1);
		w= new Point(3,3);
		z= new Point(5,5);
		u= new Point (3,3);
		
	}
	
	
	@Test
	public void testDefaultConstructor() {
		assertEquals("Cord at X:", 0, x.getX());
		assertEquals("Cord at X:", 0, x.getY());
	}
	@Test
	public void testTwoParamConstructor() {
		assertEquals("Cord at Y:", 1, y.getY());
		assertEquals("Cord at X:", 1, y.getX());
	}
	@Test
	public void testToString() {
		assertEquals("Cord at X:", "(" + 0 + ", " + 0 + ")", x.toString());
		
	}
	@Test
	public void testGetX() {
		assertEquals("Cord at X:", 5, z.getX());
	}
	@Test
	public void testGetY() {
		assertEquals("Cord at X:", 5, z.getY());
	}
	@Test
	public void testSetX() {
		z.setX(7);
		assertEquals("Cord at X:", 7, z.getX());
	}
	@Test
	public void testSetY() {
		z.setY(7);
		assertEquals("Cord at X:", 7, z.getY());
	}
	@Test
	public void testDistance() {
		assertEquals("Distance is: ", 4.24264068, w.distance(x),.1 );
	}
	@Test
	public void testEquals() {
	
		
		assertTrue("This should be True: ", w.equal(u));
		assertFalse("This should be False: ", w.equal(y));
		
	}

	
	
	

}
