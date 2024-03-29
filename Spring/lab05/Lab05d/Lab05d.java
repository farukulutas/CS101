import java.util.Scanner;

/**
 * The program checks semazen strings and does some math calculations
 * @author Ahmet Faruk Uluta�
 * @version 25/03/2020
 */ 
public class Lab05d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      boolean isEnd, doNotPrint;
      String options, s1, s2, commonChars;
      double r, a, precision, sum;
      
      // program code
      
      // initilase the boolean
      isEnd = false;
      
      // run menu program with do-while
      do {
         commonChars = "";
         doNotPrint = false;
         // welcome menu and initilase option variable
         System.out.print( "**** Make your selection ****" + '\n' + "Strings" + '\n' + "Math" + '\n' + "Exit"
                             + '\n' +"Your selection: " );
         options = scan.nextLine();
         options = options.toLowerCase();
         
         // menu option semazen-strings
         if ( options.equals( "strings" ) ) {
            
            // ask prompt for strings and initilaze them
            System.out.print( "** Semazen-Strings **" + '\n' + "Enter a string:");
            s1 = scan.nextLine();
            System.out.print( "Enter another string:" );
            s2 = scan.nextLine();
            
            // for loop to check are these semazen-strings
            for ( int i = 0; i < s1.length(); i++ ) {
               s1 = s1.substring( i, s1.length() ) + s1.substring( 0, i);
               if ( s1.equals( s2) ) {
                  System.out.println( "They are semazen-strings." );
                  i = s1.length();
                  doNotPrint = true;
               }    
            }
            for ( int b = 0; b < s1.length(); b++ ) {
               for ( int k = 0; k < s1.length(); k++ ) {
                  if ( s1.charAt( b) == ( s2.charAt( k) ) ) {
                     commonChars = commonChars + s1.charAt( b);
                  }
               }
            }
         }
         
         if ( !doNotPrint && options.equals("strings") ) {
            // convert chars to lower case from mixed one
            commonChars = commonChars.toLowerCase();
            // for loop to remove same chars
            for ( int b = 0; b < commonChars.length(); b++ ) {
               for ( int c = b + 1; c < commonChars.length(); c++ ) {
                  if ( commonChars.charAt( b) == commonChars.charAt( c) ) {
                     commonChars = commonChars.substring(0, b) + commonChars.substring( b + 1);
                     b = 0;
                  }
               }
            }
            
            // add space in front of the chars
            for ( int j = 1; j < commonChars.length(); j = j + 2 ) {
               commonChars = commonChars.substring( 0, j) + " " + commonChars.substring( j);
            }
            
            // print the result
            System.out.println( "Common characters: " + commonChars );
         }
         
         // menu option for math
         if ( options.equals( "math" ) ) {
            
            // ask prompt and initilase the variables
            System.out.println( "** Infinite Geometric Sum Calculation **" );
            System.out.print( "Enter an r:" );
            r = scan.nextDouble();
            System.out.print( '\n' + "Enter an a:" );
            a = scan.nextDouble();
            System.out.print( '\n' + "Enter precision:" );
            precision = scan.nextDouble();
            scan.nextLine();
            sum = 0;
            
            // if invalid value entered print msg else calculate sum and print
            if ( r >= 1 || r <= -1 || precision <= 0 || precision >= 1 ) {
               System.out.println( "You have entered invalid value for r or precision." );
            }
            else {
               do {
                  sum = sum + a;
                  System.out.print( '\n' + "Current result is: " + sum );
                  
                  a = a * r;
               } while ( Math.abs( a) >= precision );
               
               sum = sum + a;
               System.out.print( '\n' + "Current result is: " + sum );
               System.out.println( '\n' + "Result is: " + sum );
            }
         }
         
         // menu option for exit to leave the program
         if ( options.equals( "exit" ) ) {
            isEnd = true;
         }
      } while ( !isEnd ); // do this while it is not end
      
      // print goodbye msg
      System.out.println( "Goodbye!" );
   }
   
}