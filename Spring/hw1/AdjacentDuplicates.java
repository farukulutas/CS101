import java.util.Scanner;

/**
 * This program select adjacents and print them which are given by the user.
 * @author Ahmet Faruk Ulutaş
 * @version 23/04/2020
 */ 
public class AdjacentDuplicates
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      int integer, temp, count;
      
      // program code
      
      // ask prompt and initilase the variables
      System.out.println( "Enter numbers:");
      integer = scan.nextInt();
      count = 0;
      
      // print output prompt
      System.out.println( "Output:\n");
      System.out.println( "Adjacent Duplicate, Occurence Count");
      
      // get output, count the outputs if they are equal and print number and occurence time
      while ( integer != 0 ) {
         temp = integer;
         integer = scan.nextInt();
         
         if ( integer == temp ) {
            count++;
         }
         else if ( count > 0 && integer != temp ) {
            System.out.println( temp + ", " + (count + 1) );
            count = 0;
         }
      }
   }

}