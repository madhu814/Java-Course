package collection;
import java.util.*;
public class LaunchLL {
    public static void main(String[] args) { 
        //LinkedList is a linear data structure that stores elements in a sequential manner. It is a collection of nodes where each node contains data and a reference to the next node in the sequence. LinkedList allows for efficient insertion and deletion of elements, as it does not require shifting elements like an array does. It can be used to implement various data structures such as stacks, queues, and deques.
        //This LinkedList folloews the doubly linked list data structure, where each node contains a reference to both the previous and next nodes in the sequence. This allows for efficient traversal of the list in both directions.
        LinkedList ll1 = new LinkedList<>();  //Using LinkedList in this way means we can add any type of data in this collection but the java compiler gives Generic type warning because we are not using any generic type in this collection
        ll1.add(100);
        ll1.add(200);
        ll1.add(300); 
               
        System.out.println(ll1);
        System.out.println(ll1.get(1));
        System.out.println(ll1.lastIndexOf(300));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        
        LinkedList ll2 = new LinkedList<>();  //Using LinkedList in this way means we can add any type of data in this collection but the java compiler gives Generic type warning because we are not using any generic type in this collection
        ll2.add("Learning");    
        ll2.add(1);
        ll2.add('j');
        System.out.println(ll2);
        
        LinkedList ll3 = new LinkedList<>();  //Using LinkedList in this way means we can add any type of data in this collection but the java compiler gives Generic type warning because we are not using any generic type in this collection
        ll3.add(10);
        ll3.add(20);
        ll3.add(30);

        ll3.addFirst("PW");  //This will give compile time error because we are trying to add Integer type of data in String type of collection
        ll3.addLast("Java");

        System.out.println(ll3);

        ll3.add(2,10);
        System.out.println(ll3);
        System.out.println(ll3.peek()); //peek() method is used to retrieve the first element of the LinkedList without removing it. If the list is empty, it returns null.
        System.out.println(ll3.poll()); //poll() method is used to retrieve and remove the first element of the LinkedList. If the list is empty, it returns null.


}   
}

