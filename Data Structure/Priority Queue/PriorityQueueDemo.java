import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue<Double> queue = new PriorityQueue<Double>();

        // Adding the CGPA let suppose
        // using the method offer()
        queue.offer(3.0);
        queue.offer(1.3);
        queue.offer(1.7);
        queue.offer(2.3);
        queue.offer(3.3);
        queue.offer(3.8);
        queue.offer(4.0);

        // displaying the each CGPA
        // Priority Queue automatially give priority to the items
        // by default it will print the items in ascending order

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }



    }
}
