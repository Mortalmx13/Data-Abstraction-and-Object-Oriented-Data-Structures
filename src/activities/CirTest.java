package activities;

public class CirTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cir c1,c2;
c1 = new Cir();
c2 = new Cir(2.5);


System.out.println(c1.getRadius());
System.out.println(c2.getRadius());

c1.setRadius(3);

System.out.println(c1.getRadius());

System.out.println(c1.toString());


	}

}
