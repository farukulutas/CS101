/**
 * A simple robot app class!
 * @author Ahmet Faruk Ulutaþ
 * @version 14/04/2020
 */ 
public class RobotApp
{
   public static void main( String[] args)
   {
      
      // variables
      ScoutRobot robot101, robot102;
      Mechanic mechanic;
      
      // program code
      
      // create two scout robot and a mechanic
      robot101 = new ScoutRobot( 0, 0, 100);
      robot102 = new ScoutRobot( 0, 0, 100);
      mechanic = new Mechanic();
      
      // print to informations about them
      System.out.println( robot101.toString() );
      System.out.println( '\n' + robot102.toString() );
      System.out.println( '\n' + mechanic.toString() + '\n' );
      
      // go to the specified points and print infos about scout100
      System.out.println( "----------------- Scout-100 -----------------");
      robot101.goToLocation( 2, 3);
      System.out.println();
      
      robot101.goToLocation( -2, 0);
      System.out.println();
      
      robot101.goToLocation( 3, 0);
      System.out.println();
      
      robot101.goToLocation( 0, 5);
      System.out.println();
      
      // call mecahnic and recharge
      robot101.callMechanic( mechanic);
      System.out.println();
      
      // print infos
      System.out.println( robot101.toString() );
      System.out.println();
      
      robot101.goToLocation( 0, 5);
      System.out.println();
      
      
      // go to the specified points and print infos about scout101
      System.out.println( "----------------- Scout-101 -----------------");
      robot102.goToLocation( 3, -4);
      System.out.println();
      
      robot102.goToLocation( 0, 3);
      System.out.println();
      
      robot102.goToLocation( 0, -4);
      System.out.println();
      
      // call mecahnic and recharge
      robot102.callMechanic( mechanic);
      System.out.println();
      
      // print infos
      System.out.println( robot102.toString() );
      System.out.println();
      
      robot102.goToLocation( 0, -4);
      System.out.println();
      
      robot102.goToLocation( 1, 2);
      System.out.println();
      
      // compare robots which one is more closer to the base
      System.out.println( "-------------------------------------------");
      if ( robot101.compareRobots( robot102) == -1 ) {
         System.out.println( "Scout-101 is closer to the base than Scout-100");  
      }
      else if ( robot101.compareRobots( robot102) == 1 ) {
         System.out.println( "Scout-100 is closer to the base than Scout-101");
      }
      else {
         System.out.println( "Scout-101 and Scout-100 has same distance to the base");  
      }
   }
   
}