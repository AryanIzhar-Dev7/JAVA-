import javax.swing.*;
import java.awt.*;

public class HomePage {


    JLabel label1 , label2, label3;

    JFrame frame;

    JButton morning, evening, information;
    HomePage(){
        frame = new JFrame();
        frame.setBounds(200,200,800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);


        label1= new JLabel("Morning ");
        label1.setLocation(200,200);

        label2= new JLabel("Evening ");
        label2.setLocation(400,200);

        label3= new JLabel("Information ");
        label3.setLocation(600,200);



        morning = new JButton("Morning");
        morning.setBounds(200,450,100,30);

        evening= new JButton("Evening");
        evening.setBounds(400,450,100,30);


        information = new JButton("Information");
        information.setBounds(600,450,100,30);

        // **************addin Componenets
        frame.add(label1);
        frame.add(morning);
        frame.add(label2);
        frame.add(evening);
        frame.add(label3);
        frame.add(information);



    }
}
