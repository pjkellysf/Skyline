//********************************************************************
//  SkylinePanel.java       Authors: Clifford/Kelly
//
//  Demonstrates the use of graphical objects.
//********************************************************************

import javax.swing.*;
import java.awt.*;

public class SkylinePanel extends JPanel
{
    private Building building1, building2, building3, building4, building5;

   //-----------------------------------------------------------------
   //  Constructor: Creates five Building objects.
   //-----------------------------------------------------------------
   public SkylinePanel()

   {
       building1 = new Building(15, 100, 80, 200, Color.orange, 2, 7, 25, Color.white);
       building2 = new Building(110, 50, 100, 250, Color.blue, 4, 11, 20, Color.yellow);
       building3 = new Building(230, 150, 150, 150, Color.red, 6, 6, 20, Color.orange);
       building4 = new Building(400, 25, 100, 275, Color.yellow, 4, 12, 20, Color.green);
       building5 = new Building(520, 70, 60, 230, Color.white, 2, 10, 20, Color.black);

       setPreferredSize (new Dimension(600, 300));
       setBackground (Color.black);
   }

   //-----------------------------------------------------------------
   //  Draws this panel by requesting that each buiding draw itself.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics g)
   {
      super.paintComponent(g);

       building1.draw(g);
       building2.draw(g);
       building3.draw(g);
       building4.draw(g);
       building5.draw(g);
       
       //Add names
       g.setColor (Color.white);
       g.drawString("Paul Clifford and Patrick Kelly Ville", 175, 25);
       
       //Draw Moon
       g.setColor (Color.white);
       g.fillOval (300, 65, 50, 50);  // white moon
       g.setColor (Color.black);
       g.fillOval (320, 60, 50, 50);  // offset moon
   }
}
