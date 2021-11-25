import java.util.Scanner;

/**
 * Test class for Library class!
 * @Author Ahmet Faruk Ulutaþ
 * @Date 05.12.2019
 */

public class LibraryTest
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int options, findOptions;
      LibraryBook b1;
      String title, author;
      Library library;
      
      // program code
      
      // initialize the library.
      library = new Library();
      
      // print welcome msg.
      System.out.println( "Welcome to the library!");
      
      // create menu includes show, find, add, exit options by using the do while method
      
      do
      {
         System.out.println( "--------------");
         System.out.println( "Use the numbers to select the options.");
         System.out.println( "1. Show");
         System.out.println( "2. Find");
         System.out.println( "3. Add");
         System.out.println( "4. Exit");
         System.out.println( "--------------");
         
         options = scan.nextInt();
         
         if( options == 1)
         {
            System.out.println( library.toString());
         }
         else if( options == 2)
         {
            if( library.isEmpty())
            { 
               System.out.println( "Library is empty!");
            }
            else
            {
               System.out.println( "Enter book title:");
               scan = new Scanner( System.in);
               title = scan.nextLine();
               b1 = library.findByTitle( title);
               System.out.println( b1);
               
               // also the menu includes sub-options under the heading of find; loan, return, remove, exit.
               do
               {
                  System.out.println( "--------------");
                  System.out.println( "Use the numbers to select the options.");
                  System.out.println( "1. Loan");
                  System.out.println( "2. Return");
                  System.out.println( "3. Remove");
                  System.out.println( "4. Return to the main menu");
                  System.out.println( "--------------");
                  findOptions = scan.nextInt();
                  
                  if( findOptions == 1)
                  {
                     b1.loanTheBook( "23.04.2020");
                  }
                  else if( findOptions == 2)
                  {
                     b1.returnTheBook();
                  }
                  else if( findOptions == 3)
                  {
                     if ( library.remove( b1) )
                        System.out.println( b1 + " is removed!");
                  }
               }   
               
               // if exit under the find option, then return the main menu.
               while( findOptions != 4);
            }
         }
         else if( options == 3)
         {
            System.out.println( "Enter book title:");
            scan = new Scanner( System.in);
            title = scan.nextLine();
            System.out.println( "Enter book author:");
            author = scan.nextLine();
            b1 = library.add( title, author);
         }
      }
      while( options != 4);
      
      // print exit msg.
      System.out.println( "Thanks for using the SimpleLibrary. GoodBye!");
   }
}