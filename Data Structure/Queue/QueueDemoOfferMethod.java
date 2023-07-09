import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoOfferMethod {

    public static void main(String[] args) {

        // Queue is a FIFO Data Structure; FIFO means First In First Out


        // Declaration of Queue

        Queue<String> queue = new LinkedList<String>();

        // the Queue is made and now printing the queue
        System.out.println(queue);

        // adding items to the queue;

        queue.offer("Itachi Uchiha");
        queue.offer("Naruto Uzumaki");
        queue.offer("Minato Namikaze");
        queue.offer("Lawliet");
        queue.offer("Madara Uchiha");

        // Printing the queue after adding items to it;
        System.out.println(queue);


    }
}
