import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Christian Perez");
		Dimension centerWindow = Toolkit.getDefaultToolkit().getScreenSize();
		myFrame.setSize(200, 200);
		int width = (int) ((centerWindow.getWidth() - myFrame.getWidth()) / 2);
	        int height = (int) ((centerWindow.getHeight() - myFrame.getHeight()) / 2);
	        myFrame.setLocation(width, height);
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		MyPanelClass myPanel = new MyPanelClass();
                myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}
