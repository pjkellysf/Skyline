//********************************************************************
//  Stars.java       Authors: Clifford/Kelly
//
//  Describes how to construct a building with windows
//********************************************************************

import java.awt.*;

public class Stars
{
   private int xval, yval, rows, cols, spacer, bwidth, bheight;
   private Color starcolor;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this building with the specified values.
   //-----------------------------------------------------------------
   //stars1 = new Stars(0, 0, 10, 10, Color.white, 10, 10, 10);
   public Stars(int x, int y, int width, int height, Color c, int r, int z, int s)
   {
       xval = x;
       yval = y;
       bwidth = width;
       bheight = height;
       starcolor = c;
       rows = r;
       cols = z;
       spacer = s;
    }
   public void drawme (Graphics g)
   {
       //Draw Stars
       for (int j = 0; j < cols+50; j++) {
           for (int i = 0; i < rows; i++) {
               int rint = (int)(Math.random()*(j+3));
			   if (rint == 0) {
                   g.setColor (starcolor);
                   g.fillRect ((xval + (i*spacer))+spacer, yval + (j*spacer)+spacer, bwidth/spacer, bheight/spacer);
				}

           }
       }
   }
}