import java.util.Scanner;

/**
 * This program print n stars which is given by the user
 * @author Ahmet Faruk Ulutaþ
 * @date 23/04/2020
 */
public class Histogram
{
   public static void main( String[] args) {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String STAR = "*";
      
      // variables
      int n;
      
      // program code
      
      // ask prompt and initilase the n
      System.out.print( "Enter the numbers");
      n = scan.nextInt();
      
      // print output via while and for loop which is nested
      System.out.println( "Output:");
      while ( n >= 0 ) {
         System.out.print( n + "  ");
         for ( int i = 0; i < n; i++ ) {
            System.out.print( STAR);
         }
         
         System.out.println();
         n = scan.nextInt();
      }
   }
   
}