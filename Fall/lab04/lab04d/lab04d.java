import java.util.Scanner;

/**
 * while loops
 * @author Ahmet Faruk Ulutaþ
 * @version 31/10/2019
 */ 
public class lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int width;
      String s;
      int n;
      int number_of_s;
      
      // program code
      System.out.println( "Please enter a character:");
      s = scan.nextLine();
      width = scan.nextInt();
      n = 0;
      
      while ( n < width )
      {
         System.out.print( s );
         number_of_s = 0;
         while ( number_of_s < n )
         {
            System.out.print( s );
            number_of_s++;
         }
         System.out.println();
         n++;
      }
//      double d;
//      d = 0.1;
//      while ( d < 1.0 )
//      {
//         System.out.println( d);
//         d = d + 0.1;
//      }
//      System.out.println( d + " <- final value after loop!");
      
   }
}