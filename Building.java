//********************************************************************
//  Building.java       Authors: Clifford/Kelly
//
//  Describes how to construct a building with windows
//********************************************************************

import java.awt.*;

public class Building
{
   private int xval, yval, bwidth, bheight, rows, cols, spacer;
   private Color buildingColor, windowColor;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this building with the specified values.
   //-----------------------------------------------------------------
   public Building(int x, int y, int width, int height, Color c, int r, int z, int s, Color d)
   {
       xval = x;
       yval = y;
       bwidth = width;
       bheight = height;
       buildingColor = c;
       rows = r;
       cols = z;
       spacer = s;
       windowColor = d;
   }

// Draw the building

   public void draw (Graphics g)
   {
      //Draw Building
       g.setColor (buildingColor);
       g.fillRect (xval, yval, bwidth, bheight);

       //Draw Windows
       for (int j = 0; j < cols; j++) {
           for (int i = 0; i < rows; i++) {
                g.setColor (windowColor);
                g.fillRect ((xval + (i*spacer)) + spacer, yval + (j*spacer) + spacer, bwidth/spacer, bheight/spacer);
           }
       }
   }
}