import java.util.Scanner;

class ArraySum{
	static int sumArray(int [] values){
	
		int sum=0;
	for(int i : values){
	sum+=i;
		}


	return sum;		}


}

class ArrayValuesSum{
	public static void main (String atgs[]){
	Scanner scanner= new Scanner (System.in);	

		ArraySum arraysum= new ArraySum();
		int array[]= new int [10];

		for (int i=0; i< array.length; i++){
			System.out.println("Enter the " + (i+1) +" value : ");
			array[i]= scanner.nextInt();
			} // end of for loop;

		int sumvalues = arraysum.sumArray(array); // calling the method which is in class ArraySum;

		System.out.println("The Sum of all the values of the Array is : "+ sumvalues);



		}


}