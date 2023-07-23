import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMoreExamplesReverseOrder {


    public static void main(String[] args) {

        // Calling the method  reverseOrder of the Class Collections
        // So that the Priority Queue make elements in Descending Order

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        // Adding the items
        // using the method offer()
        queue.offer("D");
        queue.offer("A");
        queue.offer("C");
        queue.offer("B");
        queue.offer("E");


        // displaying the each item
        // Priority Queue automatially give priority to the items
        // by default it will print the items in ascending order
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }



    }
}
