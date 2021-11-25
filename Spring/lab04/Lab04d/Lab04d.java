import java.util.Scanner;

/**
 * The program determine the closest numbers whether they are prime or not
 * @author Ahmet Faruk Ulutaþ
 * @version 10/03/2020
 */ 
public class Lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String STARS = "***************";
      
      // variables
      int input, divisibleCount, sum, count, minimum, maximum, temp, gcdTemp, gcdTemp2, adjacentCounter;
      
      // program code
      
      // initiliase values
      divisibleCount = 0;
      sum = 0;
      count = 0;
      minimum = Integer.MAX_VALUE;
      maximum = Integer.MIN_VALUE;
      temp = 0;
      gcdTemp = 0;
      gcdTemp2 = 0;
      adjacentCounter = 0;
      
      // print start msg
      System.out.print( "Enter a sequence of integers (not-integer to process input): ");
      
      // if integer has not entered, print
      if ( !scan.hasNextInt() ) {
         System.out.println( "No values entered.");
         adjacentCounter = -1;
      }
      
      // do this until user enter different than integer
      while ( scan.hasNextInt() ) {
         // initiliase input
         input = scan.nextInt();
         
         // count if input divisible by 7
         if ( input % 7 == 0 ) {
            divisibleCount++;  
         }
         
         // find maximum input
         if ( input > maximum ) {
            maximum = input;
         }
         
         // find minimum input
         if ( input < minimum ) {
            minimum = input;  
         }
         
         // find sum of inputs
         sum = sum + input;
         
         // count how many input has entered
         count++;
         gcdTemp = input;
         gcdTemp2 = temp;
         
         // find the two inputs are co-prime or not by finding their greatest common divisors
         while ( (gcdTemp != 0 && gcdTemp2 != 0) && (gcdTemp != gcdTemp2) && ( gcdTemp2 != 1) ) {
            if ( gcdTemp > gcdTemp2 )
               gcdTemp -= gcdTemp2;
            else
               gcdTemp2 -= gcdTemp;
            
            // if gcd == 1, it means they are co-prime
            if ( gcdTemp2 == 1 ) {
               adjacentCounter++;
               // if it is first co-prime, print msg
               if ( adjacentCounter == 1 ) {
                  System.out.println( "Co-Prime Pairs:");
                  adjacentCounter++;
               }
               
               // print co-prime pairs
               System.out.println( temp + " - " + input );
               
            }
         }
         
         // temporarily input value for to not lose the last value when new one has came
         temp = input;
      }
      
      // if co-prime does not found print msg
      if ( adjacentCounter >= 0 ) {
         
         if ( adjacentCounter == 0 ) {
            System.out.println( "No adjacent pair is co-prime..." );
         }
         System.out.println( STARS);
         System.out.println( "Max: " + maximum + " Min: " + minimum);
         System.out.println( "Sum: " + sum + " Average: " + ( (sum * 1.0 ) / count) );
         System.out.println( "Count: " + count + " Divisible by 7 count: " + divisibleCount );
      }
   }
   
}