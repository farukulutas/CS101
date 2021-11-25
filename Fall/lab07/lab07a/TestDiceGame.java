/**
 * Simple DiceGame program roll the dices until two sixes thrown and show how many times roled.
 * @author Ahmet Faruk Ulutaþ
 * @version 28/11/2019
 */ 
public class TestDiceGame
{
   public static void main( String[] args)
   {
      // variables
      DiceGame diceGame;
      
      // program code

      //initilaze variable
      diceGame = new DiceGame();
      
      //print the dicegame.play
      System.out.println( "How many times turned is: " + diceGame.play() );
   }
}
