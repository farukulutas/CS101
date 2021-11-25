import java.util.Scanner;

/**
 * the program calculate how many flowers can use in a garden. 
 * @author Ahmet Faruk Uluta�
 * @version 17.10.2019
 */ 
public class lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      double a;
      double b;
      double c;
      double s;
      double area;
      int maxNumberOfFlowers;

      // program code
      // first get the a,b,c from user and calculate the s value
      System.out.println( "Enter the lengths of triangle");
      
      a = scan.nextDouble();
      b = scan.nextDouble();
      c = scan.nextDouble();
      s = ( a + b + c ) / 2;
      area = Math.sqrt( s * ( s - a )*( s - b )*( s - c ));
      maxNumberOfFlowers = (int)(area * 17);
      System.out.println( "Maximum number of flowers is " + maxNumberOfFlowers);
      System.out.println( "End.");
   }

}