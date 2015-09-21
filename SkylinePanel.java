// SkylinePanel.java       Authors: Clifford/Kelly
//
//  Demonstrates the use of graphical objects.
//********************************************************************

import javax.swing.*;
import java.awt.*;

public class SkylinePanel extends JPanel
{
    private Building building1, building2, building3, building4, building5;
    private Stars stars1;
    
    Color cc1 = new Color(102,0,102);
    Color cc2 = new Color(82,10,122);
    Color cc3 = new Color(75,10,102);
    Color cc4 = new Color(50,0,102);
    Color cc5 = new Color(62,10,142);
    
    
    Color cc6 = new Color(0,255,0);
    Color cc7 = new Color(0,205,0);
    Color cc8 = new Color(0,195,0);
    Color cc9 = new Color(0,255,0);
    Color cc10 = new Color(0,255,100);
    

   //-----------------------------------------------------------------
   //  Constructor: Creates five Building objects.
   //-----------------------------------------------------------------
   public SkylinePanel()

   {
       building1 = new Building(15, 300, 80, 200, cc1, 2, 7, 25, cc6);
       building2 = new Building(110, 250, 100, 250, cc2, 4, 11, 20, cc7);
       building3 = new Building(230, 350, 150, 150, cc3, 6, 6, 20, cc8);
       building4 = new Building(400, 225, 100, 275, cc4, 4, 12, 20, cc9);
       building5 = new Building(520, 270, 60, 230, cc5, 2, 10, 20, cc10);
       stars1 = new Stars(0, 0, 15, 15, Color.lightGray, 70, 20, 10);

       setPreferredSize (new Dimension(650, 500));
       setBackground (Color.black);
   }

   //-----------------------------------------------------------------
   //  Draws this panel by requesting that each buiding draw itself.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics g)
   {
      super.paintComponent(g);
      
      
      //Draw Stars
      stars1.drawme(g);
      
    

       building1.draw(g);
       building2.draw(g);
       building3.draw(g);
       building4.draw(g);
       building5.draw(g);

       //Draw Moon
	   g.setColor (Color.white);
	   g.fillOval (50, 35, 50, 50);  // white moon
	   g.setColor (Color.black);
       g.fillOval (70, 30, 50, 50);  // offset moon


       //Add names
       g.setColor (Color.lightGray);
       g.drawString("Paul Clifford and Patrick Kelly Ville", 400, 495);
   }
}
