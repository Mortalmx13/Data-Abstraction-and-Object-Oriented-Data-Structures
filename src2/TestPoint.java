import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

	public class TestPoint extends TestCase {

		private Point x, y;
		
		protected void setUp() {
			x = new X();
			y = new Y(6);
		}
		
		public void testDefaultConstructor() {
			assertEquals("Counter value:", 0, x.getX());
		}
		public void testOneParamConstructor() {
			assertEquals("Counter value:", 6, y.getY());
		}
		
		public void testToString() {
			assertEquals("Counter value:", "0", x.toString());
			assertEquals("Counter value:", "6", y.toString());
		}


}