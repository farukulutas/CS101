import java.util.Scanner;

/**
 * MethodExercises.
 * @author Ahmet Faruk Ulutaþ
 * @version 13/11/2019
 */ 
public class lab06a
{
   /**
    * This method calculate that computes and returns x to the power y
    * @x input of base number
    * @y input of exponent number
    * @z (after loop) is output of calculation
    * @i is an integer for counting the multiplications
    */
   
   public static double power( double x, int y)
   {  
      int i;
      double z;
      z = 1;
      for ( i = 0 ; i <y ; i++){
         z = z * x;
      }
      return z;
   }
   /**
    * This method computes n factorial
    * @n input of a positive integer
    * @c is an integer for counting multiplications
    * @b (after loop) output of computation
    */
   public static long factorial ( int n ) {
      int a;
      long b;
      b = 1;
      for ( a = 0; a < n; a = a + 1 ){
         
         b = b * ( a + 1 );
      }
      return b;
   }
   /**
    * This method reverse texts like "abcd" to "dcba"
    * @s String parameter
    * @d is an integer used to locate the order of characters
    */
   public static String reverse( String s){
      int a, d;
      char c;
      String e;
      e = "";
      d = s.length() - 1;
      for ( a = 0 ; a < s.length() ; a++){
         c = s.charAt(d);
         e = e + String.valueOf(c);         
         d--;
      }
      return e;
   }
   /**
    * This method convert numbers from base2 to base10 digit system
    * @base2 input of integer
    * @c is an integer used to locate the order of characters
    * @d is an output in base10 digit
    */
   public static int toDecimal( String base2){
      int a;
      int b;
      char c;
      int d;
      d = 0;
      int power;
      a  = base2.length() - 1;
      for ( b = 0 ; b < base2.length() ; b++ ){
         c = base2.charAt(a);
         power = 1;
         int x;
         for ( x = 0 ; x < b ; x++){
            power = power *2; 
         }      
         
         d = d + ((Character.getNumericValue(c)) * power);
         a--;
      }
      return d;
   }
   /**
    * This method convert numbers from base10 to base2 digit system
    * @decimal input of integer
    * @b is an output in base10 digit
    */
   public static String toBinary( int decimal)
   {
      int a;
      String b;
      b = "";
      while ( decimal != 1)
      {
         a = decimal % 2;
         b = b + String.valueOf( a);
         decimal = decimal / 2;
      }
      b = b + "1";
      b = reverse( b);
      
      return b;
   }
   /**
    * This method calculate the sinus via x value.
    * @x input of double
    */
   public static double sinx( double x, int n)
   {
      //variables
      double first, sum;
      
      //program code
      first = x;
      sum = x;
      for ( int a = 1; a < n; a = a + 1 )
      {
         first = (-1 * x * x) / ( 2 * a * ( 2 * a + 1) );
         sum = sum + first;
      }
      return sum;
   }
         
   public static void main(String[] args) {
      Scanner scan = new Scanner( System.in);
      int total, e, n, m, count2;
      String a, b, c, d, f, g, i;
      double j, x, term;
      
      //print a table with columns n, n-squared, n-cubed & n to the power 4, for values of n from -1 to 10 inclusive
      for ( n = -1 ; n <= 10 ; n++){
         
         
         a = Double.toString(power(n,1));  
         while ( a.length() < 8 ) {
            a = a + " ";
         }  
         System.out.print(a);
         
         b = Double.toString(power(n,2));  
         while ( b.length() < 8 ) {
            b = b + " ";
         } 
         System.out.print(b);
         
         c = Double.toString(power(n,3));  
         while ( c.length() < 8 ) {
            c = c + " ";
         }  
         System.out.print(c);
         
         d = Double.toString(power(n,4));
         while ( d.length() < 8 ) {
            d = d + " ";
         }  
         System.out.print(d);
         System.out.println();
         System.out.println();
         
         
      }
      // print a table of n and n-factorial, for values of n from 1 to 15
      for ( e = 1 ; e < 15 ; e++){
         System.out.println(factorial(e));
      }
      // read two binary (base-2) Strings from the user, convert them to decimal, then add them together and print the result in binary form.
      f = scan.next();
      g = scan.next();
      total = toDecimal(f) + toDecimal(g);
      System.out.println();
      System.out.println( "Sum = " + toBinary( total));
      
      System.out.println();
      System.out.println();
      
      // read a line of text from the user and output it again, but with each word reversed.
      System.out.println("please enter a sentence");
      scan.nextLine();
      i = scan.nextLine(); 
      
      String[] output = i.split(" ");
      String sonuc = "";
      for ( m = 0 ; m < output.length ; m++){
         sonuc += reverse(output[m] + " ");  
      }
      System.out.println(sonuc);
      
      // Sinus approximate calculation
      System.out.println( "Sin(x) Calculator");
      
      System.out.println( "Enter x:");
      j = scan.nextDouble();
      j = Math.toRadians( j);
      
      term = 0;
      for( count2 = 0; count2 <= 10; count2++)
      {
         term = term + power( -1, count2) * power( j, ( 2 * count2 + 1)) / factorial( 2 * count2 + 1); 
         System.out.println( count2 + "   " + power( -1, count2) + "   " + power( j, ( 2 * count2 + 1)) + "   " + factorial( 2 * count2 + 1) + "   " + term);
      }
      System.out.println();
      System.out.println();
      
      // Difference of approximate and real sinus
      System.out.println( "Difference of sin(x)s");
      System.out.println( "Enter x for real sin(x) calculation");
      x = scan.nextDouble();
      System.out.println( "Sin(x) value with method is " + sinx( x, 10));
      System.out.println( "Sin(x) value with java method is " + Math.sin( x ));
   }
}