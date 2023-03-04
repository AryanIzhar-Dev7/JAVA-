class Stack{
	int array[]= new int [5];
	int tos=-1;
	int size=4;


	void push(int number ){
	if (tos == size)
	System.out.println("The Stack is full ");

	else{
	array[++tos]=number;
	System.out.println("The value  " + number+"  is added at : "+ tos);
		}
			}

	int pop(){

		if (tos>=0){
		return array[tos--]; }
		
	else {
	System.out.println("The Stack is Empty "); // this line will be executed if the tos will be less than 0. it mean the stack is empty;
		return -1 ; }		


	}

			
}

class StackDemo{
	public static void main (String args[]){
	Stack stack = new Stack ();


	stack.push(12);
	stack.push(34);
	stack.push(33);
	stack.push(56);
	stack.push(234);

	// adding extra values 

	stack.push(123);
	stack.push(67);

		}



}