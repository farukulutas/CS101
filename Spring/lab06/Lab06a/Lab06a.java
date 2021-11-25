import java.util.Scanner;

/**
 * The program convert take input from user and convert it two binary base 
 * @author Ahmet Faruk Ulutaþ
 * @version 02/04/2020
 */ 
public class Lab06a
{
   
   /**
    * The method convert decimal int to corresponding binary string.
    * @param decimal Decimal value
    * @return binary Binary string
    */
   static String toBinary( int decimal) {
      String binary;
      
      binary = "";
      
      while ( decimal >= 1 ) {
         if ( decimal % 2 != 0 ) {
            binary = "1" + binary;
         }
         else {
            binary = "0" + binary;
         }
         
         decimal = decimal / 2;
      }
      
      return binary;
   }
   
   /**
    * The method convert binary string to corresponding decinal value.
    * @param binary Binary string
    * @return decimal Decimal value
    */
   static int toDecimal( String binary) { 
      int decimal, temp;
      
      decimal = 0;
      
      for ( int i = binary.length(); i > 0; i-- ) {
         temp = 1;
         
         if ( binary.charAt( i - 1) == '1' ) {
            for ( int j = 0; j < binary.length() - i; j++ ) {
               temp = temp * 2;
            }
            
            decimal = decimal + temp;
         }
      }
      
      return decimal;
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int n;
      
      // program code
      
      // ask prompt and initilase
      System.out.print( "Enter an integer n: ");
      n = scan.nextInt();
      
      // print binary and decimal representation of n by using methods
      System.out.println( "The binary representation is " + toBinary( n) );
      System.out.println( "The decimal value is " + toDecimal( toBinary( n)) );
      
      // if it is same number, print they are equal
      if ( toDecimal( toBinary( n)) == n ) {
         System.out.println( "They are equal." );
      }
   }
   
}