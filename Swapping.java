import java.util.Scanner;
class Swapping{
	public static void main (String args[]){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=scanner.nextInt();

	System.out.println("Enter another number ");
	int num2=scanner.nextInt();

	System.out.println("Before Swapping ");
	
	System.out.println("num = "+num + " num2= "+num2);


	num=num+num2;
	num2=num-num2;
	num=num-num2;


	System.out.println("After Swapping ");
	System.out.println("num = "+num + " num2= "+num2);

		}




}