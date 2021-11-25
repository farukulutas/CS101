import java.util.ArrayList;

/**
 * Library class!
 * @Author Ahmet Faruk Ulutaþ
 * @Date 05.12.2019
 */

public class Library 
{
   
   private ArrayList<LibraryBook> books;
   
   // properties
   
   // constructors
   
   /**
    * Library books (ArrayList).
    * @books
    */
   public Library()
   {
      books = new ArrayList<LibraryBook> ();
   }
   
   // methods
   
   /**
    * Method check the datas of the books if the books null boolean return true
    * @return true or false
    */
   public boolean isEmpty()
   {
      return books.size() == 0;
   }
   
   /**
    * Method shows the informations considering the book status. 
    * @return info
    */
   public String toString()
   {
      if( isEmpty() )
      {
         return "The library is empty";
      }
      
      String info;
      info = "";
      
      for ( int i = 0; i < books.size(); i = i + 1 )
      {
         if ( books.get(i).getTimesLoaned() == 0 )
         {
            info = info + books.get(i).getTitle() + " is written by " + books.get(i).getAuthor() + "." + "\n";
         }
         else
         {
            if ( books.get(i).getDueDate().equals("") )
            {
               info = info + books.get(i).getTitle() + " is written by " + books.get(i).getAuthor() + " and the times loaned " + books.get(i).getTimesLoaned() + "." + "\n";
            }
            else
            {
               info = info + books.get(i).getTitle() + " is written by " + books.get(i).getAuthor() + " and the due date is " + books.get(i).getDueDate() + "." + "\n";
            }
         }
      }
      if ( info != "")
      {
         return info;
      } // ?
      return info;
   }
   
   /**
    * Method add the books to the library by adding the title and author informations from user.
    * @return books
    */
   public void add( String title, String author)
   {
      books.add( new LibraryBook( title, author) );
   }
   
   /**
    * Method remove the books selected.
    * @return true, false or null
    */
   public boolean remove( LibraryBook book)
   {
      int index = books.indexOf(book);
      if ( index == -1 )
      {
         return false;
      }
      else
      {
         books.remove( index );
         return true;
      }
   }
   
   /**
    * Method find the book by title.
    * @return null
    */
   public LibraryBook findByTitle( String title)
   {
      for ( int a = 0; a < books.size(); a = a + 1 )
      {
         if ( books.get(a).getTitle().equals(title) )
         {
            return books.get(a);
         }
      }
      return null;
   }
}   