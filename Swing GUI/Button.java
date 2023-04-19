import javax.swing.*;
import java.awt.*;

class Button{
	public static void main (String aer[]){
	JFrame frame= new JFrame ();
	frame.setVisible(true);
	frame.setBounds(100,100,1000,500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c= frame.getContentPane();
	c.setLayout(null);

	// Creating Button and Adding picture;
	ImageIcon icon = new ImageIcon("minatoo.png");
	JButton button = new JButton (icon);
	button.setBounds(200,100,icon.getIconWidth(),icon.getIconHeight());
	button.setVisible(true);
	c.add(button);

	// Adding Cursor 
	Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	button.setCursor(cursor);
	

	}
}