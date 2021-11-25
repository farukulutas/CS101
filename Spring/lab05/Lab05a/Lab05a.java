import java.util.Scanner;

/**
 * Program checks the string input from the user then reduce the double chars from the string.
 * @author Ahmet Faruk Ulutaþ
 * @version 25/03/2020
 */ 
public class Lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      String input, reverseInput;
      int isAscii;
      
      // program code
      
      // ask prompt and initiliase variables
      System.out.print( "Please enter a string:");
      input = scan.nextLine();
      isAscii = 0;
      reverseInput = "";
      
      // for loop to count the ascii chars
      for ( int i = 0; i < input.length(); i++ ) { // 65 = A 90 = Z 97 = a 122 = z
         if ( (int) input.charAt(i) >= 65 && (int) input.charAt(i) <= 90 || (int) input.charAt(i) >= 97 && 
             (int) input.charAt(i) <= 122 ) {
            isAscii++;
         }
      }
      
      // if all of chars are ascii chars then remove the doubled chars
      if ( isAscii == input.length() ) {
         for ( int i = 1; i < input.length(); i++ ) {
            if ( input.charAt(i) == input.charAt( i - 1) || (int) input.charAt(i) == (int) input.charAt(i - 1)
                   + 32 || (int) input.charAt(i) == (int) input.charAt(i - 1) - 32 ) {
               input = input.substring(0, i - 1) + input.substring( i + 1 );
               i = 0;
            }
         }
      }
      
      // if input is empty, print the msg.
      if ( input.equals("") ) { // or input.length() == 0
         System.out.println( "---> Empty String \nThe final string is empty.");
      }
      else {
         for ( int i = input.length() - 1; i >= 0; i-- ) {
            reverseInput = reverseInput + input.charAt( i);
         }
         System.out.println( "---> " + input + "\nReverse: " + reverseInput );
      }
   }
   
}