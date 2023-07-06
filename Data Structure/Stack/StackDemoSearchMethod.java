import java.util.Stack;

public class StackDemoSearchMethod {
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


        // We can search in the stack by using the method search();
        // The Search method returns the index of the item if it is available
        // otherwise it return -1

        System.out.println(stack.search("Demon Slayer"));


        // Printing the whole stack
        System.out.println(stack);

    }
}
