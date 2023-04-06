import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {

    // Creating the Frame
    MyFrame() {
        this.setSize(800, 600);// setting the size of the fream
        this.setLocation(200,400);// setting the location of the frame
        this.setVisible(true);//setting the visibility
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //settings the default close operation
        this.setTitle("JFRAME ");// giving the title of the frame
        this.setResizable(false);// putting restriction on rizebility of the frame
        this.getContentPane().setBackground(new Color(250,225,215));// giving the background of the frame

        // Adding image in icon;
        ImageIcon image = new ImageIcon("anime.jpg"); // creaing the object of imageicon
        this.setIconImage(image.getImage());// setting the imageicon of the frame;



    }

}
public class JFrameDemo {
    public static void main(String[] args){
        MyFrame myFrame = new MyFrame();


    }
}
