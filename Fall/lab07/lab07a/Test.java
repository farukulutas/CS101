/**
 * This class to testing the methods in other classes.
 * @author Ahmet Faruk Ulutas
 * @version 30/11/2019
 */ 
public class Test
{
   public static void main( String[] args)
   {
      // variables
      Dice test1;
      
      // program code
      
      //initialize the variables
      test1 = new Dice();
      
      //test roll method
      System.out.println( "rolls 1: " + test1.roll() );
      
      //test getDie1FaceValue method
      System.out.println( "face value 1: " + test1.getDie1FaceValue() );
      
      //test getDie2FaceValue method
      System.out.println( "face value 2: " + test1.getDie2FaceValue() );
      
      //test getDiceTotal method
      System.out.println( "dice total 1: " + test1.getDiceTotal() );
      
      //test toString method
      System.out.println( test1.toString() );
   }
}