package DynamicDataTypes;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        
        /*
        * Queue is an interface, 
        * Being an interface the queue needs a concrete class for the declaration 
        * and the most common classes are the PriorityQueue and LinkedList in Java
        * Note that neither of these implementations is thread-safe. 
        * PriorityBlockingQueue is one alternative implementation if the thread-safe implementation is needed.
        */

        Queue<String> queueOfString = new PriorityQueue<String>();


        // using add()
        queueOfString.add("A");
        queueOfString.add("B");
        queueOfString.add("C");

        System.out.println(queueOfString);

        // Printing the top element of
        System.out.println("Top element of queue: "+ queueOfString.peek());
        System.out.println(queueOfString);

        // Printing the top element and removing it
        System.out.println("Remove Top element of queue: "+ queueOfString.poll());
        System.out.println(queueOfString);

        // Printing the top element again
        System.out.println("New Top element of queue: "+ queueOfString.peek());
        System.out.println(queueOfString);


        /*
         * https://coderanch.com/t/573570/certification/natural-ordering
         * Priority Queue uses heap sort
         */

        Queue<Integer> queueOfInt = new PriorityQueue<Integer>();


        // using add()
        queueOfInt.add(2);
        queueOfInt.add(4);
        queueOfInt.add(1);
        queueOfInt.add(3);

        System.out.println(queueOfInt); // orders its elements according to their natural ordering.

        // Printing the top element of
        System.out.println("Top element of queue: "+ queueOfInt.peek());
        System.out.println(queueOfInt);

        // Printing the top element and removing it
        System.out.println("Remove Top element of queue: "+ queueOfInt.poll());
        System.out.println(queueOfInt);

        // Printing the top element again
        System.out.println("New Top element of queue: "+ queueOfInt.peek());
        System.out.println(queueOfInt);
    }
}
