import java.util.Scanner;

/**
 * The program create a random string which includes n character length given by the user and each character has 
 * occured odd times 
 * @author Ahmet Faruk Ulutaþ
 * @version 03/04/2020
 */ 
public class Lab06b
{
   
   /**
    * This method create random string with length of n and every letter occurs odd times
    * @param n Length of the string
    * @return result Random generated string
    */
   static String generateTheString( int n) {
      String result, alphabet;
      int times, letter, numberOfLetters;
      
      result = "";
      alphabet = "abcdefghijklmnopqrstuvwxyz";
      times = 0;
      numberOfLetters = 26;
      
      while ( result.length() != n ) {
         letter = (int) (Math.random() * numberOfLetters);
         times = (int) ( Math.random() * ( n + 1 ) );
         
         if ( times > 0 && times <= n && times % 2 != 0 && times + result.length() <= n ) {
            for ( int i = 0; i < times; i++ ) {
               result = result + alphabet.charAt( letter);
            }
            
            alphabet = alphabet.substring( 0, letter) + alphabet.substring( letter + 1, alphabet.length() );
            numberOfLetters = numberOfLetters - 1;
         }
      }
      
      return result;
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int n;
      
      // program code
      
      // do while loop to ask n and print the output of it until n equal to zero
      do {
         
         // ask prompt and initiliase the n
         System.out.print( "Enter the length of the string, please: ");
         n = scan.nextInt();
         
         // if n is lower than zero which is incalid, print msg else generate random string of length n
         if ( n < 0 ) {
            System.out.println( "Your input is invalid! You should enter a positive value.");
         }
         else {
            System.out.println( generateTheString( n));  
         }
      } while ( n != 0 );
      
      // print good bye msg
      System.out.print( "GoodBye!");
   }
   
}