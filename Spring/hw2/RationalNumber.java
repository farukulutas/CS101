/**
 * This program simulates rational numbers and does the calculations
 * @author Ahmet Faruk Ulutaþ
 * @version 15/05/2020
 */ 
public class RationalNumber {
   // properties
   private int numerator, denominator;
   
   // constructors
   public RationalNumber( int numerator, int denominator) {
      if ( denominator == 0)
         denominator = 1;
      
      if ( denominator < 0) {
         numerator = -numerator;
         denominator = -denominator;
      }
      
      this.numerator = numerator;
      this.denominator = denominator;
      
      reduce();
   }
   
   // methods
   
   /* This method get numerator
    * @return numerator Numerator
    */
   public int getNumerator() {
      return this.numerator;
   }
   
   /* This method get denominator
    * @return denominator Denominator
    */
   public int getDenominator() {
      return this.denominator;
   }
   
   /* This method calculate sum of two rational numbers
    * @param other Other rational number
    * @return sum
    */
   public RationalNumber addition( RationalNumber other) {
      int commonDenominator, numerator1, numerator2;
      
      commonDenominator = this.getDenominator() * other.getDenominator();
      numerator1 = this.getNumerator() * other.getDenominator();
      numerator2 = other.getNumerator() * this.getDenominator();
      
      return new RationalNumber( numerator1 + numerator2, commonDenominator);
   }
   
   /* This method calculate substraction of two rational numbers
    * @param other Other rational number
    * @return sum
    */
   public RationalNumber subtraction(RationalNumber other) {
      int commonDenominator, numerator1, numerator2, difference;
      
      commonDenominator = denominator * other.getDenominator();
      numerator1 = numerator * other.getDenominator();
      numerator2 = other.getNumerator() * denominator;
      difference = numerator1 - numerator2;
      
      return new RationalNumber( difference, commonDenominator);
   }
   
   /* This method calculate multiplication of two rational numbers
    * @param other Other rational number
    * @return sum
    */
   public RationalNumber multiplication( RationalNumber other) {
      int numer, denom;
      
      numer = numerator * other.getNumerator();
      denom = denominator * other.getDenominator();
      
      return new RationalNumber( numer, denom);
   }
   
   /* This method calculate division of two rational numbers
    * @param other Other rational number
    * @return sum
    */
   public RationalNumber division( RationalNumber other) {
      return multiplication( other.reciprocal() );
   }
   
   /* This method calculate reciprocal of the rational number
    * @return reciprocaled version
    */
   public RationalNumber reciprocal() {
      return new RationalNumber( denominator, numerator);
   }
   
   /* This method simplify the the rational number
    */
   private void reduce() {
      int common;
      
      if ( numerator != 0)
      {
         common = gcd( Math.abs( numerator), denominator);
         
         numerator = numerator / common;
         denominator = denominator / common;
      }
   }
   
   /* This method calculate gcd of the rational number
    * @param num1 number one
    * @param num2  number two
    * @return simplified version
    */
   private int gcd( int num1, int num2) {
      while( num1 != num2)
         if( num1 > num2)
         num1 = num1 - num2;
      else
         num2 = num2 - num1;
      
      return num1;
   }
   
   /* This method checks and retutrn true or false
    * @return true or false
    */
   public boolean isInteger() {
      return denominator == 1;
   }
   
   /* This method checks and retutrn true or false
    * @return reciprocaled version
    */
   public boolean isZero() {
      return numerator == 0;
   }
   
   /* This method checks and retutrn true or false
    * @return reciprocaled version
    */
   public boolean isLessThan( RationalNumber other ) {
      return this.getNumerator() / this.getDenominator() < other.getNumerator() / other.getDenominator() ;  
   }
   
   /* This method checks whether they are equal or not nd retutrn true or false
    * @return true or false
    */
   public boolean equals( RationalNumber other ) {
      return ( numerator == other.getNumerator() && denominator == other.getDenominator() );
   }
   
   /* This method return and display the proper toString method
    * @return result string representation
    */
   public String toString() {
      String result;
      
      if ( numerator == 0)
         result = "0";
      else
         if ( denominator == 1)
         result = numerator + "";
      else
         result = numerator + "/" + denominator;
      
      return result;
   }
   
}