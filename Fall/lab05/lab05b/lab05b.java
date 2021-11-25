import java.util.Scanner;

/**
 * row & columns
 * @author Ahmet Faruk Uluta�
 * @version 07/11/2019
 */ 
public class lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int line, columns, numberOfSpaces;
      int l, c, s;
      
      // program code
      System.out.println( "Please enter number of rows and columns.");
      line = scan.nextInt();
      columns = scan.nextInt();
      //1
      System.out.println( "the row & column numbers as shown in the example");
      for ( l = 0; l < line; l++ )
      {
         for ( c = 0; c < columns; c++ )
         {
            numberOfSpaces = 3 - (int) Math.log10( l + 1) - (int) Math.log10( c + 1 );
            for ( s = 0; s < numberOfSpaces; s++ )
            {
               System.out.print( " ");
            }
            System.out.print( ( l + 1 ) + ( "," ) + ( c + 1 ) );
         }
         System.out.println();
      }
      //2
      System.out.println( "the product of the row & column number (a multiplication table!)");
      for ( l = 0; l < line; l++ )
      {
         for ( c = 0; c < columns; c++ )
         {
            numberOfSpaces = 5 - (int) Math.log10( ( l + 1 ) * ( c + 1 ) );
            for ( s = 0; s < numberOfSpaces; s++ )
            {
               System.out.print( " ");
            }
            System.out.print( ( l + 1 ) * ( c + 1 ) );
         }
         System.out.println();
      }
      //3
      System.out.println( "the cell number beginning from 0 and increasing left to right, top to bottom");
      for ( l = 0; l < line; l++ )
      {
         for ( c = 0; c < columns; c++ )
         {
            numberOfSpaces = 5 - (l * columns + c + "").length(); // (int) Math.log10( ( l * columns + c ) );
            for ( s = 0; s < numberOfSpaces; s++ )
            {
               System.out.print( " ");
            }
            System.out.print( ( l * columns + c ) );
         }
         System.out.println();
      }
      //4
      System.out.println( "the row number in the first column only, putting the String - into the other cells.");
      for ( l = 0; l < line; l++ )
      {
         for ( c = 0; c < columns; c++ )
         {
            numberOfSpaces = 5 - (int) Math.log10( l + 1 );
            for ( s = 0; s < numberOfSpaces; s++ )
            {
               System.out.print( " ");
            }
            System.out.print( l + 1 );
            for ( c = 0; c < columns; c++ )
            {
               System.out.print( "   -" );
            }
            System.out.2println();
         } 
      }
   }
}      