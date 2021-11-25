/**
 * A simple LibraryBook class.
 */
public class LibraryBook
{
   // properties
   private String title, author, dueDate;
   private int timesLoaned;
   boolean loan;
   
   // constructors
   
   /**
    * LibraryBook datas
    * @title
    * @author
    */
   public LibraryBook( String title, String author )
   {
      this.title = title;
      this.author = author;
      this.dueDate = "";
      this.timesLoaned = 0;
   }
   
   // methods
   
   /**
    * Method shows the informations considering the book status. 
    * @return info
    */
   public String toString()
   {
      String info;
      info = ("Title is " + title + " written by " + author + "." );
      
      if ( onLoan() )
         info += "Due date is : " + dueDate;
      else
         info += "The book is not on loan.";
      if ( timesLoaned == 0 )
         info += "The book is never loaned.";
      else
         info += "The book is loaned " + timesLoaned + " times.";
      return info;
   }
   
   /**
    * Method alter the information related with dueDate considering the book status. 
    */
   public void loanBook( String dueDate )
   {
      if ( onLoan() )
      {
         System.out.println( "The book is already loaned." );
      }
      else
      {
         this.dueDate = dueDate;
         timesLoaned++;
      }
   }
   
   /**
    * Method show what will happen to dueDate when book returned.
    */
   public void returnBook()
   {
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
      return !dueDate.equals("");
   }
}