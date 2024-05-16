package activity2;


public class TempConverterTable
{
   public static void main(String[] args)
   {
int[][] table = new int[41][1];
for (int row = 0; row <= 40; row++)
for (int column = 0; column < 1; column++)
table[row][column] = convert (row);

System.out.println( );
System.out.println("Celsius" + "\t" +  "Fahrenheit  ");
for (int row = 0; row <= 40; row++)
{
System.out.print((row ) + "\t");
for (int column = 0; column < 1; column++)
System.out.print( table[row][column] + "  ");
System.out.println( );
}
   }
   
  
   public static int convert ( int celsius )
   {
      double answer = ((celsius *  9.0/5) + 32);
      
      return (int)(Math.round(answer));
   }
}