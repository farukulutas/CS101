/**
 * Simple Hystogram for dice methods.
 * @author Ahmet Faruk Ulutaþ
 * @version 12/12/2019
 */ 

import java.util.ArrayList;

public class TestDiceHys
{
   
   // methods
   
   /**
    * This method roll the dice 1000 times and return the frequencies.
    * @return frequencies 
    */
   public static ArrayList<Integer> frequencies()
   {
      // create and initilliaze the array list
      ArrayList<Integer> frequencies;
      frequencies = new ArrayList<Integer>(12);
      
      // add 0's in the array list
      for ( int a = 0; a < 11; a = a + 1)
      {
         frequencies.add( 0);
      }
      
      // create a dice and initiliaze
      Dice die1;
      die1 = new Dice();
      
      // for loop the roll 1000 times
      for ( int i = 0; i < 1000; i = i + 1)
      {
         int a = die1.roll() - 2;
         int temp = frequencies.get(a);
         temp = temp + 1;
         frequencies.set( a, temp);   
      }
      return frequencies;
   }
   
   // methods
   
   /**
    * This method calculate the maximum frequency and creating the histogram via the infos.
    */
   public static void histogram( ArrayList<Integer> frequencies )
   {
      ArrayList<String> lines = new ArrayList<String>();
      
      // create variable and initillaze
      int maximumFrequency;
      
      maximumFrequency = 0;
      
      // calculate the max value via math.max
      for ( int y : frequencies )
      {
         maximumFrequency = Math.max( maximumFrequency, y);
      }
      
      // calculate the value of one star
      int num = Math.round( maximumFrequency / 10 );
      
      int numberOfStars;
      
      // empty arrays by for loops
      for ( int e = 0; e < 11; e = e + 1)
      {
         lines.add( "" );
      }
      
      // create a histogram by for loops
      for ( int b = 2; b <= 12; b = b + 1 )
      {
         numberOfStars = (int) ( frequencies.get(b-2) / num );
         
         for ( int c = 0; c < 10 - numberOfStars; c = c + 1 )
         {
            lines.set(c, lines.get(c) + "   " );
         }
         
         for ( int d = 10 - numberOfStars; d < 10; d = d + 1 )
         {
            lines.set(d, lines.get(d) + " * " );
         }
      }
      
      // print the histogram via methods
      for ( int y = 0; y < 10; y = y + 1 )
      {
         System.out.print( lines.get(y) );
         
         System.out.println();
      }
   }
   
   public static void main( String[] args)
   {
      histogram( frequencies());
   }
}