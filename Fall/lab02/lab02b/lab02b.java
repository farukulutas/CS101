/**
 * an applet
 * @author Ahmet Faruk Ulutaþ
 * @version 17.10.2019
 */ 
import java.awt.Graphics;
import java.applet.Applet;

public class lab02b extends Applet 
{
    
   public void paint( Graphics g)
   {
      g.drawString( "Hello...", 50, 50);
      g.drawRect( 25, 25, 100, 50);
   }
    
}