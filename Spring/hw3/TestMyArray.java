/**
 * This is the test of my array class with several methods and examples
 * @author Ahmet Faruk Ulutaþ
 * @version 22/05/2020
 */ 
public class TestMyArray {
   public static void main( String[] args) {
      
      // variables
      MyArray myArray, testArray;
      int[] mergeArray, list;
      int lucky, balanced;
      
      // program code
      
      // initilase the variables
      myArray = new MyArray();
      testArray = new MyArray( 20);
      mergeArray = new int[] { 99, 65, 45, 21, 31};
      list = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      
      // print before and after testing the findLucky method
      System.out.print( "--------------  findLucky()  -----------------\n");
      myArray.print();
      myArray.setArray( 6);
      myArray.print();
      lucky = myArray.findLucky();
      
      // if lucky is found print them else print not printed msg
      if ( lucky != -1 ) {
         System.out.print( "The lucky integer is " + lucky + "\n\n");
      }
      else {
         System.out.print( "There is no lucky integer");
      }
      
      // print before and after testing the isBalanced method
      System.out.println( "\n--------------  isBalanced()  -----------------");
      myArray.setArray( 6);
      myArray.print();
      balanced = myArray.isBalanced();
      
      // if is balanced print the boundry and msg else print not balanced msg
      if ( balanced != -1 ) {
         System.out.println( "The array is balanced and the last index of the first part is " + balanced);
      }
      else {
         System.out.println( "The array is not balanced");
      }
      
      // print before and after testing the merge method
      System.out.println( "\n--------------  merge()  -----------------");
      myArray = new MyArray( 10);
      myArray.print();
      System.out.print( "array to be merged with: [");
      
      // print mergeArray
      for ( int i : mergeArray ) {
         System.out.print( " " + i + ",");
      }
      
      System.out.println( " ]"); 
      myArray.merge( mergeArray);
      myArray.print();
      
      // print before and after testing the randomize method
      System.out.println( "\n--------------  randomize()  -----------------");
      myArray.print();
      myArray.randomize();
      myArray.print();
      
      // print before and after testing the sort method
      System.out.println( "\n--------------  sort()  -----------------");
      myArray.print();
      myArray.sort();
      myArray.print();
      
      // tests with another myarray and int array, if the result is -1, it means it is WRONG.
      System.out.println( "\n--------------  test()  -----------------");
      testArray.print();
      System.out.println("The lucky number is " + testArray.findLucky() );
      System.out.println("The last index of first part of balanced array is " + testArray.isBalanced() ); 
      testArray.merge( list);
      testArray.print();
      testArray.randomize();
      testArray.print();
      testArray.sort();
      testArray.print();
   }
   
}