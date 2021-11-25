/**
 * Simple Die Class 
 * @author Ahmet Faruk Ulutaþ
 * @version 12/12/2019
 */ 

public class Die 
{
   // properties
   private int faceValue;
   
   // constructors
   public Die()
   {
      faceValue = 0;
   }
   
   // methods
   
   /**
    * This method rolls the dices and gives numbers and then return the faceValue.
    * @return faceValue 
    */
   public int roll()
   {
      faceValue = ( (int) ( Math.random() * 6 ) + 1 );
      return faceValue;
   }
   
   /**
    * This method get the face value and then return the faceValue.
    * @return faceValue 
    */
   public int getFaceValue()
   {
      return faceValue;
   }
   
   /**
    * This method convert the value string from integer and then return the faceValue.
    * @return faceValue 
    */
   public String toString()
   {
      return "Value is: " + faceValue;
   }
}