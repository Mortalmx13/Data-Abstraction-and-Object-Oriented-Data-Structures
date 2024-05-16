package activity6;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCourse1 {

	class TestCourse {

		private Course a,b,c;
		
		@Before
		public void setUpTest() {
			a= new Course("1","C++");
			b = new Course("2", "Java", 4);
			c = new Course("3", "JavaScript",3);
		}
		
		@Test
		public void testTwoConstuctors() {
			assertEquals("num","1", a.getcourse());
			assertEquals("title","Java", a.getTitle());
		}
		@Test
		public void testThreeConstuctors() {
			assertEquals("num","3", b.getcourse());
			assertEquals("title","JavaScript", b.getTitle());
			assertEquals("credit",3, b.getCredit());
		}
		@Test
		public void testCourseTitle() {
			assertEquals("title","Java", a.getTitle());
		}
		@Test
		public void testCourseNum() {
			assertEquals("course number",3, a.getcourse());
		}
		@Test
		public void testCourseCredit() {
			assertEquals("course credit",3, c.getCredit());
		}
		@Test
		public void testCourseToString() {
			assertEquals("course title in toString","C++", b.getTitle().toString());
			assertEquals("course number in toString","2", b.getcourse().toString());
		}

}
