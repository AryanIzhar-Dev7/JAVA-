import java.util.*; 
 
 class StackAsArray 
 { 
 private int array[]; 
 private int top; 
 private int capacity; 
 private int size;
 
 // Constructor to initialize stack 
 StackAsArray(int size) 
 { 
 array = new int[size]; 
 capacity = size; 
 top = -1; 
 this.size=0;
 } 
 
 // Utility function to add an element x in the stack and check for stack overflow 
 public void push(int x) 
 { 
		if (top==capacity){
			System.out.println("Stack is full");
		}
		else{
		this.array[++top]=x; 
			size++;}
 
 } 
 
// Utility function to pop top element from the stack and check for stack underflow
 
 public int pop() 
 { 
 // Write your code here
 
		int p= this.array[top--];
		size--;
		
		return p;
 } 
 
// Utility function to return top element in a stack 
 public int peek() 
 { 
 
		if (top==-1){
			return -1;
		}
		else
		return this.array[top];
 } 
 
 // Utility function to return the size of the stack 
 public int size() 
 { 
	return this.size;
 } 
 
 // Utility function to check if the stack is empty or not 
 public Boolean isEmpty() 
 { 
		if (top<0 || size==0){
			return true;
		}
		
		return false;
 } 
 
// Utility function to check if the stack is full or not 
 public Boolean isFull() 
 { 
		if (size==capacity){
			
			return true;
		}
		else{
			return false;
		}

 } 
 
 
 public static void main (String[] args) 
{ 
 var stack = new StackAsArray(3); 
 
 stack.push(1); // Inserting 1 in the stack 
 stack.push(2); // Inserting 2 in the stack 
 
 stack.pop(); // removing the top 2 
 stack.pop(); // removing the top 1 
 
 stack.push(3); // Inserting 3 in the stack 
 
 System.out.println("Top element is: " + stack.peek()); 
 System.out.println("Stack size is " + stack.size()); 
 
 stack.pop(); // removing the top 3 
 
 // check if stack is empty 
 if (stack.isEmpty()) 
 System.out.println("Stack Is Empty"); 
 else 
 System.out.println("Stack Is Not Empty"); 
 } 
 } 