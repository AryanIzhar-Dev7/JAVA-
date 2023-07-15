import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoPeekMethod {

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


        // We can also the see what is at the top/ head of the queue
        // by Using the peek() Method. It does not remove the item form the queue like poll() does
        System.out.println(queue.peek());



        // Printing the Queue
        System.out.println(queue);

}
}
