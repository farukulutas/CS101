/**
 * A simple TestLibraryBook Class!
 * @author Ahmet Faruk Ulutaþ
 * @version 28/04/2020
 */
public class TestLibraryBook {
   public static void main( String[] args) {
      // variables
      LibraryBook book1, book2, book3, book4;
      
      // program code
      
      // initilase the book variables
      book1 = new LibraryBook( "John  Sandford", "Masked Prey" );
      book2 = new LibraryBook( "Sue Monk Kidd", "The Book of Longings" );
      book3 = book2;
      book4 = new LibraryBook( "John  Sandford", "Masked Prey" );
      
      // display the books and new line
      System.out.println( book1 );
      System.out.println( book2 );
      System.out.println( book3 );
      System.out.println( book4 );
      System.out.println();
      
      // compare books by using == signs and new line
      System.out.println( book1 == book2 );
      System.out.println( book2 == book3 );
      System.out.println( book1 == book4 );
      System.out.println();
      
      // compare books by using .equals() method
      System.out.println( book1.equalsOne( book2 ) );
      System.out.println( book2.equalsOne( book3 ) );
      System.out.println( book1.equalsOne( book4 ) );
   }
   
}