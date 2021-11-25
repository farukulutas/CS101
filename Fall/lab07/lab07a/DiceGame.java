/**
 * A simple Dice Game class
 */
public class DiceGame {
  
  // properties
  private Dice dice;
  
  // constructors
  public DiceGame()
  {
    dice = new Dice();
  }
  
  // methods
  /**
    * This method count the dices how many times it has rolled and then return the count.
    * @return count 
    */
  int play() 
  {
    int count;
    count = 1;
    while ( dice.roll() != 12 )
    {
      count++;
    }
    return count;
  }
}