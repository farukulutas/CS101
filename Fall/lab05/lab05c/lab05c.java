import java.util.Scanner;

/**
 * SimpleCalc
 * @author Ahmet Faruk Ulutaþ
 * @version 07/11/2019
 */ 
public class lab05c
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    final String ADD = "+";
    final String SUBT = "-";
    final String DIV = "/";
    final String PROD = "*";
    final String QUIT = "Q";
    final String QUIT2 = "Quit";
    final String QUIT3 = "q";
    final String QUIT4 = "quit";
    final String CLEAR = "clear";
    final String CLEAR2 = "Clear";
    final String CLEAR3 = "c";
    final String CLEAR4 = "C";
    
    // variables
    double value;
    double result;
    String quitClearCalc;
    boolean isQuit;
    
    // program code
    result = 0;
    System.out.println( "Welcome to SimpleCalc...");
    
    isQuit = false;
    
    do
    {
      System.out.println();
      System.out.println( "------------------");
      System.out.println( result);
      System.out.println( "------------------");
      System.out.println( "+,-,*,/ value");
      System.out.println( "Clear");
      System.out.println( "Quit");
      System.out.println( "------------------");
      
      quitClearCalc = scan.next();
      
      if ( quitClearCalc.equals(ADD) )
      {
        value = scan.nextDouble( );
        result = result + value;
        System.out.print( "Select: " + ADD + value );
      }
      else if ( quitClearCalc.equals(SUBT) )
      {
        value = scan.nextDouble( );
        result = result - value;
        System.out.println( "Select: " + value );
      }
      else if ( quitClearCalc.equals(DIV) )
      {
        value = scan.nextDouble( );
        if ( value == 0 )
        {
          System.out.println( "You cannot divide by zero.");
        }
        else
        {
          result = result / value;
          System.out.println( "Select: " + value );
        }
      }
      else if ( quitClearCalc.equals(PROD) )
      {
        value = scan.nextDouble( );
        result = result * value;
        System.out.println( "Select: " + value );
      }
      else if ( quitClearCalc.equals(CLEAR) || quitClearCalc.equals(CLEAR2) || quitClearCalc.equals(CLEAR3) || quitClearCalc.equals(CLEAR4) )
      {
        result = 0;
      }
      else if ( quitClearCalc.equals(QUIT) || quitClearCalc.equals(QUIT2) || quitClearCalc.equals(QUIT3) || quitClearCalc.equals(QUIT4) )
      {
        System.out.println("Goodbye.");
        isQuit = true;
      }  
    } while  ( !isQuit );
  }
}

