package assg1_youngch20;

// Charles Young YOUNGCH20

import java.util.Scanner;

public class CountFamilies {
public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  int size = 0;
  double maxIncome = 0;
  double percentIncome = 0;
  int familyBelow = 0;
  
  //prompts the user
  System.out.println("Please enter the number of families: ");
  size = input.nextInt();
  double familyIncome[] = new double[size];
  for(int i=0; i<familyIncome.length; i++){
    System.out.println("Enter an income: " );
    familyIncome[i] = input.nextDouble();
  }
  
  System.out.println();
  for(int i = 0; i<familyIncome.length; i++){
    System.out.printf("Enter an income: "+familyIncome[i]);
    System.out.println();
    if(familyIncome[i] > maxIncome){
      maxIncome = familyIncome[i];
    }
   }
    System.out.printf("The maximum income is: "+ maxIncome);
    System.out.println();
    percentIncome = maxIncome * 0.10;
  
    System.out.println("The incomes of families making less than 10% of the maximum are: ");
    for(int i = 0; i < familyIncome.length; i++){
      if(familyIncome[i] < percentIncome){
      	System.out.println(familyIncome[i]);
        familyBelow++;
      }
    }
    System.out.println("for a total of " + familyBelow + " families");
input.close();
}

}
