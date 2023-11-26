import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMoreExamples {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

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
