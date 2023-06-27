import java.util.Scanner;

class IsPrime{
	public static void main (String args[]){
	Scanner scanner= new Scanner(System.in);

	System.out.println("Enter any number to Check for Prime : ");
	int num = scanner.nextInt();
	
	boolean isPrime= true; 
	
	for (int i=2; i<num; i++){

		if (num % i == 0){

		 isPrime=false;
			break;		}

			}// end of loop
	if (num==1)
	System.out.println("The Number "+ num + " is neither prime nor composite ");		

	else if (isPrime){
	System.out.println("The Number "+ num + " is Prime ");
			}	
	else
	
	System.out.println("The Number "+ num + " is not  Prime. It is Composite Number ");


		}

	

}