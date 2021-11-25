import java.util.Scanner;

/**
 * The program calculate the maximum of numbers, minimum of numbers, average of numbers and sum of numbers which are given by the user.
 * @author Ahmet Faruk Ulutaþ
 * @version 31/10/2019
 */ 
public class lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      int value;
      int sum;
      int n;
      double average;
      int max;
      int min;
      
      // program code
      System.out.println( "Please enter 100 values.");
      value = 0;
      sum = 0;
      n = 0;
      average = 0;
      max = value;
      min = value;
      while ( n < 100 )
      {
         value = scan.nextInt();
         sum = sum + value;
         n++;
         average = sum / (double)n;
         if ( value > max )
         {
            max = value;
         }
         if ( value < min )
         {
            min = value;
         }
         System.out.println( " The sum is " + sum + " while the number of values is 100");
         System.out.println( " The average is " + average );
         System.out.println( " The maximum value is " + max );
         System.out.println( " The minimum value is " + min );
      }
      
   }
}