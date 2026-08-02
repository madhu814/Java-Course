package collection;

import java.util.*;
public class LaunchAL {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();  //dynamic array and this is heterogeneous collection also
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        System.out.println(al);

        ArrayList al1 = new ArrayList();  //Using ArrayList in this way means we can add any type of data in this collection but the java compiler gives Generic type warning because we are not using any generic type in this collection
        al1.add("Learning");
        al1.add(600);
        System.out.println(al1);

        System.out.println(al1.contains(200));

        int index = al1.indexOf(600);
        System.out.println(index);

        System.out.println(al1.size());
        al1.ensureCapacity(10);
        al1.trimToSize();   //trim size method is used to trim the capacity of the ArrayList instance to be the list's current size. An application can use this operation to minimize the storage of an ArrayList instance.
        System.out.println(al1.size());

        al1.clear();    
        System.out.println(al1);

        List all= new ArrayList();   //making reference of List interface and creating object of ArrayList class

        all.add("Learning");
        all.add(600);

        // ArrayList<String> al2 = new ArrayList<String>();  
        // al2.add("Java");
        // al2.add("Collection");
        // al2.add("Framework");
        // //Using ArrayList in this way means we can add only String type of data in this collection
        // al2.addAll(al1);  //This will give compile time error because we are trying to add Integer type of data in String type of collection
        // System.out.println(al2);
    }
}