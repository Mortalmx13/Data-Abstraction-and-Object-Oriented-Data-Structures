//Charles Young
package assg2_youngch20;

public class ComplexNumDemo {

	public static void main(String[] args) {
		ComplexNum c1 = new ComplexNum();
		ComplexNum c2 = new ComplexNum(6.1);
		ComplexNum c3 = new ComplexNum(1.5 , 2.5);
		
		System.out.println(c3.toString());
		System.out.println(c2.toString());
		System.out.println();
		System.out.println(c1.getReal());
		System.out.println(c2.getReal());
		System.out.println(c3.getReal());
		
		System.out.println();
		System.out.println(c1.getImaginary());
		System.out.println(c2.getImaginary());
		System.out.println(c3.getImaginary());
		
		System.out.println();
		c3.setReal(4);
		c3.setImaginary(9);
		System.out.println(c3.toString());
		
		System.out.println();
		c3.add(c2);
		System.out.println("Add: "+c2.toString());
		
		System.out.println();
		c3.sub(c2);
		System.out.println("Sub: "+ c2.toString());
		
		System.out.println();
		c3.mul(c2);
		System.out.println("Mul: "+c2.toString());
		
		System.out.println();
		System.out.println("neg: "+c3.neg());
		
		System.out.println();
		System.out.println("Does c3 and c2 equal:"+c3.equals(c2));
		c3.setReal(4);
		c3.setImaginary(9);
		c2.setReal(4);
		c2.setImaginary(9);
		System.out.println("Does c3 and c2 equal:"+c3.equals(c2));
	}
}
