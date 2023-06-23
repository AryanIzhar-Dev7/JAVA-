import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginPage implements ActionListener {

    JPanel pic;
    JFrame frame;
    JButton loginbutton, signupbutton;
    JTextField field;
    JPasswordField passwordfield;
    JLabel picture, email, password,label;


    LoginPage(){

        Font font= new Font("Arial", Font.BOLD, 20);
        ImageIcon icon = new ImageIcon("back.jpg");
        picture = new JLabel(icon);
        picture.setBounds(0,-50,icon.getIconWidth(),icon.getIconHeight());





        label = new JLabel();
        label.setBounds(500,300,300,450);
        label.setBackground(Color.white);



        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,4226,2880);
        frame.setLayout(null);


        email= new JLabel("Username ");
        email.setBounds(250,200,120,40);
        email.setFont(font);

        password = new JLabel("Password");
        password.setBounds(250,250,120,40);
        password.setFont(font);

        field = new JTextField();
        field.setBounds(390,200,120,30);


        passwordfield = new JPasswordField();
        passwordfield.setBounds(390,250,120,30);


        loginbutton= new JButton("Login");
        loginbutton.setBounds(436,290,80,30);

        signupbutton= new JButton("Sin Up");
        signupbutton.setBounds(436,330,80,30);



        // ***************Adding Components to frame




        frame.add(email);
        frame.add(field);
        frame.add(password);
        frame.add(passwordfield);
        frame.add(loginbutton);
        frame.add(signupbutton);
        frame.add(picture);





        loginbutton.addActionListener(this);
        signupbutton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginbutton){
            frame.dispose();
            new HomePage();


        }
    }
}
