/** 
 * A simple ScoutRobot class!
 * @author Ahmet Faruk Uluta�
 * @version 13/04/2020
 */
public class ScoutRobot {
   
   // properties
   private static final int VELOCITY = 2;
   private static final int CONSUMED_ENERGY_PER_UNIT = 5;
   private static int scoutCounter = 100;
   private String robotID;
   private int xCoordinate;
   private int yCoordinate;
   private int direction;
   private double maxBattery;
   private double batteryLeft;
   private boolean condition;

   // constructors
   public ScoutRobot( int xCoordinate, int yCoordinate, int maxBattery ) {
      setRobotID( scoutCounter);
      scoutCounter++;
      this.setXCoordinate( xCoordinate);
      this.setYCoordinate( yCoordinate);
      direction = 0;
      this.setMaxBattery( maxBattery);
      batteryLeft = maxBattery;
      condition = false;
   }
   
   // methods
   
   /*
    * This method get robotID 
    * @return robotID
    */
   public String getRobotID() {
      return robotID;
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
    * This method get direction 
    * @return direction
    */
   public int getDirection() {
      return direction;
   }
   
   /*
    * This method get maxBattery 
    * @return maxBattery
    */
   public double getMaxBattery() {
      return maxBattery;
   }
   
   /*
    * This method get batteryLeft 
    * @return batteryLeft
    */
   public double getBatteryLeft() {
      return batteryLeft;
   }
   
   /*
    * This method get condition 
    * @return condition
    */
   public boolean getCondition() {
      return condition;  
   }
   
   /*
    * This method set robot id 
    * @param robotID new robot id
    */
   private void setRobotID( int scoutCounter) {
      robotID = "Scout-" + scoutCounter;
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
    * This method set direction 
    * @param direction New Direction
    */
   public void setDirection( int direction) {
      this.direction = direction;
   }
   
   /*
    * This method set maxBattery 
    * @param maxBattery New Max Battery
    */
   public void setMaxBattery( double maxBattery) {
      this.maxBattery = maxBattery;
   }
   
   /*
    * This method set batteryLeft 
    * @param batteryLeft New Left Battery
    */
   public void setBatteryLeft( double batteryLeft) {
      this.batteryLeft = batteryLeft;
   }
   
   /*
    * This method set condition 
    * @param condition New condition
    */
   public void setCondition( boolean condition) {
      this.condition = condition;
   }
   
   /*
    * This method check whether robot can go to the point or not
    * @param xCoordinate Coordinate of x
    * @param yCoordinate Coordinate of y
    * @return true or false
    */
   public boolean goToLocation( int xCoordinate, int yCoordinate) {
      double tempBattery;
      
      tempBattery = this.getBatteryLeft();
      
      if ( xCoordinate + this.getXCoordinate() <= 5 && xCoordinate + this.getXCoordinate() >= -5 && yCoordinate 
             + this.getYCoordinate() <= 5 && yCoordinate + this.getYCoordinate() >= -5 && batteryLeft >= 5 ) {
         if ( batteryLeft >= (Math.abs( this.getXCoordinate() - xCoordinate) + 
                              Math.abs( this.getYCoordinate() - yCoordinate)) * CONSUMED_ENERGY_PER_UNIT ) {
            System.out.println( "Starting from (" + this.getXCoordinate() + ", " + this.getYCoordinate() + ")");
            
            if ( xCoordinate != 0 ) {
               
               if ( this.getXCoordinate() != xCoordinate ) {
                  if ( this.getYCoordinate() == 0 && this.getXCoordinate() != 0 ) {
                     this.setDirection( 0);
                     this.setYCoordinate( this.getYCoordinate() + 1);
                     System.out.println( "1 unit(s) on Direction " + this.getDirection() + " --> (" + 
                                        this.getXCoordinate() + ", 1)" );
                     this.setBatteryLeft( this.getBatteryLeft() - CONSUMED_ENERGY_PER_UNIT);
                  }
                  
                  if ( xCoordinate > this.getXCoordinate() ) {
                     this.setDirection( 1);
                  }
                  else {
                     this.setDirection( 3);
                  }
                  
                  System.out.println( Math.abs( this.getXCoordinate() - xCoordinate) + " unit(s) on Direction " + 
                                     this.getDirection() + " --> (" + xCoordinate + ", " + this.getYCoordinate() +
                                     ")" );
                  this.setBatteryLeft( this.getBatteryLeft() - (CONSUMED_ENERGY_PER_UNIT * 
                                                                Math.abs( this.getXCoordinate() - xCoordinate)) );
                  this.setXCoordinate( xCoordinate);
               }
               
               if ( this.getYCoordinate() != yCoordinate) {
                  
                  if ( this.getXCoordinate() == 0  && this.getYCoordinate() != 0 ) {
                     this.setDirection( 1);
                     this.setXCoordinate( this.getXCoordinate() + 1);
                     System.out.println( "1 unit(s) on Direction " + this.getDirection() + " --> (1, " + yCoordinate
                                           + ")" );
                     this.setBatteryLeft( this.getBatteryLeft() - CONSUMED_ENERGY_PER_UNIT);
                  }
                  
                  if ( yCoordinate > this.getYCoordinate() ) {
                     this.setDirection( 0);
                  }
                  else {
                     this.setDirection( 2);
                  }
                  
                  System.out.println( Math.abs( this.getYCoordinate() - yCoordinate) + " unit(s) on Direction " + 
                                     this.getDirection() + " --> (" + xCoordinate + ", " + yCoordinate + ")" );
                  this.setBatteryLeft( this.getBatteryLeft() - (CONSUMED_ENERGY_PER_UNIT * 
                                                                Math.abs( this.getYCoordinate() - yCoordinate) ) );
                  this.setYCoordinate( yCoordinate);
               }
            }
            else {
               if ( this.getYCoordinate() != yCoordinate) {
                  
                  if ( this.getXCoordinate() == 0  && this.getYCoordinate() != 0 ) {
                     this.setDirection( 1);
                     this.setXCoordinate( this.getXCoordinate() + 1);
                     System.out.println( "1 unit(s) on Direction " + this.getDirection() + " --> (1, " + 
                                        this.getYCoordinate() + ")" );
                     this.setBatteryLeft( this.getBatteryLeft() - CONSUMED_ENERGY_PER_UNIT);
                  }
                  
                  if ( yCoordinate > this.getYCoordinate() ) {
                     this.setDirection( 0);
                  }
                  else {
                     this.setDirection( 2);
                  }
                  
                  System.out.println( Math.abs( this.getYCoordinate() - yCoordinate) + " unit(s) on Direction " + 
                                     this.getDirection() + " --> (" + this.getXCoordinate() + ", " + yCoordinate + ")" );
                  this.setBatteryLeft( this.getBatteryLeft() - (CONSUMED_ENERGY_PER_UNIT * 
                                                                Math.abs( this.getYCoordinate() - yCoordinate) ) );
                  this.setYCoordinate( yCoordinate);
               }
               
               if ( this.getXCoordinate() != xCoordinate ) {
                  if ( this.getYCoordinate() == 0 && this.getXCoordinate() != 0 ) {
                     this.setDirection( 0);
                     this.setYCoordinate( this.getYCoordinate() + 1);
                     System.out.println( "1 unit(s) on Direction " + this.getDirection() + " --> (" + 
                                        this.getXCoordinate() + ", 1)" );
                     this.setBatteryLeft( this.getBatteryLeft() - CONSUMED_ENERGY_PER_UNIT);
                  }
                  
                  if ( xCoordinate > this.getXCoordinate() ) {
                     this.setDirection( 1);
                  }
                  else {
                     this.setDirection( 3);
                  }
                  
                  System.out.println( Math.abs( this.getXCoordinate() - xCoordinate) + " unit(s) on Direction " + 
                                     this.getDirection() + " --> (" + xCoordinate + ", " + this.getYCoordinate() +
                                     ")" );
                  this.setBatteryLeft( this.getBatteryLeft() - (CONSUMED_ENERGY_PER_UNIT * 
                                                                Math.abs( this.getXCoordinate() - xCoordinate)) );
                  this.setXCoordinate( xCoordinate);
               }
            }
            
            System.out.println( "This move took " + ( tempBattery - this.getBatteryLeft() ) / 10.0 + 
                               " time unit(s). The battery left is " + this.getBatteryLeft() + "/" + 
                               getMaxBattery() );
            return true;
         }
         else {
            System.out.println( "There is no enough battery.");
            this.setCondition( true);
            return false;
         }
      }
      else {
         return false;
      }
   }
   
   /*
    * This method calls the mechanic and fix the robot
    * @param mechanic Mechanic
    */
   public void callMechanic( Mechanic mechanic) {
      if ( condition ) {
         mechanic.fixRobot( this);
      }
   }
   
   /*
    * This method write the informations about the robot
    * @return robotID, xCoordinate, yCoordinate, direction, batteryLeft Which are robot's informations
    */
   public String toString() {
      return "ScoutRobot{robotID='" + getRobotID() + "', xCoordinate=" + this.getXCoordinate() + 
         ", yCoordinate=" + this.getYCoordinate() + ", direction=" + this.getDirection() + ", batteryLeft=" + 
         this.getBatteryLeft() + "}";
   }

   /*
    * This method compare two robots' distance from bases
    * @param robot Robot
    * @return 1 if target is closer
    * @return -1 if target is further
    * @return 0 if distance is equal
    */
   public int compareRobots( ScoutRobot robot) {
      if ( ( Math.pow( this.xCoordinate, 2) + Math.pow( this.yCoordinate, 2) ) < 
          ( Math.pow( robot.xCoordinate, 2) + Math.pow( robot.yCoordinate, 2) ) ) {
         return 1;
      }
      else if ( ( Math.pow( this.xCoordinate, 2) + Math.pow( this.yCoordinate, 2) ) > 
               ( Math.pow( robot.xCoordinate, 2) + Math.pow( robot.yCoordinate, 2) ) ) {
         return -1;
      }
      else {
         return 0;
      }
   }
   
}
   
   
   
   