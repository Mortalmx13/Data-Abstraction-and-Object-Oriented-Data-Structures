package activity7;

public class StudentMIS {

	public static void main(String[] args) {
		String fName = "assg6_Data.txt";
	
		
		StudentList list = new StudentList();
		list.loadData(fName);
		list.displayRoster();
		
	}

}
