/**
 * Library class!
 * @Author Ahmet Faruk Uluta�
 * @Date 05.12.2019
 */

public class Library 
{
   // properties
   LibraryBook b1;
   LibraryBook b2;
   LibraryBook b3;
   LibraryBook b4;
   
   // constructors
   
   /**
    * Library book datas.
    * @b1
    * @b2
    * @b3
    * @b4
    */
   public Library()
   {
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }
   
   // methods
   
   /**
    * Method check the datas of the books if the books null boolean return true
    * @return true or false
    */
   public boolean isEmpty()
   {
      if( b1 == null && b2 == null && b3 == null && b4 == null)
         return true;
      else 
         return false;
   }
   
   /**
    * Method shows the informations considering the book status. 
    * @return info
    */
   public String toString()
   {
      if( b1 == null && b2 == null && b3 == null && b4 == null)
      {
         return "The library is empty";
      }
      else
      {
         if( b1 != null)
            return "Title: " + b1.title + " - Author: " + b1.author;
         if( b2 != null)
            return "Title: " + b2.title + " - Author: " + b2.author;
         if( b3 != null)
            return "Title: " + b3.title + " - Author: " + b3.author;
         else
            return "Title: " + b4.title + " - Author: " + b4.author;
      }
   }
   
   /**
    * Method add the books to the library by adding the title and author informations from user.
    * @return null
    */
   public LibraryBook add( String title, String author)
   {
      if( b1 == null)
      {
         b1 = new LibraryBook( title, author);
         System.out.println( b1 + " is added.");
         return b1;
      }
      else if( b2 != null)
      {
         b2 = new LibraryBook( title, author);
         System.out.println( b2 + " is added.");
         return b2;
      }
      else if( b3 != null)
      {
         b3 = new LibraryBook( title, author);
         System.out.println( b3 + " is added.");
         return b3;
      }
      else if( b4 != null)
      {
         b4 = new LibraryBook( title, author);
         System.out.println( b4 + " is added.");
         return b4;
      }
      return null;
   }
   
   /**
    * Method remove the books selected.
    * @return true, false or null
    */
   public boolean remove( LibraryBook book)
   {
      if( book != null)
      {
         if( book.equals( b1))
         {
            b1 = null;
            return true;
         }
         else if( book.equals( b2))
         {
            b2 = null;
            return true;
         }
         else if( book.equals( b3))
         {
            b3 = null;
            return true;
         }
         else
         {
            b4 = null;
            return true;
         }
      }
      else
         return false;
   }
   
   /**
    * Method find the book by title.
    * @return null
    */
   public LibraryBook findByTitle( String title)
   {
      if( b1 == null && b2 == null && b3 == null && b4 == null)
      {
         System.out.println( "The library is empty!");
         return null;
      }
      else
      {
         if ( b1.title.equals(title))
            return b1;
         else if ( b2.title.equals(title))
            return b2;
         else if ( b3.title == title)
            return b3;
         else if ( b4.title == title)
            return b4;
         else 
            return null;
      }   
   }
}