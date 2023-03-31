

class Laptop{ // Creating the Class Laptop which will contain basic functionality of the laptop
    String processor;
    String screen;
    int width;
    int height;

    // Constructor for Laptop
    Laptop(){
        processor = "";
        screen = "";
        width =-1;
        height =-1;
    }

}
// Creating the   class ManufactureredLaptop which will Inherit all the properties of Laptop Class
class ManufacturedLaptop extends Laptop{
    String name;

    //Constructor with parameters
     ManufacturedLaptop(String name, String processor, String screen, int width, int height) {
        this.name = name;
        this.processor = processor;
        this.screen = screen;
        this.width = width;
        this.height = height;
    }
    // Default Constructor
    ManufacturedLaptop(){
         this.name = "";
    }

    // Method to Diplay the details of the class
    void display(){
         System.out.println("Company Name: " + name);
         System.out.println("Processor "+processor);
         System.out.println("Screen: " + screen);
         System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}
public class DemoLaptopInheritance {
    public static void main (String[] args){
    // Creating news Objects with properties;
        ManufacturedLaptop dell= new ManufacturedLaptop("Dell","i5","LCD",10,6);
        ManufacturedLaptop hp= new ManufacturedLaptop("HP","i7","TouchScreen",11,7);

        // Dispayig the details of the different device
        dell.display();
        hp.display();
    }
}
