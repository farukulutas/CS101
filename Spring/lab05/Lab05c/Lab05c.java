import java.util.Scanner;

/**
 * The program makes a rectangular shape according to the information given by the user.
 * @author Ahmet Faruk Ulutaþ
 * @version 25/03/2020
 */ 
public class Lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int width, height, thickness;
      String isContinue;
      boolean boolCountinue;
      
      // program code
      
      // initilase the variables
      isContinue = "";
      boolCountinue = false;
      
      do {
         
         // initilase variables and ask prompt
         boolCountinue = false;
         System.out.print( "Enter a width, height & thickness:" );
         width = scan.nextInt();
         height = scan.nextInt();
         thickness = scan.nextInt();
         scan.nextLine();
         
         // if invalid int has entered print msg else print the rectangular shape
         if ( width <= 0 || height <= 0 || thickness <= 0 ) {
            System.out.print( "Error: all values must be positive!");
         }
         else {
            for ( int i = 0; i < height; i++ ) {
               System.out.println();
               for ( int k = 0; k < width; k++ ) {
                  if ( i >= (thickness) && i < (height - thickness) && k >= thickness && k < (width - thickness) ) {
                     System.out.print( " " );
                  }
                  else {
                     System.out.print( "*" );
                  }
               }
            }
            
            // new line
            System.out.println();
            
            // if there is no hole print msg
            if ( width == height ) {
               System.out.println( '\n' + "Oops... no hole!" );  
            }
         }
         
         // ask prompt and initilase to continue to print shapes
         System.out.print( '\n' + "Enter Y or y to continue :");
         isContinue = scan.nextLine();
         
         // if is contunie boolean true which starts the loop again
         if ( isContinue.equals("y") || isContinue.equals("y") ) {
            boolCountinue = true;
         }
         
      } while ( boolCountinue );
      
      // print goodbye msg
      System.out.println( "goodbye" );
   }
   
}