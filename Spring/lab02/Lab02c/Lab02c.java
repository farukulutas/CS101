import java.util.Scanner;

/* The program calculate the volume of a triangular prism by using inputs from user, heron and volume formula of prism.
 * @author Ahmet Faruk Ulutaþ
 * @date 25/02/2020
 */
public class Lab02c {
   
   public static void main( String[] args) {
      
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      double firstSide, secondSide, thirdSide, length, semiPerimeter, areaFormula, volume;
      
      // program code
     
      // what we will do msg
      System.out.println( "We will find the volume of a tringular prism" );
      System.out.println( "Enter triangle sides a, b and c: " );
      
      // initialization of variables
      firstSide = scan.nextDouble();
      secondSide = scan.nextDouble();
      thirdSide = scan.nextDouble();
      
      System.out.println( "Enter prism length l: " );
      length = scan.nextDouble();
      
      // calculate the semiPerimeter
      semiPerimeter = ( firstSide + secondSide + thirdSide ) / 2;
      
      // find area by using the heron's formula
      areaFormula = Math.sqrt( semiPerimeter * ( semiPerimeter - firstSide ) * ( semiPerimeter - secondSide ) * ( semiPerimeter - thirdSide ) );
      
      // find the volume
      volume = areaFormula * length;
      
      // print sides' length
      System.out.println( "The sides of the triangle are " + firstSide + ", " + secondSide + " and " + thirdSide );
      
      // print prism's length
      System.out.println( "The length of the triangular prism is " + length );
      
      // print area using the areaFormula
      System.out.printf( "The area of base triangle of the prism with respect to given parameters is %-10.2f\n" , areaFormula );
      
      // print the volume of prism
      System.out.printf( "The volume of the prism with respect to given parameters is %-10.3f" , volume );
   }
   
}