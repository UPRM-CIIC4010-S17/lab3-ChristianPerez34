import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        
                        //Flag Base
                        g.setColor(Color.RED);
                        g.fillRect(x1 + 10, y1 + 20, getWidth() - 20, getHeight() - 40);
                        
                        Polygon flagStripes = new Polygon();
                        flagStripes.addPoint(x1 + 10, height/3 + 10);
                        flagStripes.addPoint(width - 8, height/3 + 10);
                        flagStripes.addPoint(width - 8, height/4);
                        flagStripes.addPoint(x1 + 10, height/4);
                        flagStripes.addPoint(x1 + 10, height - height/3 - 10);
                        flagStripes.addPoint(width - 5, height - height/3 - 10);
                        flagStripes.addPoint(width - 5, height - height/4);
                        flagStripes.addPoint(x1 + 10, height - height/4);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(flagStripes);
                        
                        
                        Polygon flagTriangle = new Polygon();
                        flagTriangle.addPoint(x1 + 10, y1 + 20);
                        flagTriangle.addPoint(width/2, height/2);
                        flagTriangle.addPoint(x1 + 10, height - 19);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(flagTriangle);
                        
                        Polygon p2 = new Polygon();                    
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                       
                        

                   
 
                        //Paint the background
//                        g.setColor(Color.RED);
//                        g.fillRect(x1, y1, width + 1, height + 1);
                        
//                        //Draw a border 
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw second border
//                        Graphics g2 = g;
//                        g2.setColor(Color.RED);
//                        g2.drawRect(x1 + 3, y1 + 3, width - 6, height - 6);
//                        
//                        //Draw a line
//                        g.setColor(Color.BLUE);
//                        g.drawLine(x1, y1, x2 - 80, y2 - 80);
//                        
                        //Draw another line
//                        g2.setColor(Color.BLUE);
//                        g2.drawLine(x1, getHeight(), getWidth() - 80, 80);
                        
                        //Draw oval
//                        g.setColor(Color.ORANGE);
//                        g.fillOval(x2/2 - 25, y2/2 - 25, 55, 55);
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
//                        Polygon flagTriangle = new Polygon();
//                        flagTriangle.addPoint(x1, y1);
//                        flagTriangle.addPoint(x2 - 80, y2 - 80);
//                        flagTriangle.addPoint(x1, getHeight());
//                        g2.setColor(Color.BLUE);
//                        g2.fillPolygon(flagTriangle);
//                        
                        
                        
            }
}
