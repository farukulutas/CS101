import java.util.Scanner;

/**
 * __program description___ 
 * @author Ahmet Faruk Ulutaþ
 * @version 02/03/2020
 */ 
public class Lab03c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int first, second, third, min, mid, max;
      
      // program code
      min = 0;
      mid = 0;
      max = 0;
      
      System.out.print( "Please enter the integers: ");
      first = scan.nextInt();
      second = scan.nextInt();
      third = scan.nextInt();
      
      if ( first < third && first < second ) {
      
         min = first;
         
         if ( second < third ) {
          
            mid = second;
            max = third;
         }
         else {
          
            mid = third;
            max = second;
         }
      }
      
      else if ( second < first && second < third ) {
      
         min = second;
         
         if ( first < third ) {
          
            mid = first;
            max = third;
         }
         else {
          
            mid = third;
            max = first;
         }
      }
      
     else if ( third < first && third < second ) {
      
         min = third;
         
         if ( first < second ) {
          
            mid = first;
            max = second;
         }
         else {
          
            mid = second;
            max = first;
         }
      }
      
      System.out.println( "The sorted nums are: " + min + " " + mid + " " + max);
   }
   
}