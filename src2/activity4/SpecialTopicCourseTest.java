package activity4;

public class SpecialTopicCourseTest {

	public static void main(String[] args) {
		SpecialTopicCourse c1 = new SpecialTopicCourse("CSCI4905", "Special Topic in Computer Science", "Image Processing" );
		SpecialTopicCourse c2 = new SpecialTopicCourse("CSCI2540", "object-oriented", "java", 4);
		Course c3 = new Course("CSCI3585", "Computational linear algebra");
		c1.setTopic("This is a new topic");
		System.out.println(c1.getTopic());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		c1.printinfo();
		c2.printinfo();
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}

}
