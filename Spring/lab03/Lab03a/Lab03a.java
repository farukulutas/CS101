import java.util.Scanner;

/**
 * This program concat two strings from the user without same ending and starting character
 * @author Ahmet Faruk Ulutaþ
 * @version 02/03/2020
 */ 
public class Lab03a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      String firstString, secondString, lastString;
      
      // program code
      
      // ask first and second string
      System.out.print( "Please enter the first string: ");
      firstString = scan.nextLine();
      
      System.out.print( "Please enter the second string: ");
      secondString = scan.nextLine();
      
      // if first string is empty print second string
      if ( firstString.length() == 0 ) {
         
         lastString = secondString;
      }
      
      // if double-char issue is ocurred then delete one char
      else if( firstString.charAt( firstString.length() - 1 ) == secondString.charAt( 0) ) {
         
         lastString = firstString + secondString.substring( 1);
      }
      
      // concat two strings
      else {
         
         lastString = firstString.concat( secondString);
      }
      
      // print last string
      System.out.println( lastString);
   }
   
}