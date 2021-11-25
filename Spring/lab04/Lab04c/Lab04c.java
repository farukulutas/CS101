import java.util.Scanner;

/**
 * The program do several calculations with while loop by using the user's input.
 * @author Ahmet Faruk Ulutaþ
 * @version 10/03/2020
 */ 
public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String BRACKETS = "------------------";
      
      // variables
      int n, count;
      
      // program code
      
      //initiliase
      count = 0;
      
      // ask user to enter n
      System.out.print( "Please enter a value for n: ");
      n = scan.nextInt();
      
      // while loop for user to enter proper integer
      while ( n < 1 ) {
         System.out.print( "Please enter a value for n: ");
         n = scan.nextInt();  
      }
      
      // constant brackets to seperate loop results
      System.out.println( BRACKETS + " 1 " + BRACKETS );
      
      // while loop to print square of odd numbers
      while ( count < n - 1 ) {
         count++;
         
         // if odd print square of it
         if ( count % 2 == 1 ) {
            System.out.printf( (int) Math.pow( count, 2) + "\t" );
         }
         
         // 5 number per line
         if ( count % 10 == 0 ) {
            System.out.println();  
         }
      }
      
      // constant brackets to seperate loop results
      System.out.println( '\n' + BRACKETS + " 2 " + BRACKETS );
      
      // while loop for n's divisors three and four but not both
      while ( count >= 3 ) {
         
         count--;
         
         // if divisible by three OR divisible by 4 AND not divisible by twelve print the number
         if ( (count % 3 == 0 || count % 4 == 0) && count % 12 != 0 ) {
            System.out.printf( count + "\t" );
         }
         
         // 5 number per line
         if ( count % 12 == 3 ) {
            System.out.println();  
         }
      }
      
      // count equal to n to use it in next loop
      count = n;
      
      // constant brackets to seperate loop results
      System.out.println( '\n' + BRACKETS + " 3 " + BRACKETS );
      
      // while loop to print numbers from 1/n to 1/1
      while ( count >= 1 ) {
         System.out.printf( "%.2f\t" , ( (1.0 / count) ) );
         
         // 5 number per line
         if ( count % 5 == 2 ) {
            System.out.println();  
         }
         
         count--;
      }
      
      // constant brackets to seperate loop results
      System.out.println( '\n' + BRACKETS + " 4 " + BRACKETS );
      
      // count equal to one to use it in next loop
      count = 1;
      
      // while loop for divisors of n except 1
      while ( count <= n ) {
         count++;
         
         if ( n % count == 0 ) {
            System.out.printf( count + " " ); 
         }
      }
   }
   
}