import java.util.Scanner;

/**
 * This program ask 3 sides of triangle and print type of triangle 
 * @author Ahmet Faruk Ulutaþ
 * @version 02/03/2020
 */ 
public class Lab03d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int side, side2, side3;
      
      // program code
      
      // ask and initilaze sides
      System.out.print( "Please enter the side lengths: ");
      side = scan.nextInt();
      side2 = scan.nextInt();
      side3 = scan.nextInt();
      
      // print sides
      System.out.println( "Side lengths: " + side + " " + side2 + " " + side3 );
      
      // if sides positive
      if ( side > 0 && side2 > 0 && side3 > 0 ) {
         
         // if sides form a triangle
         if ( Math.abs( side - side2 ) < side3 && side3 < ( side + side2 ) && Math.abs( side3 - side2 ) < side && side < ( side3 + side2 ) && Math.abs( side - side3 ) < side2 && side2 < ( side + side3 ) ) {
            
            // triangle is scalene?
            if ( side != side2 && side2 != side3 ) {
               
               System.out.print( "The numbers form a SCALENE triangle." );
            }
            
            // triangle is isoscelene?
            else if ( side == side2 || side2 == side3 ) {
               
               System.out.print( "The numbers form a ISOSCELES triangle." );
            }
            
            // triangle is equilateral?
            else if ( side == side2 && side2 == side3 ) {
               
               System.out.print( "The numbers form a EQUILATERAL triangle." );
            }
         }
         
         // print it does not from a triangle
         else {
            
            System.out.print( "The numbers do not form a triangle." );
         }
      }
      
      // print values must be positive
      else {
         
         System.out.print( "The side lengths must be positive." );
      }
   }
   
}