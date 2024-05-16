package activity6;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
private Student  a,b,c;


@Before
public void setUpTest() {
	a= new Student(2,"Billy");
	b = new Student(3, "Rob");
	c = new Student();
}





@Test
public void testTwoConstuctors() {
	assertEquals("Id",2, a.getId());
	assertEquals("name","Billy", a.getName());
}
@Test
public void testStudentId() {
	assertEquals("Id",2, a.getId());
}
@Test
public void testStudentName() {
	assertEquals("Name","unknown", c.getName());
}
@Test
public void testStudentToString() {
	assertEquals("Student title in toString","Rob", b.getName().toString());
}

}
