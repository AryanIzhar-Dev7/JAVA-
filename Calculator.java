import java.util.Scanner;

class Calculator{
	public static void main (String args []){
	Scanner sc= new Scanner(System.in);
	System.out.println("Which operation do you want to perform : + , - ,* or / ");
	String input=sc.nextLine();
	

	// Code for Addition 
	if (input.charAt(0) =='+'){
	System.out.println("How many numbers do you want to add : ");
	int num=sc.nextInt();
	int arr[]=new int [num];
	
	for(int i=0; i<arr.length; i++){
	System.out.println("Enter your "+ (i+1) + " Number : ");
	arr[i]=sc.nextInt();			}//End of For loop: 
	int sum=0;
	for(int x: arr){
		sum+=x;}
	System.out.println("The Sum of Entered number is : " + sum);
										}// end of if : 	
	//Code for Multiplicatin
	else if (input.charAt(0) =='*'){
	System.out.println("How many numbers do you want to Multiply : ");
	int num1=sc.nextInt();
	int arr[]=new int [num1];
	
	for(int i=0; i<arr.length; i++){
	System.out.println("Enter your "+ (i+1) + " Number : ");
	arr[i]=sc.nextInt();			}//End of For loop: 
	int mult=1;
	
	for(int x: arr){
		mult*=x;}
	System.out.println("The Multiplication of Entered number is : " + mult);			}// end of else if : 

	//Code for Subtraction
	else if (input.charAt(0) =='-'){
	System.out.println("How many numbers do you want to Subtract : ");
	int num2=sc.nextInt();
	int arr[]=new int [num2];
	
	for(int i=0; i<arr.length; i++){
	System.out.println("Enter your "+ (i+1) + " Number : ");
	arr[i]=sc.nextInt();			}//End of For loop: 
	int sub=arr[0];
	
	for (int x=1; x<arr.length; x++){
		sub-=arr[x]; }
	System.out.println("The Subtraction of Entered number is : " + sub);			}// end of else if : 

	
	//Code for Division
	else if (input.charAt(0) =='/'){
	System.out.println("Enter the number that you want to divide : ");
	double first=sc.nextDouble();
	
	System.out.println("Enter the number that you want do divide your number  : ");
	double second=sc.nextDouble();
	
	double result=first/second;
	System.out.println("The Division of the Given numbers is : " + result);


		}//end of else if:

	}


}