/**
 * This program serves a site management program
 * @author Ahmet Faruk Ulutaþ
 * @version 12/05/2020
 */
public class House {
   // properties
   private String ownerName, address;
   private int residents;
   private double serviceChargePerResident;
   
   public House( String ownerName, String address, int residents, double serviceChargePerResident) {
      this.ownerName = ownerName;
      this.address = address;
      this.residents = residents;
      this.serviceChargePerResident = serviceChargePerResident;
   }
   
   /* This method get owner name
    * @return ownerName Owner name
    */
   public String getOwnerName() {
      return ownerName;
   }
   
   /* This method get address
    * @return address Address
    */
   public String getAddress() {
      return address;
   }
   
   /* This method get residents
    * @return residents Residents
    */
   public int getResidents() {
      return residents;
   }
   
   /* This method get serviceChargePerResident
    * @return serviceChargePerResident service charge per resident
    */
   public double getServiceChargePerResident() {
      return serviceChargePerResident;
   }
   
   /* This method set owner name
    * @param ownerName Owner name
    */
   public void setOwnerName( String ownerName) {
      this.ownerName = ownerName;
   }
   
   /* This method set address
    * @param address Address
    */
   public void setAddress( String address) {
      this.address = address;
   }
   
   /* This method set residents
    * @param residents Residents
    */
   public void setResidents( int residents) {
      this.residents = residents;
   }
   
   /* This method set serviceChargePerResident
    * @param serviceChargePerResident service charge per resident
    */
   public void setServiceChargePerResident( double setServiceChargePerResident) {
      this.serviceChargePerResident = setServiceChargePerResident;
   }
   
   /* This method calculate total service fee
    * @return this.serviceChargePerResident * this.residents Which is total service fee
    */
   public double calculateTotalServiceFee() {
      return this.serviceChargePerResident * this.residents;
   }
   
   /* This method display toString representation of objects
    * @return ownerName, address, residents, and monthly fee
    */
   public String toString() {
      return "Owner: " + ownerName + '\n' + address + '\n' + "Residents: " + residents + " Monthly Fee: (" 
         + this.calculateTotalServiceFee() + " TL)\n\n";
   }
   
}