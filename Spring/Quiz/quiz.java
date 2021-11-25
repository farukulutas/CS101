import java.util.Scanner;

public class quiz {
   
   static boolean isMirror( String first, String second) {
      String temp;
      temp = "";
      
      for( int i = 0; i < first.length(); i++ ) {
         temp = temp + first.charAt(i );  
      }
      if (temp.equals(second) ) {
         return true;  
      }
      else{
         return false;
      }
   }
   
   public static void main( String[] args) {
      Scanner scan = new Scanner( System.in );
      String text, firstString, endOfString;
      int n;
      
      firstString = "";
      endOfString = "";
      System.out.print( "Enter a line of text: ");
      text = scan.nextLine();
      System.out.print( '\n' + "Enter number of charachters: " );
      n = scan.nextInt();
      firstString = text.substring(0, n);
      endOfString = text.substring( text.length() - n);
      if ( n > text.length() ) {
         System.out.print( '\n' + "Invalid input - line of text too short " );
      }
      else if ( text.equals( "exit") ) { 
         System.out.print( "goodbye"); 
      }
      else if ( isMirror( firstString, endOfString) ) {
         System.out.print( '\n' + firstString + " mirror: " + endOfString );  
      }
      else {
         System.out.print( '\n' + firstString + " not mirror: " + endOfString );    
      }
   
   }}
   
