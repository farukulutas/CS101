/**
 * A simple LibraryBook Class!
 * @author Ahmet Faruk Ulutaþ
 * @version 28/04/2020
 */ 
public class LibraryBook
{
   // properties
   private String title, author, dueDate;
   private int timesLoaned;
   
   // constructors
   public LibraryBook( String author, String title ) {
      this.author = author;
      this.title = title;
      dueDate = "";
      timesLoaned = 0;
   }
   
   public LibraryBook( LibraryBook book ) {
      this.author = book.author;
      this.title = book.title;
      this.dueDate = book.dueDate;
      this.timesLoaned = book.timesLoaned;
   }
   
   // methods
   
   /*
    * This method get author 
    * @return author
    */
   public String getAuthor() {
      return this.author;
   }
   
   /*
    * This method get title 
    * @return title
    */
   public String getTitle() {
      return this.title;
   }
   
   /*
    * This method get dueDate 
    * @return dueDate
    */
   public String getDueDate() {
      return this.dueDate;
   }
   
   /*
    * This method get timesLoaned 
    * @return timesLoaned
    */
   public int getTimesLoaned() {
      return this.timesLoaned;
   }
   
   /*
    * This method set author
    * @param author New author name
    */
   public void setAuthor( String author) {
      this.author = author;
   }
   
   /*
    * This method set title
    * @param title New title
    */
   public void setTitle( String title) {
      this.title = title;
   }
   
   /*
    * This method set due Date
    * @param dueDate New due Date
    */
   public void setDueDate( String dueDate) {
      this.dueDate = dueDate;
   }
   
   /*
    * This method set times Loaned 
    * @param timesLoaned New times Loaned
    */
   public void setTimesLoaned( int timesLoaned) {
      this.timesLoaned = timesLoaned;
   }
   
   /*
    * This method loan the book with specified due date and increment times loaned
    * @param dueDate New duedDate
    */
   public void loanTheBook( String dueDate) {
      if ( this.onLoan() ) {
         System.out.println( "The book has already loaned." );
      }
      else {
         this.dueDate = dueDate;
         timesLoaned++;
      }
   }
   
   /*
    * This method return the book and set the due date as an empty string
    */
   public void bookReturned() {
      if ( this.dueDate == "" ) {
         System.out.println( "The book has already returned." );
      }
      else {
         this.dueDate = "";
      }
   }
   
   /*
    * This method checks whether the book is loaned or not
    * return false if not loaned else true
    */
   public boolean onLoan() {
      if ( dueDate.equals("") ) {
         return false;
      }
      else {
         return true;
      }
   }
   
   /*
    * This method is set the toString representation
    * return author, title, dueDate, timesLoaned Book properties
    */
   public String toString() {
      return "{Title: " + title + ",Author: " + author + ", Due Date: " + dueDate + ", Times Loaned: " 
         + timesLoaned + "}";
   }
   
   /*
    * This method compare two book objects whether they are equal or not
    * return true if the books are equal else false
    */
   public boolean equalsOne( LibraryBook book) {
      if ( this.title.equals( book.getTitle() ) && this.author.equals( book.getAuthor() ) ) {
         return true;
      }
      else {
         return false;
      }
   }
   
   /*
    * This method compare two book objects whether their titles are equal or not
    * return true if the books' titles are equal else false
    */
   public boolean hasSameTitle( LibraryBook book ) {
      if ( this.title.equals( book.getTitle() ) ) {
         return true;
      }
      else {
         return false;
      }
   }
   
   /*
    * This method compare two book objects whether their author are equal or not
    * return true if the books' author are equal else false
    */
   public boolean hasSameAuthor( LibraryBook book) {
      if ( this.author.equals( book.getAuthor() ) ) {
         return true;
      }
      else {
         return false;
      }
   }
   
}