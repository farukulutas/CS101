import java.util.Arrays;

/**
 * BigNum Test Class.
 * @author Ahmet Faruk ULUTAS
 * @version 19/12/2019
 */ 
public class Lab10a
{
   public static void main(String[] args)
   {
      // variables
      BigNum b1;
      BigNum b2;
      BigNum b3;
      BigNum b4;
      BigNum b5;

      // program code
      
      // create BigNums to test.
      b1 = new BigNum();
      b2 = new BigNum( "110");
      b3 = new BigNum( b2);
      b4 = new BigNum( "10");
      b5 = new BigNum( b2);

      // print BigNums
      System.out.println( b1);
      System.out.println( b2);
      System.out.println( b3);
      System.out.println();

      // test Methods in BigNums Class
      
      // .equals method
      System.out.println( "b2.equals(b3): " + b2.equals(b3));
      System.out.println();
     
      // isZero method
      System.out.println( "b1.isZero(): " + b1.isZero());
      System.out.println();
     
      System.out.println( "b2.isZero(): " + b2.isZero());
      System.out.println();
     
      // when shift method is true
      System.out.println( "Shifting: ");
      b2.shift( true);
      System.out.println( "while left is true, b2: " + b2);
      
      // when shift method is false
      b3.shift( false);
      System.out.println( "while left is false, b3: " + b3);
      System.out.println();

      // add method
      System.out.println(b5.add(b4));
   }
}