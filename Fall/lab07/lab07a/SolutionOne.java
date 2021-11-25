/**
 * The program roll the dice until the sixes are thrown. 
 * @author Ahmet Faruk Ulutas
 * @version 28/11/2019
 */ 
public class SolutionOne
{
   public static void main( String[] args)
   {
      // variables
      int rolledTimes, dice1, dice2;
      
      // program code
        
      // calculate dices with math.random and do while method.
      rolledTimes = 0;
      do {
         dice1 = ( (int) ( Math.random() * 6 ) + 1 );
         dice2 = ( (int) ( Math.random() * 6 ) + 1 );
         rolledTimes = rolledTimes + 1;
         System.out.println( "How many times rolled: " + rolledTimes );
      } while ( dice1 != 6 && dice2 != 6 );
   }
}