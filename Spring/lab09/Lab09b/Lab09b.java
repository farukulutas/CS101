import java.util.Scanner;
import java.util.ArrayList;

/* Lab09b 
 *
 * @author Ahmet Faruk Uluta�
 * @version 06/05/2020
 * 
 */
public class Lab09b {
   
   public static void main( String[] args ) {
      
      Scanner scan = new Scanner( System.in );
      
      /************* You should not change here unless you want to add more test cases ************/                      
      // constants
      final String test1 = "1 2 2 31";
      final String test2 = "6 5 4 4";
      final String test3 = "1 3 2";
      final String test4 = "1 2 4 5";
      final String test5 = "1 1 1";
      final String test6 = "19 11 7 8 5";
      final String test7 = "";
      
      // variables
      ArrayList<String> testList;
      ArrayList<Boolean> correctResultList;
      
      // program code
      testList = new ArrayList<String>();
      testList.add( test1 );
      testList.add( test2 );
      testList.add( test3 );
      testList.add( test4 );
      testList.add( test5 );
      testList.add( test6 );
      testList.add( test7 );
      
      correctResultList = new ArrayList<Boolean>();
      correctResultList.add( true );
      correctResultList.add( true );
      correctResultList.add( false );
      correctResultList.add( true );
      correctResultList.add( true );
      correctResultList.add( false );
      correctResultList.add( true );
      
      /***********************************************************************************************/
      // TODO
      // Here you should use the methods properly and construct the table.       
      System.out.println( "\t\t\tRun\t|\tExpected\t\t|" );
      System.out.println( "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
      for ( int i = 0; i < 7; i++ ) {
         System.out.println( "|\tTest" + ( i + 1) + "\t|\t" + isMonotonic( parseString( testList.get( i) ) ) 
                               + "\t|\t" + correctResultList.get( i) + "\t\t|" );
         System.out.println( "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
      }
   }
   
   // TODO
   /**
    * Parses the given string and creates a ArrayList with the values
    * @param str String to be parsed
    * @return ArrayList with values parsed from the String str
    */
   public static ArrayList<Integer> parseString( String str ) {
      ArrayList<Integer> intArray;
      int i;
      
      intArray = new ArrayList<Integer>();
      i = 0;
      
      while ( str.length() != 0 ) {       
         if ( str.length() == i ) {
            intArray.add( Integer.parseInt( str ));
            return intArray;
         }
         
         if ( str.charAt( i) == ' ' ) {
            intArray.add( Integer.parseInt( str.substring( 0, i) ));
            str = str.substring( i + 1);
            i = 0;
         }
         else {
            i++;
         }
      }
      
      return intArray;
   }
   
   // TODO
   /**
    * Finds out whether the given ArrayList is monotonic or not
    * @param list ArrayList to be checked whether it is monotonic or not
    * @return true or false
    */
   public static boolean isMonotonic( ArrayList<Integer> list ) {
      int plusCount, minusCount;
      
      plusCount = 0;
      minusCount = 0;
      
      if ( list.size() < 1 ) {
         return true;
      }
      
      for ( int i = 0; i < list.size() - 1; i++ ) {
         if ( list.get( i) <= list.get( i + 1) ) {
            minusCount++;
         }
         
         if ( list.get( i) >= list.get( i + 1) ) {
            plusCount++;
         }
      }
      
      if ( plusCount + 1 == list.size() || minusCount + 1 == list.size() ) {
         return true;
      }
      
      return false;
   }    
   
}