import java.util.Arrays;
import java.util.Scanner;

/**
 * Simple BigNum Class 
 * @author Ahmet Faruk ULUTAS
 * @version 19/12/2019
 */

public class Lab10b
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      // variables
      String number;
      int digit;
      BigNum[] numberArray = new BigNum[ 10];
      BigNum values;
      int location;
      BigNum maximum;
      int position;
      
      // program code
      number = "";
      
      // Create random arrays
      for ( int i = 0; i < numberArray.length; i++)
      {
         for (int j = 0 ; j < BigNum.SIZE ; j++)
         {
            number += (int) (Math.random() * (BigNum.BASE));
         }
         values = new BigNum( number);
         numberArray[ i] = values;
         number = "";
         System.out.println(numberArray[i]);
         
      }
      System.out.println();
      
      // Get location from user
      System.out.println( "Enter location:");
      location = scan.nextInt();
      System.out.println();
      
      // Determine the max array
      while ( location > 0)
      {
         maximum = new BigNum();
         maximum = numberArray[ 0];
         position = 0;
         
         for ( int i = 1; i < location; i++)
         {
            if ( maximum.isLessThan( numberArray[ i]))
            {
               maximum = numberArray[ i];
               position = i;
            }
         }
         
         // Swap locations
         numberArray[ position] = numberArray[ location - 1];
         numberArray[ location - 1] = maximum;
         
         System.out.println( "The biggest BigNum is " + maximum + " at position " + position + ".");
         System.out.println();
         
         for ( int i = 0; i < numberArray.length; i++)
         {
            System.out.println(numberArray[i]);
         }
         System.out.println();
         
         
         System.out.println( "Enter location:");
         location = scan.nextInt();
         System.out.println();
      }
   }
}
