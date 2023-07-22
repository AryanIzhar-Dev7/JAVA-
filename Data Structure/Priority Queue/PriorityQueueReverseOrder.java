import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueReverseOrder {

        public static void main(String[] args) {


            // by default the priority queue display the CGPA/ items in ascending order
            // but now we want in Descending order for that we need to call the method
            // of the Collections class reverseOrder();

            Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());

            // Adding the CGPA let suppose
            // using the method offer()
            queue.offer(3.0);
            queue.offer(1.3);
            queue.offer(1.7);
            queue.offer(2.3);
            queue.offer(3.3);
            queue.offer(3.8);
            queue.offer(4.0);

            // displaying every each CGPA in Descending Order


            while (!queue.isEmpty()){
                System.out.println(queue.poll());
            }



        }
    }


