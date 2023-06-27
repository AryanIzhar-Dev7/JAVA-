import java.util.Scanner;

class CheckEvenModified{
// Create Method for Checking Even number;
boolean isEven(int x){
if (x%2==0) return true;

else return false; 	}
	}

class ChkEvenMod{
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);	
	CheckEvenModified chk= new CheckEvenModified();

	System.out.println("How many number do you want to check for Even : ");
	int size=sc.nextInt();


	for (int i=0; i<size; i++){
	
	System.out.println("Please Enter a Number to check it is even : ");
	int input= sc.nextInt();

	if (chk.isEven(input)){
		System.out.println(input+ " The Entered Number is Even ");}
	else 
	System.out.println(input+ " The Entered Number is not Even");
	  }// End of For Loop;
}
}