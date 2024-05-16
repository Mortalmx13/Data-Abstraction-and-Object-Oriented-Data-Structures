/**
 * Charles Young sets date and print date
 */
package activity3;

public class DateTest {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(4,4,2000);
		Date d3 = new Date(5,8,2002);
		
		//toString
		System.out.println("---Using toString---");
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		System.out.println();
		
		//set methods
		d2.setDay(9);
		d2.setMonth(7);
		d2.setYear(2013);
		
		//get methods
		System.out.println("---Using get/set methods---");
		System.out.println(d2.getMonth()+"/"+d2.getDay()+"/"+d2.getYear());
		System.out.println();
		System.out.println("---Using printDate---");
		d1.printDate();
		d2.printDate();
		d3.printDate();
		
	}

}
