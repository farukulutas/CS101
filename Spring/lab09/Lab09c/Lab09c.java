import java.util.Scanner;
import java.util.ArrayList;

/**
 * Simple program taken inputs from user
 * @author Ahmet Faruk Ulutaþ
 * @version 06/05/2020
 */ 
public class Lab09c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int i;
      ArrayList<Integer> array;
      
      // program code
      System.out.println( "Please enter the values: " );
      i = scan.nextInt();
      array = new ArrayList<Integer>();
      
      while ( i != 0 ) {
         array.add( i);
         i = scan.nextInt();
      }
      
      System.out.println( solution1( array) );
      System.out.println( solution2( array) );
   }
   
   /*
    * The method creates a new array list with the given arraylists multiplications
    * @author Ahmet Faruk Ulutaþ
    * @version 07/05/2020
    */
   public static ArrayList<Integer> solution1( ArrayList<Integer> array ) {
      ArrayList<Integer> newArray;
      int multiplication;
      
      newArray = new ArrayList<Integer>();
      multiplication = 1;
      
      for ( int i = 0; i < array.size(); i++ ) {
         multiplication = multiplication * array.get( i);
      }
      
      for ( int j = 0; j < array.size(); j++ ) {
         newArray.add( multiplication / array.get( j) );
      }
      
      return newArray;
   }
   
   /*
    * The method creates a new array list with the given arraylists multiplications
    * @author Ahmet Faruk Ulutaþ
    * @version 07/05/2020
    */
   public static ArrayList<Integer> solution2( ArrayList<Integer> array ) {
      ArrayList<Integer> newArray;
      int temp, rightTemp;
      
      temp = 1;
      rightTemp = 1;
      newArray = new ArrayList<Integer>();
      
      for ( int i = 0; i < array.size(); i++ ) {
         if ( i > 0 ) {
            temp = temp * array.get( i - 1);
         }
         
         newArray.add( temp);
      }
      
      temp = 1;
      
      for ( int j = array.size() - 1; j > 0; j-- ) {       
         temp = temp * array.get( j);
         rightTemp = newArray.get( j - 1) * temp;
         newArray.set( j - 1, rightTemp);
      }
      
      return newArray;
   }
   
}