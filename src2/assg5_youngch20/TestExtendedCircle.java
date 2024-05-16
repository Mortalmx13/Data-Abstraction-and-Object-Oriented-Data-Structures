package assg5_youngch20;
//Charles Young YOUNGCH20
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


class TestExtendedCircle {

	
	
private Point x,y,w,z,u;
private ExtendedCircle a,b,c;
	
	@Before
	public void setUp() {
		x= new Point();
		y= new Point(1,1);
		w= new Point(3,3);
		z= new Point(5,5);
		u= new Point (3,3);
		c= new ExtendedCircle (3,y);
		b = new ExtendedCircle(2,x);
		a = new ExtendedCircle(3,y);
	}
	
	@Test
	public void testDefaultConstructor() {
		assertEquals("Cord of center", a.getC(),a.getC());
		assertEquals("Radius:", 3, a.getR(),1);
	}
	@Test
	public void testOneParamConstructor() {
		
		
		assertEquals("Radius:", 2, b.getR(),1);
		
	}
	@Test
	public void testTwoParamConstructor() {
		
		assertEquals("Cord of center", b.getC(),b.getC());
		assertEquals("Radius:", 2, b.getR(),1);
		
	}
	@Test
	public void testToString() {
		assertEquals("toString test", "Radius:" + 3 + "Center " + y , a.toString());
		
	}
	@Test 
	public void testGetR() {
		assertEquals("Radius:", 2, b.getR(),1);
	}
	@Test 
	public void testGetC() {
		assertEquals("Cord of center:", c.getC(),c.getC());
	}
	@Test 
	public void testSetR() {
		a.setR(2);
		assertEquals("Radius:", 2, a.getR(),1);
	}
	@Test 
	public void testSetC() {
		a.setC(x);
		assertEquals("Cord of center:", a.getC(),a.getC());
	}
	@Test 
	public void testCompArea() {
		assertEquals("Area of A:",Math.PI*2*2,a.compArea(),1);
	}
	@Test 
	public void testCompCircumference() {
		assertEquals("Circumference of A:",Math.PI*2*2,a.compCircumference(),1);
	}
	@Test 
	public void testPositionToCircle() {
		assertEquals("Position of A:",a.positionToCircle(x));
	}
	@Test 
	public void testShift() {
		assertEquals("Shift of C:",c.shift(3, 4));
	}
	@Test 
	public void testScale() {
		assertEquals("Scale of C:",c.scale(3));
	}
	@Test 
	public void testOverlap() {
		assertTrue("Does A and C overlap?:", a.overlap(c));
		assertTrue("Does A and B overlap?:", a.overlap(b));
	}
	@Test 
	public void testEquals() {
		assertTrue("Does A and B equal: ",a.equals(b));
		assertFalse("Does A and C equal: ",a.equals(c));
	}
}
