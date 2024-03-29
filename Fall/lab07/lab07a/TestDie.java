/**
 * Program test the die class, roll 2 dies and show the face values of them.
 * @author Ahmet Faruk Uluta�
 * @version 28/11/2019
 */ 
public class TestDie
{
   public static void main( String[] args)
   {
      
      // variables
      Die die1, die2;
      
      // program code
      
      // initialize the variables
      die1 = new Die();
      die2 = new Die();
      
      // print the roll method
      System.out.println( die1.roll() );
      System.out.println( die2.roll() );
      
      // print the getFaceValue method
      System.out.println( die1.getFaceValue() );
      System.out.println( die2.getFaceValue() );
      
      // print the variables using toString method
      System.out.println( die1.toString() );
      System.out.println( die2.toString() );
   }
}
