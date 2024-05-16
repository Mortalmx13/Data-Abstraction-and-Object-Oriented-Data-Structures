/*
 * Charles Young 
 */
package activity3;
//1184
public class Date {

	private int month, day, year;
	
	public Date() {
		month = 1;
		day = 1;
		year = 2000;
		
	}
public Date(int Nmonth,int Nday,int Nyear) {
		month = Nmonth;
		day = Nday;
		year = Nyear;
	}
/**
 * sets month value
 * @param newMonth
 */
public void setMonth(int newMonth) {
	month = newMonth;
}
/**
 * sets day value
 * @param newDay
 */
public void setDay(int newDay) {
	day = newDay;
}
/**
 * sets year value 
 * @param newYear
 */
public void setYear(int newYear) {
	year = newYear;
}
/**
 * gets month value
 * @return
 */
public int getMonth() {
	return month;
}
/**
 * gets day value
 * @return
 */
public int getDay() {
	return day;
}
/**
 * gets year value
 * @return
 */
public int getYear() {
	return year;
}
/**
 * to return the values
 */
public String toString() {
	return month +"/"+day+"/"+year;
}
/**
 * prints out the date
 */
public void printDate() {
	System.out.println( month +"/"+day+"/"+year);
}


}
