import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoExtendedMethods {
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

        // ************************ AS THE QUEUE  INTERFACE EXTENDS COLLECTION
        // IT HAS FEW EXTRA USEFUL METHODS ***********************************
        // LIKE isEmpty(); , size();  , and contains();

        // Using the method isEmpty() and it returns true or false only

        System.out.println(queue.isEmpty());


        // Using the Method size(); and it returns the number of items that are in queue
        System.out.println(queue.size());


        // Using the method contains(); and it returns true or false only

        System.out.println(queue.contains("Lawliet"));



    }
}
