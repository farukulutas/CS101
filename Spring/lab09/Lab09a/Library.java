import java.util.ArrayList;

/**
 * A simple Library Class!
 * @author Ahmet Faruk Ulutaþ
 * @version 28/04/2020
 */ 
public class Library {
   // properties
   private ArrayList<LibraryBook> bookList; 
   
   // constructors
   public Library() {
      bookList = new ArrayList<LibraryBook>();
   }
   
   // methods
   
   /*
    * This method checks whether the library is empty or not
    * @return true if its empty else false
    */
   public boolean isEmpty() {
      if ( bookList.size() == 0 ) {
         return true;
      }
      return false;
   }
   
   /*
    * This method display the library books, one book per line, if library is empty return empty msg
    * @return if is empty return empty message else print books, one book per line
    */
   public String toString() {
      String info;
      
      info = "";
      
      if ( isEmpty() ) {
         System.out.println( "The library is empty!" );
      }
      else {
         for ( LibraryBook i : bookList ) {
            info = info + '\n' + i;
         }
      }
      
      return info;
   }
   
   /*
    * This method add a new book and return true if there is a empty space in library else false
    * @return true if adding process is successful else false
    */
   public boolean add( String author, String title ) {
      LibraryBook book;
      
      book = new LibraryBook( author, title);
      
      for ( LibraryBook i : bookList ) {
         if ( i.getAuthor().compareTo( book.getAuthor() ) > 0 ) {
            bookList.add( bookList.indexOf( i), book);
            return true;
         }
         else if ( i.getAuthor().compareTo( book.getAuthor() ) == 0 ) {
            if ( i.getTitle().compareTo( book.getTitle() ) > 0 ) {
               bookList.add( bookList.indexOf( i), book);
               return true;
            }
         }
      }
      
      bookList.add( book);
      return true;
   }
   
   /*
    * This method remove the specified book from the library and return true, if book not in library return false
    * @return true if book removed else false
    */
   public boolean remove( LibraryBook book)
   {
//      int index = books.indexOf(book);
      if ( bookList.isEmpty() ) {
         return false;
      }
      
      bookList.remove( book);
      return true;
   }
   
   /*
    * This method find a book with the given title
    * @return book or null
    */
   public LibraryBook findByTitle( String title ) {
      for ( LibraryBook i : bookList ) {
         if ( i.getTitle().equals( title) ) {
            return i;
         }
      }
      
      return null;
   }
   
   /*
    * This method find a book with the given author
    * @return book or null
    */
   public void findByAuthor( String author ) {
      String info;
      boolean isEmpty;
      
      info = "";
      isEmpty = false;
      
      for ( LibraryBook i : bookList ) {
         if ( i.getAuthor().equals( author) ) {
            info = info + '\n' + i;
         }
      }
      
      if ( info.length() == 0 ) {
         isEmpty = true;
      }
      
      if ( isEmpty ) {
         System.out.println( "There is no book with the given author.");
      }
      else {
         System.out.println( info);  
      }
   }
   
}