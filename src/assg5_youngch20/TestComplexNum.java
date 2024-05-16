/**
 * Charles Young
 */
package assg5_youngch20;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestComplexNum {
	private ComplexNum  a,b,c;

	
	
	
	
	
	@Before
	public void setUpTest() {
		a= new ComplexNum(2,67);
		b = new ComplexNum(3);
		c = new ComplexNum();
	}
	
	
	
	@Test
	public void testTwoConstuctors() {
		assertEquals("Real Number",2.0, a.getReal(),0.01);
		assertEquals("Imaginary Number",67, a.getImaginary(),0.01);
	}
	@Test
	public void testComplexGetReal() {
		assertEquals("Real Number",2, a.getReal(),0.01);
		assertEquals("Real Number",0, c.getReal(),0.01);
	}
	@Test
	public void testComplexGetImaginary() {
		assertEquals("Imaginary Number",67, a.getImaginary(),0.01);
		assertEquals("Imaginary Number",0, c.getImaginary(),0.01);
	}
	@Test
	public void testComplexSetReal() {
		a.setReal(7);
		assertEquals("Real Number",7.0, a.getReal(),0.01);
	}
	@Test
	public void testComplexSetImaginary() {
		a.setImaginary(5);
		assertEquals("Imaginary Number",5, a.getImaginary(),0.01);
	}
	@Test
	public void testComplexAdd() {
		ComplexNum result = a.add(b);
        assertEquals(5, result.getReal(), 0);
        assertEquals(67, result.getImaginary(), 0);
	}
	@Test
	public void testComplexSub() {
		 ComplexNum result = a.sub(c);
	        assertEquals(-2, result.getReal(), 0);
	        assertEquals(-67, result.getImaginary(), 0);
	}
	@Test
	public void testComplexMul() {
		ComplexNum result = b.mul(c);
        assertEquals(0, result.getReal(), 0);
        assertEquals(0, result.getImaginary(), 0);
	}
	@Test
	public void testComplexNeg() {
		ComplexNum result = b.neg();
        assertEquals(-3, result.getReal(), 0);
        assertEquals(0, result.getImaginary(), 0);
	}
	public void testComplexToString() {
		assertEquals("Complex Number",7 +"+" +5+"i" ,a.toString());
	}
	public void testEquals() {
	
		
		assertTrue("This should be True: ", b.equals(b));
		assertFalse("This should be False: ", a.equals(c));
		
	}
}
