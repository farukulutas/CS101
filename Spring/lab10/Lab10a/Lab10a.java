import java.util.Scanner;

/**
 * This program works on polynomial expressions
 * @author Ahmet Faruk Ulutaþ
 * @version 12/05/2020
 */ 
public class Lab10a {
   public static void main( String[] args) {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String STARS = "************************";
      
      // variables
      int[] coefficients;
      int n, x, temp;
      
      // program code
      
      // initilase of x
      x = -1;
      
      // welcome msg, ask prompt and initilases of n
      System.out.println( "Start of Lab10a");
      System.out.println();
      System.out.print( "Please enter the value of N:");
      n = scan.nextInt();
      
      // initilase of array
      coefficients = new int[ n + 2];
      coefficients[ 0] = n;
      
      // adding coefficients to array
      for ( int i = 0; i < n + 1; i++ ) {
         System.out.print( "Please enter the coefficient a" + ( n - i) + ":");
         temp = scan.nextInt();
         coefficients[ i + 1] = temp;
      }
      
      while ( x != 0 ) {
         if ( x != - 1 ) {
            System.out.println( "for X = " + x );
            printPolynomial( coefficients, x, calculatePolynomial( coefficients, x) );
         }
         
         System.out.print( "Please enter the X value: ");
         x = scan.nextInt();
         System.out.println();
         System.out.println( STARS);
      }
      
      // good bye msg
      System.out.print( "--- End of Lab10a ---");
   }
   
   /* This method calculate the polynomial by the given coefficients and x value
    * @param coefficients Arrays of coefficients
    * @param x X
    * @return R Result of polynomial expression
    */
   public static int calculatePolynomial( int[] coefficients, int x) {
      int R;
      
      R = 0;
      
      for ( int i = 0; i < coefficients[ 0] + 1; i++ ) {
         R = R + coefficients[ i + 1] * (int) Math.pow( x, coefficients[ 0] - i);
      }
      
      return R;
   }
   
   /* This method print the polynomial expression by using given paramters
    * @param coefficients Arrays of coefficients
    * @param x X
    * @param R Result of polynomial expression
    */
   public static void printPolynomial( int[] coefficients, int x, int R) {
      for ( int i = 0; i < coefficients[ 0] + 1; i++ ) {
         if ( coefficients[ 0] - i == 0 ) {
            System.out.print( coefficients[ i + 1] + " ");
         }
         else {
            System.out.print( coefficients[ i + 1] + "(" + x + " ^ " + ( coefficients[ 0] - i) + ") + ");
         }
      }
      
      System.out.print( "= " + R );
      System.out.println();
   }
   
}