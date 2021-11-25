/**
 * Simple Library Book program 
 * @author Ahmet Faruk Ulutaþ
 * @version 28/11/2019
 */ 
public class TestLibraryBook
{
  public static void main( String[] args)
  {
    // program code
    
    // enter datas to books
    LibraryBook book1 = new LibraryBook( "titledeneme", "authordeneme" );
    LibraryBook book2 = new LibraryBook( "kitap", "yazar" );
    LibraryBook book3 = new LibraryBook( "kitap123", "yazar123" );
    
    // add date datas to book
    book2.loanBook( "2/11/2019 " );
    book3.loanBook( "3/03/2020 " );
    
    // to show returnBook method, book3 has delivered back.
    book3.returnBook();
    
    // print getTimesLoaned method
    System.out.println( book2.getTimesLoaned() );
    
    // print out the datas
    System.out.println( book1 );
    System.out.println( book2 );
    System.out.println( book3 );
  }
}
