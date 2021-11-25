import java.util.Scanner;
import java.util.ArrayList;

/**
 * Site Application Menu class
 * @author Ahmet Faruk Ulutaþ
 * @version 12/05/2020
 */ 
public class SiteApplication {
   public static void main( String[] args) {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int choice, residents, charge;
      double min, max;
      String siteName, name, address;
      Site site;
      ArrayList<House> arrayHouse;
      
      // program code
      System.out.print( "Enter name of site:");
      siteName = scan.nextLine();
      
      site = new Site( siteName);
      
      do {
         System.out.print( "1-Add House\n2-View Houses\n3-Search Houses by Fee\n4-Exit\nEnter choice: ");
         choice = scan.nextInt();
         scan.nextLine();
         
         if ( choice == 1 ) {
            System.out.print( "Enter Owner Name: ");
            name = scan.nextLine();
            System.out.print( "Enter Address: ");
            address = scan.nextLine();
            System.out.print( "Enter number of residents: ");
            residents = scan.nextInt();
            System.out.print( "Enter service charge: ");
            charge = scan.nextInt();
            
            if ( site.addHouse( name, address, residents, charge) ) {
               System.out.println( "House Successfully added to Site");
            }
         }
         else if ( choice == 2 ) {
            System.out.print( "List of Houses in " + siteName + "\n------------------------\n\n");
            for ( House h : site.getHouseList() ) {
               if ( h != null ) {
                  System.out.println( h.toString() );
               }
            }
            
            System.out.println( "Total Residents on Site: " + site.getResidents() );
         }
         else if ( choice == 3 ) {
            System.out.print( "Enter minimum and maximum fee: ");
            min = scan.nextDouble();
            max = scan.nextDouble();
            
            System.out.println( "Houses on Site with fee between " + min + " and " + max + " TL:");
            arrayHouse = new ArrayList<House>( site.searchHouseByFee( min, max));
            for ( House h : arrayHouse ) {
               System.out.println( h.toString() );
            }
            System.out.println();
         }
         else if ( choice == 4 ) {}
         else {
            System.out.println( "Invalid Choice");
         }
      } while ( choice != 4 );
      
      System.out.println( "--- End of Lab10b ---");
   }
   
}