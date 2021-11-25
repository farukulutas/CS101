import java.util.Scanner;

/**
 * The program decide the zodiac sign by using month and day given by the user
 * @author Ahmet Faruk Ulutaþ
 * @version 03/03/2020
 */ 
public class Lab03e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int day, month;
      String zodiacSign;
      
      // program code
      
      // initilaze day and month
      day = 0;
      month = 0;
      
      // ask day and month
      System.out.print( "Please enter your birthday (month and day): ");
      month = scan.nextInt();
      day = scan.nextInt();
      
      // new line
      System.out.println();
      
      // if month is valid
      if ( month > 0 && month < 13 ) {
         
         // if day is valid
         if ( day > 0 && day < 32 ) {
            
            
         }
         
         else {
            
            System.out.println( "You have entered incorrect day!" );
         }
      }
      else {
         
         System.out.println( "You have entered incorrect month!" );
      }
      
      // print month, day and zodiac sign
      System.out.println( "The astrological sign for " + month + " " + day + " is " + zodiacSign );
   }
   
}