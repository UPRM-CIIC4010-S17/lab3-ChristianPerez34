import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
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
                        
 
                        //Paint the background
                        g.setColor(Color.GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
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
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Draw another line
//                        g2.setColor(Color.GREEN);
//                        g2.drawLine(x1, getHeight(), getWidth(), 0);
                        
                        //Draw oval
                        g.setColor(Color.ORANGE);
                        g.fillOval(x2/2 - 25, y2/2 - 25, 55, 55);
                      
            }
}