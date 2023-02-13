import java.util.Scanner;// importing pakage;

class ArrayDemo{
	public static void main (String args []){
	Scanner sc=new Scanner (System.in);
	int arr[]=new int [10];

	//Using for Loop for Taking input from user;
	
	for (int i=0; i< arr.length; i++){
	System.out.println("Enter the "+ (i+1) + " Value : ");
	arr[i]=sc.nextInt();
		}
	System.out.println("Your Entered Values are : ")

	//Using For Each loop for Display Array Elements. It is used instead of for loop;

	for (int x:arr){
	System.out.print(x+"  ");	}
	}

}