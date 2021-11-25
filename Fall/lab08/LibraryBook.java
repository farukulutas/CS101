/**
 * LibraryBook class!
 * @Author Ahmet Faruk Ulutaþ
 * @Date 05.12.2019
 */

public class LibraryBook 
{   
   // properties
   String title;
   String author;
   String dueDate;
   int    timesLoaned;
   
   // constructors
   
   /**
    * LibraryBook datas
    * @theTitle
    * @theAuthor
    * @theTimesLoaned
    */
   public LibraryBook( String theTitle, String theAuthor, int theTimesLoaned)
   {
      title = theTitle;
      author = theAuthor;
      timesLoaned = theTimesLoaned;
   }
   
   /**
    * LibraryBook datas
    * @theTitle
    * @theAuthor
    */
   public LibraryBook( String theTitle, String theAuthor)
   {
      title = theTitle;
      author = theAuthor;
   }
   
   // methods
   
   /**
    * Method alter the information related with dueDate considering the book status. 
    */
   public void loanTheBook( String theDueDate)
   {
      System.out.println( "Book " + title + " is loaned.");
      dueDate = theDueDate;
      System.out.println( "The new due date is " + dueDate);
      timesLoaned++;
   }
   
   /**
    * Method show what will happen to dueDate when book returned.
    */
   public void returnTheBook()
   {
      System.out.println( "Book " + title + " is returned.");
      dueDate = "";
   }
   
   /**
    * Method get the information related with timesLoaned and then return timesLoaned. 
    * @return timesLoaned
    */
   public int getTimesLoaned()
   {
      return timesLoaned;
   }
   
   /**
    * Method check the status of book whether is onLoan and then reset the dueDate.
    * @return 
    */
   public boolean onLoan()
   {
      if ( dueDate.length() == 0)
      {
         return true;
      }
      else
      {
         return false;
      }     
   }
   
   /**
    * Method shows the informations considering the book status. 
    * @return info
    */
   public String toString()
   {
      return "Title: " + title + " - Author: " + author;
   }
   
   /**
    * Method check the titles and the authors of two book.
    * @return true or false
    */
   public boolean equals( LibraryBook aBook)
   {
      if( title == aBook.title &&
         author == aBook.author)
         return true;
      else
         return false;
   }
   
   /**
    * Method check the titles of two book.
    * @return true or false
    */
   public boolean hasSameTitle( LibraryBook aBook)
   {
      if( title == aBook.title)
         return true;
      else
         return false;
   }
   
   /**
    * Method check the authors of two book.
    * @return true or false
    */
   public boolean hasSameAuthor( LibraryBook aBook)
   {
      if( author == aBook.author)
         return true;
      else
         return false;
   }  
}