package activity4;

public class SpecialDate extends Date {
String desc;

public SpecialDate() {
	desc = "";
}

public SpecialDate(int Nmonth,int Nday,int Nyear, String Ndesc) {
	super();
	 Nmonth= 3;
	 Nday= 28;
	 Nyear= 2043;
	 Ndesc = "Moms B day";
}

public void setDesc(String Newdesc) {
	desc = Newdesc;
}
public String getDesc() {
	return desc;
}
@Override
public String toString() {
	
	return getMonth() +"/"+getDay()+"/"+getYear()+","+desc;
}
@Override
public void printDate() {
	System.out.println(getMonth() +"/"+getDay()+"/"+getYear()+","+desc);
}
}
