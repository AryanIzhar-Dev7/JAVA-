import java.util.LinkedList;

public class LinkedListAsQueue {



        public static void main(String[] args) {

            //LinkedList is a data structure which store the data with address like [data|address] it takes two blocks
            // we can use linkedlist as a stack or queue

            LinkedList<String> linkedList= new LinkedList<>();

            //Using linlkedlist as a Queue
            // adding items to linkedlist

            linkedList.offer("A");
            linkedList.offer("B");
            linkedList.offer("C");
            linkedList.offer("D");
            linkedList.offer("F");


            // printing the items of linkedlist
            System.out.println(linkedList);

            //removing the items from linkedlist
            System.out.println(linkedList.poll());
            System.out.println(linkedList.poll());

            // printing the items of linkedlist
            System.out.println(linkedList);

        }
    }


