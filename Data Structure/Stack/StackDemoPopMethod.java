import java.util.Stack;

public class StackDemoPopMethod {

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


            // Retrieving the items that are in Stack
            // Using method pop();

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());



            // checking that the Stack is full or empty
            // Now the stack is empty because the pop method retrieve the item and remove from stack
            System.out.println(stack.empty());
        }
    }


