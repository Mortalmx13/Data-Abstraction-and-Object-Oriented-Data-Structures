package activity7;
import java.util.*;
import java.io.*;
public class ListPractice {
public static void main(String[] args) {
ArrayList<Date> dateList = new ArrayList<Date>();
String fileName = "activity7_input.txt";
Scanner input = null;
String line;
String[] arrStr;
try {
input = new Scanner(new File(fileName));
}
catch(FileNotFoundException e) {
System.out.println("Cannot find input file");
System.exit(1);
}
while (input.hasNextLine()) {
line = input.nextLine();
arrStr = line.split("/", 3);   // extract month, day, and year
dateList.add(new Date(Integer.parseInt(arrStr[0]), 
Integer.parseInt(arrStr[1]), Integer.parseInt(arrStr[2])));
}
// Sort all the dates
Collections.sort(dateList);
Iterator<Date> iter = dateList.iterator();
while (iter.hasNext()) {
iter.next().printDate();
}
input.close();
}
}