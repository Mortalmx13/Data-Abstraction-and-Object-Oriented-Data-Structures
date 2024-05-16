package activity6;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UGStudentTest {

	
	private UGStudent a,b,c;
	
	
	@Before
	public void setUpTest() {
		a= new UGStudent(1,"Steven","CSCI");
		b = new UGStudent(2, "Fred", "English");
		c = new UGStudent();
	}
	
	
	@Test
	public void testThreeConstuctors() {
		assertEquals("Major","English", b.getMajor());
		assertEquals("Name","Fred", b.getName());
		assertEquals("Id",1, a.getId());
	}
	@Test
	public void testUGStudentMajor() {
		assertEquals("Major","undeclared", c.getMajor());
	}
}
