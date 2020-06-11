package queue.priorityQueueClass.comparator;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        System.out.print("PriorityQueue: " + numbers);
    }
}
