import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;
 
public class DrawRecs extends JFrame
{ 
   public void paint(Graphics gr)
   { 
      // Create a new drawing canvas.
      super.paint(gr);
      Graphics2D gr2D = (Graphics2D)gr; 

      // Get the width and height of the canvas.
      int w = getWidth();
      int h = getHeight();
      
      // Set up a pseudo random number generator
      Random r = new Random();

      // ADDED CODE IS BELOW.
      for(int i = 0; i < 500; i++)
      {
         // Generate a random position in the drawing canvas.
         int x = Math.abs(r.nextInt()) % w;
         int y = Math.abs(r.nextInt()) % h;
         // Draw a 10 by 20 rectangle as position (x,y) on the canvas.
         gr2D.draw(new Rectangle2D.Double(x, y, 10, 20));
      }
   } 
     
   public static void main(String[] args)
   {   
      // Set up a new frame that contains a drawing canvas     
      DrawRecs frame = new DrawRecs(); 
      
      // When the user Xs out of the program, stop the program.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Make the frame 500 by 500
      frame.setSize(500, 500); 
      
      // Make the frame visible.
      frame.setVisible(true); 
   } 
}