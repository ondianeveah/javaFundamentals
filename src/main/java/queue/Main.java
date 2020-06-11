package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//How to use Queue
//FIFO = First In, First Out (first come, first serve)
//Whatever element that arrives firs, will be the first one to go out

//Insert - enqueue
//Remove - dequeue
public class Main {

    // LinkedList implementation of Queue
    Queue<String> animal1 = new LinkedList<>();

    // Array implementation of Queue
    Queue<String> animal2 = new ArrayDeque<>();

    // Priority Queue implementation of Queue
    Queue<String> animal3 = new PriorityQueue<>();

    //Here, we have created objects animal1, animal2 and animal3 of classes LinkedList, ArrayDeque and PriorityQueue respectively.
    // These objects can use the functionalities of the Queue interface
}
