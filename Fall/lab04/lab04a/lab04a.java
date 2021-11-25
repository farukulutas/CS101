import java.util.Scanner;

/**
 * calculator
 * @author Ahmet Faruk Uluta�
 * @version 31/10/2019
 */ 
public class lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int n;
      int value;
      int c;
      int k;
      double d;
      int t;
      
      // Lab04/a/1
      System.out.println( "Please enter a value.");
      n = scan.nextInt();
      value = 1;
      if ( n <= 0 )
      {
         System.out.println( "Please enter a positive value.");
      }
      else
         while ( value < n )
      {
         System.out.print( value + " " );
         value++;
      }
      
      // Lab04/a/2
      System.out.println();
      value = 1;
      if ( n <= 0 )
      {
         System.out.println( "Please enter a positive value.");
      }
      else
         while ( value < n )
      {
         System.out.print( value + " " );
         if ( value % 5 == 0 )
         {
            System.out.println();
         }
         
         value++;
      }
      
      // Lab04/a/3
      System.out.println();
      value = n;
      if ( n <= 0 )
      {
         System.out.println( "Please enter a positive value.");
      }
      
      while ( 0 <= value )
      {
         System.out.print( value + " " );
         value--;
      }
      // Lab04/a/4
      System.out.println();
      value = -n;
      if ( n <= 0 )
      {
         System.out.println( "Please enter a positive value.");
      }
      else
      {
         while ( value <= n )
         {
            if ( value % 2 == 0 )
            {
               System.out.print( value + " " );
            }
            
            value++;
         }
      }
      // Lab04/a/5
      System.out.println();
      value = 1;
      if ( value <= 0 )
      {
         System.out.println( "Please enter a positive value.");
      }
      while ( value < n )
      {
         if ( value % 2 == 0 )
         {
            System.out.print( value * value + " " );
            if ( value % 10 == 0 )
            {
               //System.out.println();
            }
         }
         
         value++;
      }
      // Lab04/a/6
      System.out.println();
      t = n;
      value = 3;
      c = 0;
      if ( n < 3 )
      {
         System.out.println( "Please enter a positive value.");
      }
      while ( value <= t )
      {
         if ( t % 3 == 0 || t % 4 == 0 )
         {
            if ( t % 12 != 0 )
            {
               System.out.print( t + " " );
               c++;
               if ( c % 5 == 0 )
               {
                  System.out.println();
               }
            }
         }
         t--;
      }
      // Lab04/a/7
      value = 2;
      if ( n <= 0 )
      {
         System.out.println( "Please enter a positive value.");
      }
      while ( value <= n )
      {
         if ( n % value == 0 )
         {
            System.out.print( value + " " );
         }
         value++;
      }
      // Lab04/a/8
      System.out.println();
      k = 1;
      if ( n <= 0 )
      {
         System.out.println( "Please enter a positive value.");
      }
      while ( k <= n )
      {
         d = Math.round((1 / (double)k) * 100 ) / 100.0;
         System.out.print( d + " " );
         k++;
      }
   }
}