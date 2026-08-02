package collection;
import java.util.*;
public class LaunchHS {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();  //HashSet is a data structure that stores unique elements in an unordered manner. It is implemented as a hash table, which means that the elements are stored based on their hash codes. The elements in a HashSet must implement the hashCode() and equals() methods to ensure uniqueness.
        hs1.add(100);
        hs1.add(200);
        hs1.add(300);
        hs1.add(400);
        hs1.add(500);
        System.out.println(hs1);    //The order of elements in the HashSet is not guaranteed to be the same as the order in which they were added. The elements are stored based on their hash codes, which can result in a different order each time the program is run.

         //LinkedHashSet come in Java 1.4 version and it is a child class of HashSet. It is a data structure that stores unique elements in the order in which they were added. It is implemented as a hash table with a linked list running through it, which means that the elements are stored based on their hash codes and the order in which they were added. The elements in a LinkedHashSet must implement the hashCode() and equals() methods to ensure uniqueness.
        //LinkedHashSet is a data structure that stores unique elements in the order in which they were added. It is implemented as a hash table with a linked list running through it, which means that the elements are stored based on their hash codes and the order in which they were added. The elements in a LinkedHashSet must implement the hashCode() and equals() methods to ensure uniqueness.
        LinkedHashSet hs2 = new LinkedHashSet();  //LinkedHashSet is a data structure that stores unique elements in the order in which they were added. It is implemented as a hash table with a linked list running through it, which means that the elements are stored based on their hash codes and the order in which they were added. The elements in a LinkedHashSet must implement the hashCode() and equals() methods to ensure uniqueness.
        hs2.add(100);
        hs2.add(200);
        hs2.add(300);
        hs2.add(400);
        hs2.add(500);
        System.out.println(hs2);
    }
}
