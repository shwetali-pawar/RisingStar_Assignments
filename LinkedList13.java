import java.util.*;

  public class LinkedList13 {
  public static void main(String[] args) {
   
     LinkedList<String> link_list = new LinkedList<String>();
     
     link_list.add("Apple");
     link_list.add("Mango");
     link_list.add("Orange");
     link_list.add("Strawberry");
     link_list.add("Grapes");
     
     System.out.println("The Original linked list: " + link_list);

     
       Object firstElement = link_list.removeFirst();
       System.out.println("First element removed: "+ firstElement);
    
     
       Object lastElement = link_list.removeLast();
       System.out.println("Last element removed: "+ lastElement);
       System.out.println("New list: " + link_list);
     }
   }