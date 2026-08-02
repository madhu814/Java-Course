package collection;
import java.util.PriorityQueue;
public class LaunchPQ {

    public static void main(String[] args) {
        PriorityQueue pq1 = new PriorityQueue();  //PriorityQueue is a data structure that stores elements in a way that allows for efficient retrieval of the highest (or lowest) priority element. It is implemented as a binary heap, which is a complete binary tree where each parent node has a higher (or lower) priority than its child nodes. The elements in a PriorityQueue are ordered based on their natural ordering or by a Comparator provided at the time of creation.
        pq1.add(100);
        pq1.add(200);
        pq1.add(300);
        System.out.println(pq1);
        System.out.println(pq1.peek());  //peek() method is used to retrieve the highest priority element of the PriorityQueue without removing it. If the queue is empty, it returns null.
        System.out.println(pq1.poll());  //poll() method is used to retrieve and remove the highest priority element of the PriorityQueue. If the queue is empty, it returns null.
        System.out.println(pq1);
        pq1.add(400);
        System.out.println(pq1);
    }
}
