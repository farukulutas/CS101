import java.util.Scanner;

/**
 * Rectangle creator by using variables which are given by user. 
 * @author Ahmet Faruk Ulutaþ
 * @version 07/11/2019
 */ 
public class lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String YES = "y";
      final String YES2 = "Y";
      
      // variables
      int w, h, t;
      int l;
      int s;
      String yesNo;
      
      // program code
      do
      {
         System.out.println( "Please enter width, height and thichkness of the rectangle.");
         w = scan.nextInt();
         h = scan.nextInt();
         t = scan.nextInt();
         if ( w <= 0 || h <= 0 || t <= 0 )
         {
            System.out.println("Error: all values must be positive!");
         }
         else if ( t * 2 > w || t * 2 > h )
         {
            for ( l=0; l < h; l++)
            {
               for ( s=0; s < w; s++)
               {
                  if ( l < t || s < t || h - l < t || w - s < t )
                  {
                     System.out.print("*");
                  }
                  else
                  {
                     System.out.print(" ");
                  }
               }
               System.out.println();
            }
            System.out.println("Oops... no hole!");
         }
         else if ( t * 2 <= w || t * 2 <= h )
         {
            for ( l=0; l < h; l++)
            {
               for ( s=0; s < w; s++)
               {
                  if ( l < t || s < t || h - l <= t || w - s <= t )
                  {
                     System.out.print( "*");
                  }
                  else
                  {
                     System.out.print( " ");
                  }
               }
               System.out.println();
            }
         }
         System.out.println( "if they wish to create another pattern, please type y or Y." );
         yesNo= scan.next();
         
      } while ( yesNo.equals(YES) || yesNo.equals(YES2) );
      
      System.out.print( "Goodbye.");
   }  
}