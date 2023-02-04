import java.util.Scanner;
class Quadratic{

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values of a,b,c to Solver the quadratic equation : ");
	
	System.out.println("Enter the Values of a ");
	double a=sc.nextDouble(); 

	System.out.println("Enter the Values of b ");
	double b=sc.nextDouble();

	System.out.println("Enter the Values of c ");
	double c=sc.nextDouble();
	
	double x= (-b+(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a);
	double y= (-b-(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a);


System.out.println("The Values of x are : "+ x+" , " + y);
}
}