import java.util.Scanner;

/**
 * the program calculate numbers which is given by the user.
 * @author Ahmet Faruk Ulutaþ
 * @version 17.10.2019
 */ 
public class lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      double number1;
      double number2;
      double max;
      double min;
      
      // program code
      number1 = scan.nextDouble();
      number2 = scan.nextDouble();
      max = Math.max(number1, number2);
      min = Math.min(number1, number2);
      
      System.out.println( "Welcome to the Calculator.");
      System.out.println( "Sum is " + ( max + min ));
      System.out.println( "Difference is " + ( max - min ));
      System.out.println( "Product is " + ( number1 * number2 ));
      System.out.println( "Divison is " + ( number1 / number2 ));
      System.out.println( "Remainder is " + ( number1 % number2 ));
      System.out.println( "End.");
   }

}