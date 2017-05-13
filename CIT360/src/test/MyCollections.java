package test;
import java.util.*;

public class MyCollections {

public static void main(String args[]) {
	
	  /*Array List Example*/
	  System.out.println("ArrayList Example:");
	  ArrayList<String> myArrayList = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
	  myArrayList.add("Dalton");
	  myArrayList.add("Russel");

	  /* Displaying array list elements */
	  System.out.println("The Array list has these elements:"+myArrayList+"\n");
	  
	  /*TreeSet Example*/
		System.out.println("Tree Set Example:");
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(1);
		tree.add(23);
		tree.add(80);
		tree.add(45);
	 
		Iterator<Integer> iterator = tree.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("\nNotice they are in the same order as put in, not sorted");
		
		/*Linked List Example*/
		System.out.println("\nLinkedList Example:");
		LinkedList<String> ll = new LinkedList<String>();
        ll.add("Orange");
        ll.add("Apple");
        ll.add("Grape");
        ll.add("Banana");
        ll.add("Pineapple");
        ll.add("Pineapple");
               
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does my LinkedList contains 'Pineapple'? "+ll.contains("Pineapple"));
        System.out.println("Does my LinkedList contains 'Grapefruit'? "+ll.contains("Grapefruit"));
        
        /* Hashmap Example*/
        System.out.println("\nHashMap Example:\n");
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from hashmap
        System.out.println("Value of second: "+hm.get("second"));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the HashMap: "+hm.size());
        
        /* TreeMap Example*/
        System.out.println("\nTreeMap Example:\n");
        TreeMap<String, String> tm = new TreeMap<String, String>();
		//add key-value pair to TreeMap
		tm.put("first", "FIRST INSERTED");
		tm.put("second", "SECOND INSERTED");
		tm.put("third","THIRD INSERTED");
		System.out.println(tm);
		//getting value for the given key from TreeMap
		System.out.println("Value of second: "+tm.get("second"));
		System.out.println("Is TreeMap empty? "+tm.isEmpty());
		tm.remove("second");
		System.out.println(tm);
		System.out.println("Size of the TreeMap: "+tm.size());
		
}
}