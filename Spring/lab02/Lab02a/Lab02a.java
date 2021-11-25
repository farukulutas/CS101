import java.util.Scanner;

/* This program print the Pi numbers with given decimal by the user.
 * @author Ahmet Faruk Ulutaþ
 * @date 25/02/2020
 */
public class Lab02a {
 
   public static void main( String[] args) {
      
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      String decimal;
      
      // program code
      
      // print hello world!
      System.out.println( "Hello World!" );
      System.out.println( "This is the magic number: PI" );
      
      // print the pi number with asteriks characters
      System.out.println( "****   *     *" );
      System.out.println( "   *   *    *" );
      System.out.println( "****   *   *" );
      System.out.println( "   *   *  *   *" );
      System.out.println( "**** * * ******" );
      System.out.println( "              *" );
      
      // take decimal input from user
      decimal = scan.nextLine();
      System.out.println( "Enter the desired number of digits for pi: " );

      // print pi number by using the input
      System.out.printf( "%10." + decimal + "f" , Math.PI );
   }
   
}