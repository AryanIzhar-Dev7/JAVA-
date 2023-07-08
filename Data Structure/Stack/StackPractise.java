import java.util.Stack;

public class StackPractise {
    public static void main(String[] args) {

        // Practise of the stack
        // All Method of stack is used below

        Stack<String> stack = new Stack<>();

        // using puch() method to add items/elements

        stack.push("Bankai");
        stack.push("Mangekyo Sharingan");
        stack.push("Sharingan");
        stack.push("Byakugan");


        // using peek() to see the top most item/ elements
        System.out.println(stack.peek());

        // using isEmpty() to check stack is empty or not
        System.out.println(stack.isEmpty());

        // Using the search() method to see if elements is present or not
        System.out.println(stack.search("Byakugan"));

        // Using the firstElement() method to see the first entered item/ elements
        System.out.println("First Elements " +stack.firstElement());

        // Printing the Whole Stack
        System.out.println(stack);

        // Using the pop() method to retrieve the items and remove from the stack
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
