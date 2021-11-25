/** 
 * A simple Mechanic class!
 * @author Ahmet Faruk Ulutaþ
 * @version 14/04/2020
 */
public class Mechanic {
   
   // properties
   private static int mechanicCounter = 10;
   private String mechanicID;
   private int xCoordinate;
   private int yCoordinate;
   
   // constructors
   public Mechanic() {
      setMechanicID( mechanicCounter);
      mechanicCounter++;
      xCoordinate = 0;
      yCoordinate = 0;
   }
   
   // methods
   
   /*
    * This method get mechanicID 
    * @return robotID
    */
   public String getMechanicID() {
      return mechanicID;
   }
   
   /*
    * This method get xCoordinate 
    * @return xCoordinate
    */
   public int getXCoordinate() {
      return xCoordinate;
   }
   
   /*
    * This method get yCoordinate 
    * @return yCoordinate
    */
   public int getYCoordinate() {
      return yCoordinate;
   }
   
   /*
    * This method set mechanic id 
    * @param mechanic new mechanic id
    */
   private void setMechanicID( int mechanicCounter) {
      mechanicID = "Mechanic" + mechanicCounter;
   }
   
   /*
    * This method set xCoordinate
    * @param xCoordinate Coordinate of x
    */
   public void setXCoordinate( int xCoordinate) {
      this.xCoordinate = xCoordinate;
   }
   
   /*
    * This method set yCoordinate
    * @param yCoordinate Coordinate of y
    */
   public void setYCoordinate( int yCoordinate) {
      this.yCoordinate = yCoordinate;
   }
   
   /*
    * This method teleport the specified point using the set methods
    * @param xCoordinate New coordinate of x
    * @param yCoordinate New coordinate of y
    */
   public void teleportation( int xCoordinate, int yCoordinate) {
      if ( xCoordinate <= 5 && xCoordinate >= -5 && yCoordinate <= 5 && yCoordinate >= -5 ) {
         this.setXCoordinate( xCoordinate);
         this.setYCoordinate( yCoordinate);
      }
   }
   
   /*
    * This method teleport mechanic to the calling position, fix the caller and teleport base
    * @param robot Robot to be repaired
    */
   public void fixRobot( ScoutRobot robot) {
      if ( robot.getCondition() ) {
         this.teleportation( robot.getXCoordinate(), robot.getYCoordinate() );
         System.out.println( "A mechanic has been summoned." );
         robot.setBatteryLeft( robot.getMaxBattery() );
         robot.setCondition( false);
         System.out.print( "The Robot has been fixed. I have returned to the base.");
         robot.toString();
         this.teleportation( 0, 0);
      }
   }
   
   /*
    * This method write the informations about the mechanic
    * @return robotID, xCoordinate, yCoordinate, direction, batteryLeft Which are robot's informations
    */
   public String toString() {
      return "Mechanic{mechanicID='" + mechanicID + "', xCoordinate=" + xCoordinate + ", yCoordinate=" 
         + yCoordinate + "}";  
   }
   
}