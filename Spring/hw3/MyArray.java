/**
 * This is my array class with several properties!
 * @author Ahmet Faruk Uluta�
 * @version 22/05/2020
 */ 
public class MyArray {
   // properties
   private int[] array;
   
   // constructors
   public MyArray() {
      array = new int[ 10];
      
      for ( int i = 0; i < 10; i++ ) {
         array[ i] = -1;
      }
   }
   
   public MyArray( int length) {
      this.array = new int[ length];
      
      for ( int i = 0; i < length; i++ ) {
         this.array[ i] = (int) ( Math.random() * (length + 1) );
      }
      
      System.out.println( "Random array has been created.");
   }
   
   // methods
   
   /* This method get the array
    * @return array Array
    */
   public int[] getArray() {
      return this.array;
   }
   
   /* This method set the array if the lengths are not equal create new one with specifed length
    */
   public void setArray( int length) {
      if ( this.array.length != length ) {
         int[] newArray;
         
         newArray = new int[ length];
         
         for ( int i = 0; i < length; i++ ) {
            newArray[ i] = (int) ( Math.random() * (length + 1) );
         }   
         
         this.array = newArray;
      }
      
      System.out.println( "The array has been set");
   }
   
   /* This method find the lucky number which has same occurence and value
    * @return i Lucky number or -1
    */
   public int findLucky() {
      int count;
      
      for ( int i : this.array) {
         count = 0;
         
         for ( int j = 0; j < this.array.length; j++) {
            if ( i == array[ j] )
               count++;
         }
         
         if (count == i)
            return i;
      }
      
      return -1;
   }
   
   /* This method checks whether the array is balanced or not
    * @return k Boundary of balanced value or -1
    */
   public int isBalanced() {
      int leftSum, rightSum;
      
      leftSum = 0;
      rightSum = 0;
      
      for ( int i = 0; i < this.array.length; i++ ) {
         leftSum += this.array[ i];
      }
      
      for (int j = this.array.length - 1; j >= 0; j--) {
         rightSum += this.array[ j]; 
         leftSum -= this.array[ j] ; 
         
         if ( rightSum == leftSum ) {
            return j - 1;
         } 
      }
      
      return -1; 
   }
   
   /* This method merge the arrays
    * @param otherArray Integer array to merge
    */
   public void merge( int[] otherArray) {
      int[] result;
      
      result = new int[ array.length + otherArray.length];
      
      for ( int i = 0; i < array.length; i++ ) {
         result[ i] = array[ i];
      }
      
      for ( int j = array.length; j < array.length + otherArray.length; j++ ) {
         result[ j] = otherArray[ j - array.length];
      }
      
      this.array = result;
      System.out.println( "The arrays have been merged.");
   }
   
   /* This method randomize the arrays values
    */
   public void randomize() {
      int temp, randomIndex;
      
      for ( int i = 0; i < array.length; i++ ) {
         randomIndex = (int) ( Math.random() * array.length);
         
         temp = array[ i];
         array[ i] = array[ randomIndex];
         array[ randomIndex] = temp;
      }
      
      System.out.println( "The array has been randomized.");
   }
   
   /* This method sort the array by using bubble sort algorithm
    */
   public void sort() {
      int temp;
      
      for ( int i = 0; i < array.length - 1; i++ ) {
         for ( int j = 0; j < array.length - i - 1; j++ ) { 
            if ( this.array[ j] > this.array[ j + 1 ] ) {
               temp = this.array[ j]; 
               this.array[ j] = this.array[ j + 1]; 
               this.array[ j + 1] = temp;
            } 
         }
      }
      
      System.out.println( "The array has been sorted.");
   }
   
   /* This method is a print method to print the array
    */
   public void print() {
      System.out.print( "Array: [");
      
      for ( int i : this.array ) {
         System.out.print( " " + i + ",");
      }
      
      System.out.println( " ]");
   }
   
}