import java.util.Scanner;

/**
 * Loop calculations
 * @author Ahmet Faruk Uluta�
 * @version 24/10/2019
 */ 
public class lab03a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      int even = 0;
      int odd = 0;
      
      // variables
      int n;
      int sum;
      int x;
      sum = 0;
      // program code
      System.out.println( " Please enter a value");
      n = scan.nextInt();
      for (x = 0; x <= 50; x++ )
      {
         if ( x > 12 || x < 25 ) 
         {
            System.out.println( x ); 
         }
         else
         {
            System.out.println( x + "out of range 12-25");
         }
         
         if ( x % 2 == 0 )
         {
            even++;
            System.out.println( x );
         }
         else
         {
            odd++;
            System.out.println( x );
         }
         
         if ( x % 5 == 0 )
         {
            System.out.println( "Hi Five");
         }
         else if ( x % 2 == 0 )
         {
            System.out.println( "Hi Two");
         }
         else if ( x % 3 == 0 || x % 7 == 0 )
         {
            System.out.println( "Hi ThreeOrSeven");
         }
         else
         {
            System.out.println( "Hi Others!");
         }
         if ( x <= n )
         {
            sum = sum + x;
            
            System.out.println( x + " takes " + even + " even numbers");
            System.out.println( x + " takes " + odd + " odd numbers");
         }
      }
      
      if ( sum == n * ( n + 1 ) / 2 )
      {
         System.out.println( "They are same!");
      }
      else
      {
         System.out.println( "They are not same");
      }
   }
}