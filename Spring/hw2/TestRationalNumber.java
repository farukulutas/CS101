public class TestRationalNumber {   
   public static void main( String[] args )    {
      // variables
      RationalNumber x, y, z;
      
      // program code
      
      // initilase the variables
      x = new RationalNumber( 2, 20 );    
      y = new RationalNumber( -3, 30 );    
      
      // addition method sample and print
      z = x.addition( y );     
      System.out.println( x + " + " + y + " = " + z );       
      
      // subtraction method sample and print
      z = x.subtraction( y );
      System.out.println( x + " - " + y + " = " + z );
      
      // multiplication method sample and print
      z = x.multiplication( y );
      System.out.println( x + " x " + y + " = " + z );
      
      // division method sample and print
      z = x.division( y );
      System.out.println( x + " % " + y + " = " + z );
      
      // reciprocal method sample and print
      z = x.reciprocal();
      System.out.println( "(" + x + " )^-1 = " + z );
      
      // equals method test
      if ( x.equals( y) ) {
         System.out.println( "The rational numbers are equal.");
      }
      else {
         System.out.println( "The rational numbers are not equal.");
      }
   }
} 
