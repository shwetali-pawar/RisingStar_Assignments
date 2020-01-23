import java.util.*;

	public class LinkedList16 {
	public static void main(String[] args) {
  
  LinkedList <String> link_list = new LinkedList <String> ();
  
  link_list.add("Apple");
  link_list.add("Mango");
  link_list.add("Orange");
  link_list.add("Strawberry");
  link_list.add("Grapes");
  
  System.out.println("Linked list before shuffling:\n" + link_list);  
  Collections.shuffle(link_list);
  System.out.println("Linked list after shuffling:\n" + link_list); 
  }
}