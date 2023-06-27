import java.util.Scanner;
class TwoDimensionalArray{
	public static void main (String args[]){
	
	Scanner sc=new Scanner (System.in);

	int arr[][]=new int [3][4]; //Declaration of two dimensional array;
	

	// Declaration of Outer loop:
	for (int i=0; i<arr.length; i++){ 
		for (int j=0; j<arr[i].length; j++){
		System.out.println ("Please enter the value of "+ (i+1)+ " Row and "+(j+1)+"Column : " );
		arr[i][j]=sc.nextInt();
			} // End of inner loop :
		}// End of outer loop: 


	System.out.println("Your Entered Values are : "); 
	//  Declaration of Outer Loop;
	for(int x=0; x<arr.length; x++){  

	// Inner Loop: 
	for(int y=0; y<arr[x].length; y++ ){
		System.out.print(arr[x][y]+ "   ");
				} //End of Inner Loop;
		System.out.println("\n "); 	}// End of Outer loop: 
	
	}

}