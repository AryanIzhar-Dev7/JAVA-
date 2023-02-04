import java.util.Scanner;

class Distance{
		public static void main(String agrs[]){
		Scanner sc= new Scanner (System.in);
	
		

		System.out.println("Enter the value of x_1");
		double x_1=sc.nextDouble();


		System.out.println("Enter the value of y_1");
		double y_1=sc.nextDouble();


		System.out.println("Enter the value of x_2");
		double x_2=sc.nextDouble();
		
	
		System.out.println("Enter the value of y_2");
		double y_2=sc.nextDouble();

		double distance=Math.sqrt(Math.pow((x_2-x_1),2) + Math.pow((y_2-y_1),2) );

		System.out.println("The Actual Distance Between Points is : " + distance);
		System.out.println("The Round off Distance between Points is : "+ Math.round(distance));



	}


}