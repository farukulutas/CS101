import java.util.Scanner;

/**
 * Auto Generated Java Class.
 */
public class LibraryTest {
   public static void main( String[] args) {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int option, findOption;
      String title, author;
      LibraryBook book;
      Library library;
      
      // program code
      
      // initilase the library
      library = new Library();   
      
      // menu options for the library
      do {
         System.out.print( "1-Show\n2-Find\n3-Add\n4-Exit\nChoose an option: ");
         option = scan.nextInt();
         scan.nextLine();
         
         if ( option == 1 ) {
            System.out.println( library );
         }
         else if ( option == 2 ) {
            if( library.isEmpty() ) { 
               System.out.println( "You cannot find a book while the library is empty!");
            }
            else {
               System.out.print( "Enter a title: " );
               title = scan.nextLine();
               book = library.findByTitle( title );
               
               if ( book != null ) {
                  do {
                     System.out.print( "1-Loan\n2-Return\n3-Remove\n4-Return to Menu\nChoose an option: " );
                     findOption = scan.nextInt();
                     
                     if ( findOption == 1 ) {
                        book.loanTheBook( "01.05.2020");
                     }
                     else if ( findOption == 2 ) {
                        book.bookReturned();
                        System.out.println( "The book with title \"" + title + "\" has been returned to the" 
                                              + "library." );
                     }
                     else if ( findOption == 3 ) {
                        library.remove( book );
                        System.out.println( "The book with title \"" + title + "\" has been removed from the"
                                              + "library." );
                     }
                     
                  } while ( findOption != 4 );
               }
               else {
                  System.out.println( "The book in the title entered was not found!" );
               }
            }
         }
         else if ( option == 3 ) {
            System.out.print( "Enter a title: " );
            title = scan.nextLine();
            System.out.print( "Enter an author: " );
            author = scan.nextLine();
            if ( library.add( author, title) ) {
               System.out.println( "The book with title \"" + title + "\" has been added to the library." );
            }
         } 
         
      } while ( option != 4 );
      
      // print good bye msg
      System.out.print( "\nYine Bekleriz.." );
   }
   
}