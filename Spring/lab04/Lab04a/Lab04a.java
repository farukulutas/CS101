import java.util.Scanner;

/*
 * this program calculates the closest perfect square of n given by the user
 * @author Ahmet Faruk Uluta�
 * @date 09/03/2020
 */
public class Lab04a {
   public static void main( String[] args) {
      Scanner scan = new Scanner( System.in);
      
      // variables
      double n, sqrtOfN;
      int result;
      
      // program code
      
      // print opening msg
      System.out.print( "Enter a positive integer n >= 2: " );
      
      // initiliase n and result
      n = scan.nextDouble();
      result = 0;
      sqrtOfN = 0;
      
      // if statement for the proper input
      if ( n >= 2 && n == Math.round(n) ) {
         sqrtOfN = Math.sqrt( n);
         
         // if the number is not square root of sth
         if ( Math.floor( sqrtOfN) < sqrtOfN ) {
            result = (int) Math.floor( sqrtOfN);
         }
         
         // if the number square root of sth
         else {
            result = (int) ( sqrtOfN - 1);  
         }
         
         // print result
         System.out.println( "The largest perfect square less than " + (int) n + " is " 
                               + (int) Math.pow( result, 2) + " ( " + result + " ^ 2 )");
      } 
      
      // if it is decimal number
      else if ( n != Math.round(n) ) {
         System.out.println( "The input n should be an integer. Exiting..." );
      }
      
      // if it is less than 2
      else {
         System.out.println( "The input n should be positive > 1. Exiting..." );
      }
   }
   
}