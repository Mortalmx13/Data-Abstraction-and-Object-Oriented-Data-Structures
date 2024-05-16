package activities;

import java.util.Scanner;
public class ThreeDimPointTest {

	public static void main(String[] args) {
		
		int x1,x2,y1,y2,z1,z2;
		
		double dis;
		
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("enter x1 point");
		   
         x1=sc.nextInt();
	
         System.out.println("enter y1 point");
	   
         y1=sc.nextInt();

	    System.out.println("enter x2point");
	   
         x2=sc.nextInt();

	    System.out.println("enter y2 point");
	   
         y2=sc.nextInt();  
         
         System.out.println("enter z1 point");
  	   
         z1=sc.nextInt(); 
         
         System.out.println("enter z2 point");
  	   
         z2=sc.nextInt();  
         
         dis=ThreeDimPointTest.calDis(x1,y1,x2,y2,z1,z2);
	   	    
   	   
         
          
		
	}
	
	
}
