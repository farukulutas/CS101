import java.util.Scanner;

/**
 * The program calculates the fibonacci number until the given input by using for loops 
 * @author Ahmet Faruk Ulutaþ
 * @version 25/03/2020
 */ 
public class Lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int input, number, tempOne, tempTwo;
      
      // program code
      
      // initilase variables
      number = 0;
      tempOne = 1;
      tempTwo = 0;
      
      // ask prompt and initilase input
      System.out.print( "Please enter a value for n: ");
      input = scan.nextInt();
      
      // while input is lower than zero, ask the input
      while ( input < 0 ) {
         System.out.print( "Invalid value has been entered.");
         System.out.print( '\n' + "Please enter a value for n: ");
         input = scan.nextInt();
      }
      
      // for loop to calculate and print the fibonacci sequence
      for ( int i = 0; i <= input; i++) {
         System.out.print( '\n' + "Fib(" + i + ") = " + number );
         
         if ( i == 1 ) {
            i++;
            System.out.print( '\n' + "Fib(" + i + ") = " + number );
         }
         
         number = tempOne + tempTwo;
         tempTwo = tempOne;
         tempOne = number;
      }
   }
   
}