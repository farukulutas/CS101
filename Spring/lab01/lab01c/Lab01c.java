import java.util.Scanner;

/* This program calculate the exact fibonacci number which is given by the user.
 * @author Ahmet Faruk Ulutaþ
 * @version 18/02/2020
 */

public class Lab01c {
   
   public static void main( String[] args) {
      
      // declare and initiliaze the scanner and n
      Scanner scan = new Scanner( System.in);
      double n;
      n = scan.nextDouble();
      
      // constants
      final double P = ( (1 + Math.pow(5, 0.5) ) / 2 ); 
      final double FORMULA = ( ( Math.pow( P, n ) - Math.pow( -P, -n ) ) / Math.pow(5, 0.5) );
      
      // variables

      // program code
      
      // print the result
      System.out.println( "Fibonacci(" + (int) n + ") is " + (int) FORMULA );
      
      // result will be wrong after n = 46 because its overflowing int.
      System.out.println( "Fibonacci(" + (int) n + ") is " + Math.round(FORMULA) );
      
      // also math.round does not work so, printf method
      System.out.printf( "Fibonacci(" + (int) n + ") is %.0f" , FORMULA );
      
      // however, still we could not find the exact value but too close.
   }
   
}