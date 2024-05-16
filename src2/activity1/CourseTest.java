package activity1;

public class CourseTest {

	public static void main(String[] args) {
		Course c1 = new Course("2540","Advanced Data Structure",3);
		Course c2 = new Course("3584","Computational Linear Algebra",3);
		System.out.println();
		System.out.println(c1.toString());
		System.out.println();
		System.out.println(c2.toString());
		System.out.println();
		c1.setTitle("cool title");
		c1.setCredit(4);
		System.out.println(c1.getTitle()+" "+ c1.getCredit());
		System.out.println();
		c1.printinfo();
		System.out.println();
		c2.printinfo();
	}
	
}
