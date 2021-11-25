import java.util.Scanner;

/**
 * Program calculates the bfp and decide the status
 * @author Ahmet Faruk Ulutaþ
 * @version 02/03/2020
 */ 
public class Lab03b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      double age, weight, height, bmi, bfp;
      String status;
      
      // program code
      
      // ask inputs
      System.out.println( "Please enter age: ");
      age = scan.nextDouble();
      
      System.out.println( "Please enter weight: ");
      weight = scan.nextDouble();
      
      System.out.println( "Please enter height: ");
      height = scan.nextDouble();
      
      // initiliaze status, bmi and bfp
      status = "";
      
      bmi = ( weight / ( height * height) );
      bfp = ( ( 1.20 * bmi ) + (0.23 * age ) - 16.2 );
      
      if ( age >= 18 && age <= 40 ) { 
         
         if ( bfp < 21 ) {
            
            status = "UNDERFAT";
         }
         else if ( bfp >= 21 && bfp < 33 ) {
            
            status = "HEALTHY";
         }
         else if ( bfp >= 33 && bfp <= 39 ) {
            
            status = "OVERWEIGHT";
         }
         else {
            
            status = "OBESE";
         }
      }
      else if ( age >= 41 && age <= 60 ) {
         
         if ( bfp < 23 ) {
            
            status = "UNDERFAT";
         }
         else if ( bfp >= 23 && bfp < 35 ) {
            
            status = "HEALTHY";
         }
         else if ( bfp >= 35 && bfp <= 40 ) {
            
            status = "OVERWEIGHT";
         }
         else {
            
            status = "OBESE";
         } 
      }
      else if ( age >= 61 && age <= 79 ) {
         
         if ( bfp < 24 ) {
            
            status = "UNDERFAT";
         }
         else if ( bfp >= 24 && bfp < 36 ) {
            
            status = "HEALTHY";
         }
         else if ( bfp >= 36 && bfp <= 42 ) {
            
            status = "OVERWEIGHT";
         }
         else {
            
            status = "OBESE";
         } 
      }
      else {
         
         System.out.println( "Your age is invalid. Please enter it btw 18 - 79. ");
      }
      
      // print weight, height, age, bmi, bfp and status if the age is valid
      if ( age >= 18 && age <= 79 ) {
         
         System.out.printf( "Based on a height of " + height + " and weight of " + (int) weight + " and age of " + (int) age + ", your BFP is %.2f %n" , bfp );
         System.out.println( "--> " + status );
      }
   }
   
}