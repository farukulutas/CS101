/**
 * Simple Dice Class 
 * @author Ahmet Faruk Ulutaþ
 * @version 12/12/2019
 */ 

public class Dice
{  
   // properties
   private Die die1, die2;
   
   // constructors
   public Dice()
   {
      die1 = new Die();
      die2 = new Die();
   }
   // methods
   
   /**
    * This method gather the rolls and then return the faceValue.
    * @return faceValue 
    */
   public int roll()
   {
      return die1.roll() + die2.roll();
   }
   
   /**
    * This method get the faceValue and then return the first die.
    * @return Die1.getFaceValue 
    */
   public int getDie1FaceValue()
   {
      return die1.getFaceValue();
   }
   
   /**
    * This method get the faceValue and then return the second die.
    * @return Die2.getFaceValue 
    */
   public int getDie2FaceValue()
   {
      return die2.getFaceValue();
   }
   
   /**
    * This method gather the faceValue of die1 and die2.
    * @return sum
    */
   public int getDiceTotal()
   {
      return die1.getFaceValue() + die2.getFaceValue();
   }
   
   /**
    * This method convert the faceValues toString from int
    * @return convert
    */
   public String toString()
   {
      return "First value is: " + getDie1FaceValue() + "Second value is: " + getDie2FaceValue();
   }
}

