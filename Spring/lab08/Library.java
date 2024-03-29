/**
 * A simple Library Class!
 * @author Ahmet Faruk Uluta�
 * @version 28/04/2020
 */ 
public class Library {
   // properties
   private LibraryBook b1, b2, b3, b4;
   
   // constructors
   public Library() {
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }
   
   // methods
   
   /*
    * This method checks whether the library is empty or not
    * @return true if its empty else false
    */
   public boolean isEmpty() {
      if ( b1 == null && b2 == null && b3 == null && b4 == null ) {
         return true;
      }
      else {
         return false;
      }
   }
   
   /*
    * This method display the library books, one book per line, if library is empty return empty msg
    * @return if is empty return empty message else print books, one book per line
    */
   public String toString() {
      if ( b4 != null ) {
         return b1 + "\n" + b2 + "\n" + b3 + "\n" + b4;
      }
      else if ( b3 != null ) {
         return b1 + "\n" + b2 + "\n" + b3;
      }
      else if ( b2 != null ) {
         return b1 + "\n" + b2;  
      }
      else if ( b1 != null ) {
         return b1 + " ";
      }
      else {
         return "The library is empty!";  
      }
   }
   
   /*
    * This method add a new book and return true if there is a empty space in library else false
    * @return true if adding process is successful else false
    */
   public boolean add( String author, String title ) {
      LibraryBook book;
      
      book = new LibraryBook( author, title);
      
      if ( b1 == null ) {
         b1 = book;
         return true;
      }
      else if ( b2 == null ) {
         b2 = book;
         return true;
      }
      else if ( b3 == null ) {
         b3 = book;
         return true;
      }
      else if ( b4 == null ) {
         b4 = book;
         return true;
      }
      else {
         return false;
      }
   }
   
   /*
    * This method remove the specified book from the library and return true, if book not in library return false
    * @return true if book removed else false
    */
   public boolean remove( LibraryBook book)
   {
      if( book.equals( b1) ) {
         b1 = null;
         return true;
      }
      else if( book.equals( b2) ) {
         b2 = null;
         return true;
      }
      else if( book.equals( b3) ) {
         b3 = null;
         return true;
      }
      else if ( book.equals( b4) ) {
         b4 = null;
         return true;
      }
      else {
         return false;
      }
   }
   
   /*
    * This method find a book with the given title
    * @return book or null
    */
   public LibraryBook findByTitle( String title ) {
      if ( b1 != null && b1.getTitle().equals( title ) ) {
         return b1;
      }
      else if ( b2 != null && b2.getTitle().equals( title ) ) {
         return b2;
      }
      else if ( b3 != null && b3.getTitle().equals( title ) ) {
         return b3;
      }
      else if ( b4 != null && b4.getTitle().equals( title ) ) {
         return b4;
      }
      
      return null;
   }
   
}