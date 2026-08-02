package collection;
import java.util.*;
public class LaunchTS {
    public static void main(String[] args) {
        TreeSet ts1 = new TreeSet();  //TreeSet is a data structure that stores elements in a sorted and ascending order. It is implemented as a self-balancing binary search tree, which means that the elements are automatically sorted as they are added to the set. The elements in a TreeSet must implement the Comparable interface or be provided with a Comparator at the time of creation.
        ts1.add(100);
        ts1.add(200);
        ts1.add(300);
        ts1.add(400);
        ts1.add(500);
        System.out.println(ts1);
        System.out.println(ts1.first());  //first() method is used to retrieve the first (lowest) element of the TreeSet without removing it. If the set is empty, it throws NoSuchElementException.
        System.out.println(ts1.last());   //last() method is used to retrieve the last (highest) element of the TreeSet without removing it. If the set is empty, it throws NoSuchElementException.

        System.out.println(ts1.higher(50));  //higher() method is used to retrieve the least element in the TreeSet that is strictly greater than the given element. If there is no such element, it returns null.
        System.out.println(ts1.lower(50));   //lower() method is used to retrieve

        System.out.println(ts1.ceiling(50));  //ceiling() method is used to retrieve the least element in the TreeSet that is greater than or equal to the given element. If there is no such element, it returns null.
        System.out.println(ts1.floor(50));    //floor() method is used to retrieve

        System.out.println(ts1.ceiling(100));  //ceiling() method is used to retrieve the least element in the TreeSet that is greater than or equal to the given element. If there is no such element, it returns null.
        System.out.println(ts1.floor(100));    //floor() method is used to retrieve 
    }
}
