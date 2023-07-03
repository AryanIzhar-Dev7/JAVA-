import java.util.Stack;

public class StackeDemoPushMethod {
    public static void main(String[] args) {

        // Declaration of the "String" Stack
        Stack <String> stack = new Stack<>();

        // Adding items to the Stack
        // Using Method push();

        stack.push("Naruto Shippuden");
        stack.push("Deathnote");
        stack.push("Demon Slayer");
        stack.push("Jujutsu Kaisen");
        stack.push("Hellsing");

        // checking that the Stack is full or empty
        System.out.println(stack.empty());
    }
}
