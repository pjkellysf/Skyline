//********************************************************************
//  Skyline.java       Authors: Clifford/Kelly
//
//  Draws the Skyline frame and adds the Skyline Panel object
//********************************************************************

import javax.swing.JFrame;

class Skyline
{
 	 public static void main(String[] args)
 	 {
         JFrame frame = new JFrame ("Skyline");
         frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().add(new SkylinePanel());
         frame.pack();
         frame.setVisible(true);
 	 }
}
