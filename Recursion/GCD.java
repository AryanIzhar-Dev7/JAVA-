import java.util.Scanner;


class GCD {
	static int getgcd(int a , int b){
	if(b==0){
	return a;		}// end of if


	else {
	
	return getgcd(b,a%b);

		}// end of else
		}// end of method


	public static void main (String ar[]){
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Enter a number : ");
	int num= scanner.nextInt();

	System.out.println("Enter another number : ");
	int num1= scanner.nextInt();	

	System.out.println("The GCD of "+num+" and "+num1 + " is "+getgcd(num,num1));

		}



}