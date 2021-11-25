import java.util.ArrayList;

/**
 * Simple Site class!
 * @author Ahmet Faruk Ulutaþ
 * @version 12/05/2020
 */
public class Site {
   // properties
   private final int MAX_HOUSES = 10;
   private House[] houseList;
   private int houseCount, residents;
   private String siteName;
   
   // constructors
   public Site( String siteName) {
      this.siteName = siteName;
      houseList = new House[ MAX_HOUSES];
   }
   
   // methods
   
      /* This method get house List
    * @return houseList house List
    */
   public House[] getHouseList() {
      return houseList;
   }
   
      /* This method get residents
    * @return residents residents
    */
   public int getResidents() {
      return residents;
   }
   
   /* This method return true if add a new house to houseList if it is not full else return false
    * @param ownerName Owner name
    * @param address Address
    * @param residents Residents
    * @param serviceFeePerPerson service fee per person
    * @return true if added else return false
    */
   public boolean addHouse( String ownerName, String address, int residents, int serviceFeePerPerson) {
      House house;
      
      house = new House( ownerName, address, residents, serviceFeePerPerson);
      
      for ( int i = 0; i < houseList.length; i++ ) {
         if ( houseList[ i] == null ) {
            houseList[ i] = house;
            updateTotalResidents();     
            return true;
         }
      }
      
      return false;
   }
   
   /* This method calculates the total residents in the Site and update it
    */
   public void updateTotalResidents() {
      int count;
      
      count = 0;
      
      for ( int i = 0; i < houseList.length; i++ ) {
         if ( houseList[ i] != null ) {
            count = count + houseList[ i].getResidents();
         }
      }
      
      residents = count;
   }
   
   /* This method display the houses in the house list by using toString method
    */
   public void viewHouses() {
      for ( House h : houseList) {
         System.out.println( h.toString() );
      }
   }
   
   /* This method create an array list by adding the fee value whose btw min and max given as parameter
    * @param min Minimum fee
    * @param max Maximum fee
    * @return houseArray Array list of houses who has specified fees
    */
   public ArrayList searchHouseByFee( double min, double max) {
      ArrayList<House> houseArray;
      
      houseArray = new ArrayList<House>();
      
      for ( House h : houseList ) {
         if ( h != null && h.calculateTotalServiceFee() > min && h.calculateTotalServiceFee() < max ) {
            houseArray.add( h);
         }
      }
      
      return houseArray;
   }
   
}