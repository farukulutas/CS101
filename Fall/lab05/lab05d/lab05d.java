import java.util.Scanner;

/**
 * approximate pi calculation
 * @author Ahmet Faruk Uluta�
 * @version 07/11/2019
 */ 
public class lab05d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //constants
      final double C;
      
      // variables
      int a;
      double b;
      int n;
      double sum;
      double formula;
      double difference;
      double realPI;
      
      // program code
      
      //constant pi calculation
      System.out.println( Math.PI);
      System.out.println();
      
      //pi calculation part
      sum = 0;
      System.out.println( "Please enter a number to calculate PI.");
      n = scan.nextInt ();
      for ( a = 0; a < n; a++ )
      {
         formula = ( 4.0 / ( ( 2 * a ) + 1 ) * Math.pow( -1 , a ));
         sum = sum + formula;
      }
      System.out.print( sum);
      System.out.println();
      
      //difference part
      realPI = 0;
      C = 10000000;
      a = 0;
      while (a < C) {  
         formula = ( 4.0 / ( ( 2 * a ) + 1 ) * Math.pow( -1 , a ));
         realPI = realPI + formula;
         a++;
      }
      difference = Math.abs(realPI - sum);
      b = scan.nextDouble();
      if ( difference >= b )
      {
         System.out.println( "Difference is ");
         System.out.println( difference);
      }
      else
      {
         System.out.println(" error...");
      }
   }
}