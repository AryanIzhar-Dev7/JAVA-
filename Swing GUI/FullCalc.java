import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class  Calculator  implements ActionListener{
	
	JFrame frame;
	JButton plus,minus,mult,divide;
	JTextField field1,field2, field3;
	


	Calculator(){


	frame = new JFrame();
	frame.setBounds(100,200,600,600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setVisible(true);


	// Buttons and Fields

	field1= new JTextField();
	field2= new JTextField();
	field3= new JTextField();

	plus = new JButton("+");
	minus= new JButton("-");
	mult= new JButton("*");
	divide= new JButton("/");
			

	// Setting Bounds of Buttons and Fields

	field1.setBounds (200,50,60,30);
	field2.setBounds(290,50,60,30);

	plus.setBounds(200,150,60,30);
	mult.setBounds(320, 150,60,30);
	minus.setBounds(200,200,60,30);
	divide.setBounds(320,200,60,30);

	field3.setBounds(270,350,60,30);



	// Adding to frame;

	frame.add(field1);
	frame.add(field2);
	frame.add(plus);
	frame.add(mult);
	frame.add(minus);
	frame.add(divide);
	frame.add(field3);


	// Action listerner to buttons


	plus.addActionListener(this);
	mult.addActionListener(this);
	minus.addActionListener(this);
	divide.addActionListener(this);
	

	} // constructor 



	public void actionPerformed(ActionEvent e){
	
	if (e.getSource() == plus){

		int a= Integer.parseInt(field1.getText());
		int b= Integer.parseInt(field2.getText());

		String c= Integer.toString(a+b);
		field3.setText(c);
			}

	
	

	else if (e.getSource()==minus){

		int a= Integer.parseInt(field1.getText());
		int b= Integer.parseInt(field2.getText());

		String c= Integer.toString(a-b);
		field3.setText(c);
			}



	else if (e.getSource() == mult){

		int a= Integer.parseInt(field1.getText());
		int b= Integer.parseInt(field2.getText());

		String c= Integer.toString(a*b);
		field3.setText(c);
			}

	else if (e.getSource() == divide){

		double a= Integer.parseInt(field1.getText());
		double b= Integer.parseInt(field2.getText());
		double x= a/b;

		String c= Double.toString(x);
		field3.setText(c);
			}
	}

} // end of calc class

class FullCalc{
	public static void main(String ar[]){

	Calculator calc= new Calculator();

		}


}