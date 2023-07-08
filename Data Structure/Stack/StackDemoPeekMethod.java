import java.util.Stack;

public class StackDemoPeekMethod {
    public static void main(String[] args) {

        // Declaration of the "String" Stack
        Stack<String> stack = new Stack<>();

        // Adding items to the Stack
        // Using Method push();

        stack.push("Naruto Shippuden");
        stack.push("Deathnote");
        stack.push("Demon Slayer");
        stack.push("Jujutsu Kaisen");
        stack.push("Hellsing");


        // Instead of using pop method we can use the peek method
        // Which let us see what is on the top of the stack
        System.out.println(stack.peek());


        // checking that the Stack is full or empty
        // Now the stack is not  empty because
        // the peek  method allow us to see what is on the top of stack

        System.out.println(stack.empty());

        // Printing the whole stack
        System.out.println(stack);

    }
}
