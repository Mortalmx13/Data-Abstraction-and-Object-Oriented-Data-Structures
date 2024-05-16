package activity4;

public class SpecialDateTest {

	public static void main(String[] args) {
		
		SpecialDate c1 = new SpecialDate(5, 5, 2025, "being cool day");
		SpecialDate c2 = new SpecialDate();
		Date c3 = new Date(1,4,2005);
		System.out.println(c1.compareTo(c3));
		System.out.println(c2.compareTo(c1));
		c1.setDesc("Not so cool of a day");
		System.out.println(c1.getDesc());
		System.out.println();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println();
		c1.printDate();
		c2.printDate();
		c3.printDate();
	}

}
