public class Lab01b {
   /* This program calculate the BFP value for men by using his weight, height and age value.
    * @author Ahmet Faruk Ulutaþ
    * @version 18/02/2020
    */
   
   public static void main( String[] args) {
      
      // constants
      final double WEIGHT = 72;
      final double HEIGHT = 1.76;
      final double AGE = 25;
      final double BMI = ( WEIGHT / ( HEIGHT * HEIGHT) );
      final double BFP = ( ( 1.20 * BMI ) + (0.23 * AGE ) - 16.2 );
      
      // variables
      
      // program code
      
      // print weight, height, age, bmi and bfp
      System.out.println("weight(kg): " + (int) WEIGHT);
      System.out.println("height(m): " + HEIGHT);
      System.out.println("age(years): " + (int) AGE);
      System.out.println( "Based on a height of " + HEIGHT + " and weight of " + (int) WEIGHT + " and age of " + (int) AGE + "  your BMI is " + BMI +  " and your BFP is %" + BFP );
   }
   
}