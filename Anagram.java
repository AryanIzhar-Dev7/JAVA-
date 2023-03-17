
// This program will tell you about Anagram: It means this program will take two words from the user 
// and it will tell the user that the given Words are Anagrams or Not : 

import java.util.Scanner;

class Anagram{
	static int tell(String str, String str2){
	
 	 // Declaration of variable that will be used 	
	 int length= str.length();
	 int length2= str2.length();
	 int count=0;

	if (length == length2){

	// for loop to check for Anagram 

	for (int i=0; i<length; i++ ){
		for (int x=0; x<length; x++){
		if (str.charAt(i) == str2.charAt(x)){
		count ++;
						}// end of inner if 

					}//end of forloop

				}// end of if statement
					}

	return count ; 	} 



	public static void main (String args[]){
	Scanner scanner= new Scanner(System.in);
	
	// Taking input form user
	System.out.println("Enter a String : ");
	String str= scanner.nextLine();
	
	System.out.println("Enter another String : ");
	String str2 = scanner.nextLine();
	
	// Calling tell method and storing its return value in returned varaible
	int returned = tell(str,str2);

		if (str.length()==returned){
			System.out.println("The Entered Strings are Anagram : ");
				}
	
		else{
			System.out.println(" The Entered Strings are not Anagram : ");
		}
	

	}
}