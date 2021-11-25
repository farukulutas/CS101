import java.util.Scanner;

/**
 * while loops
 * @author Ahmet Faruk Ulutaþ
 * @version 31/10/2019
 */ 
public class lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int value;
      int sum;
      int count;
      double average;
      int max;
      int min;
      
      // program code
      System.out.println( "Please enter the value that show how many values you want to enter; if you enter a negative value, the program will count only positive numbers before negative and quit.");
      value = scan.nextInt();
      sum = 0;
      count = 0;
      average = 0;
      max = value;
      min = value;
      
      while ( value >= 0 )
      {
         if ( value > max )
         {
            max = value;
         }
         if ( value < min )
         {
            min = value;
         }
         sum = sum + value;
         count++;
         average = sum / (double)count;
         value = scan.nextInt();
      }
      System.out.println( " The average is " + average );
      System.out.println( " The maximum value is " + max );
      System.out.println( " The minimum value is " + min );
   }
}