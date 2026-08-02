package collection;
import java.util.*;
public class LaunchAD {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();  //ArrayDeque is a resizable array implementation of the Deque interface. It is a linear data structure that allows elements to be added or removed from both ends (front and rear) of the deque. It can be used as a stack, queue, or double-ended queue.
        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        System.out.println(ad1);
        ad1.addFirst(50);  //addFirst() method is used to insert the specified element at the front of the deque. If the deque is full, it will throw an IllegalStateException.
        ad1.addLast(300);  //addLast() method is used to insert the specified element at the end of the deque. If the deque is full, it will throw an IllegalStateException.
        System.out.println(ad1);

        ad1.add("PW");
        System.out.println(ad1);
   
        ad1.offer(500);               //offer() method is used to insert the specified element at the end of the deque. If the deque is full, it will return false instead of throwing an exception.     
        ad1.offerLast(600);
        ad1.offerFirst(1);

        System.out.println(ad1);

        //Deque<Integer> ad2 = new ArrayDeque<Integer>();  //Using Deque follows the generic type and we can add only Integer type of data in this collection
        //Duplicate and heterogeneous data is  allowed in this collection.
    }
}
