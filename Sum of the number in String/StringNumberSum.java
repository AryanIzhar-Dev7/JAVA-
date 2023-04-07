import java.util.Scanner;

class StringNumberSum{
	
	static int findSum(String str){
	int sum=0;
		
	for (int i=0; i<str.length(); i++){
	// finding the digits in string by using  isDigit Predefined mehtod of class Character

	if (Character.isDigit(str.charAt(i))){
		//adding the values in sum by convererting char to int usint predefined method getNumericValue

		sum+=Character.getNumericValue(str.charAt(i));

				}// end of if 
	}

	return sum;
			}




	public static void main (String ar[]){
		
	Scanner scanner= new Scanner (System.in);	
	
	System.out.println("Enter a String : ");
	String str= scanner.nextLine();
	
	//Calling the method to find the sum of the digits in string 
	System.out.println(findSum(str));

		}
}