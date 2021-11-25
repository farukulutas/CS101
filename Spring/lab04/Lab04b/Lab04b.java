import java.util.Scanner;

/**
 * The program takes string input and decide whether the string is  xy balanced or not
 * @author Ahmet Faruk Ulutaþ
 * @version 10/03/2020
 */ 
public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      String input;
      boolean isBalanced;
      int count, indexOfX, indexOfY, numberOfX, numberOfY;
      
      // program code
      
      //initiliase
      isBalanced = false;
      count = 0;
      indexOfX = -1;
      indexOfY = -1;
      numberOfX = 0;
      numberOfY = 0;
      
      // print msg and ask a string
      System.out.print( "Please enter a string: ");
      input = scan.nextLine();
            
      // do this length of string times
      while ( count < input.length() ) {
         
         // if y char is found store index of y and increase number of Y
         if ( input.charAt( count) == 'y' ) {
            indexOfY = count;
            numberOfY++;
         }
         
         // if x char is found store index of x and increase number of X
         if ( input.charAt( count) == 'x' ) {
            indexOfX = count;
            numberOfX++;
         }
         
         count++;
      }
      
      // balanced, if Y comes after X or they are not exist AND x does not occured more than multiple times of y
      if ( (indexOfX < indexOfY || indexOfX == indexOfY) && ( numberOfX * 2 <= numberOfY || 
                                                             numberOfX == numberOfY) ) {
         isBalanced = true;
      }
      
      // print if is balanced or not balanced
      if ( isBalanced ) {
         System.out.print( "This string is xy-balanced.");
      }
      
      else {
         System.out.print( "This string is not xy-balanced.");
      }   
   }
   
}