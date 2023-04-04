import javax.swing.*;

class SwingDemo{

	SwingDemo(){
	//Create A NEw Frame
	JFrame frame= new JFrame("This is a Simple Swing Application");

	// Giving initial size to Frame
	frame.setSize(275,100);

	// Terminate the Window when click on close button
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// Creating text based label
	JLabel label= new JLabel("Swing means Powerful GUIs");

	// Adding the label to the content pane
	frame.add(label);
	
	// Displaying the Frame;
	frame.setVisible(true);
}


	public static void main (String ar[]){
	// create the feame on the event dipatching thread

	SwingUtilities.invokeLater(new Runnable() {
	public void run() {
	new SwingDemo();}});

 					




	

			}



}