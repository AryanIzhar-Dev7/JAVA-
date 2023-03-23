import java.util.Scanner;

class Area{
	private double length;
	private double width;

	double getLength(){
	return length;

		}
	
	double getWidth(){
	return width;

		}

	void setValues(double length, double width){
	this.length=length;
	this.width=width;
	

			}

	double	area(){
		// calculating the area of rectangle
		double area= length*width;
	
			return area;
			}


}

class EncapsulationDemo{
	public static void main (String arg[]){

	Scanner scanner = new Scanner (System.in);

	System.out.println("Enter the length of the Rectangel : ");
	double length= scanner.nextDouble();

	System.out.println("Enter the width of the Rectangel : ");
	double width= scanner.nextDouble();
		
	Area area = new Area();
		
	// calling the method setValues;
	area.setValues(length,width);

	System.out.println("The Length of the rectangle is : "+ area.getLength() );
	System.out.println("The Width of the rectangle is : "+ area.getWidth() );

	System.out.println("The Length of the rectangle is : "+ area.area() );
		}




}