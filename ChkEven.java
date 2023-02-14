import java.util.Scanner;

class CheckEven{
// Create Method for Checking Even number;
boolean isEven(int x){
if (x%2==0) return true;

else return false; 	}
	}

class ChkEven{
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);	
	CheckEven chk= new CheckEven();

	System.out.println("Please Enter a Number to check it is even : ");
	int input= sc.nextInt();

	if (chk.isEven(input)){
		System.out.println(input+ " The Entered Number is Even ");}
	else 
	System.out.println(input+ " The Entered Number is not Even");
	}
}