import java.util.LinkedList;
import java.util.Queue;

public class QueuePractise {
    public static void main(String[] args) {

        //Practise of Queue
        // Used all method

        Queue<String> queue= new LinkedList<>();

        // Using offer() method to add Persons in the Queue
        queue.offer("Naruto");
        queue.offer("Itachi");
        queue.offer("Madara");
        queue.offer("Minato");
        queue.offer("Obito");

        // using the elemtent() method to see the first person
        System.out.println("The First Person in the queue is  "+queue.element());

        // using the isEmpty() method to check that the queue is empty or not
        System.out.println(queue.isEmpty());

        // using contains() method to see that the queue have a member / person
        System.out.println("The Queue contains Minato "+queue.contains("Minato"));

        // using the size() method to see the number of persons/ items in the queue
        System.out.println("The Size of the Queue is  " +queue.size());

        // Using the poll() method to retreive and remove the data form the queue
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
