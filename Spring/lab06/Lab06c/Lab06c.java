import java.util.Scanner;

/**
 * This program encrypt the given text
 * @author Ahmet Faruk Ulutaþ
 * @version 07/04/2020
 */ 
public class Lab06c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      String message;
      
      // program code
      
      // ask prompt and initilase
      System.out.print( "Please enter a message: ");
      message = scan.nextLine();
      
      // print the encrypted message
      System.out.print( encryption( message) );
   }
   
   /**
    * This method encrypt the given message
    * @param message Message to be encrypted
    * @return result Encrypted message
    */
   static String encryption( String message) {
      int rows, columns;
      String result;
      
      result = "";
      
      for ( int i = 0; i < message.length(); i++ ) {
         if ( message.charAt( i) == ' ' ) {
            message = message.substring( 0, i) + message.substring( i + 1, message.length() );
         }
      }
      
      rows = (int) Math.floor( Math.sqrt( message.length() ) );
      columns = (int) Math.ceil( Math.sqrt( message.length() ) ); 
      
      for ( int j = 0; j < columns; j++ ) {
         for ( int k = 0; k < message.length(); k = k + columns ) {
            if ( k + j < message.length() ) {
               result = result + message.charAt( k + j );
            }
         }
         
         result = result + " ";
      }
      
      return result;
   }
   
}