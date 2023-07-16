import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoPollMethod {
    public static void main(String[] args) {

        // Queue is a FIFO Data Structure; FIFO means First In First Out


        // Declaration of Queue

        Queue<String> queue = new LinkedList<String>();




        // adding items to the queue;

        queue.offer("Itachi Uchiha");
        queue.offer("Naruto Uzumaki");
        queue.offer("Minato Namikaze");
        queue.offer("Lawliet");
        queue.offer("Madara Uchiha");


        // Now using the poll(); method to retrieve the items and remove it from the queue
        // using poll() because it does not throw exception
        // instead of poll() we can use remove() but it throws exception

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        // Printing the Queue
        System.out.println(queue);



    }
}