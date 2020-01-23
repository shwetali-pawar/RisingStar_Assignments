import java.util.LinkedList;
import java.util.Iterator;
  public class LinkedList4
  {
  public static void main(String[] args) {
   
     LinkedList<String> link_list = new LinkedList<String>();
  
     link_list.add("Apple");
     link_list.add("Mango");
     link_list.add("Orange");
     link_list.add("Strawberry");
     link_list.add("Grapes");

     System.out.println("Linked list:" + link_list);  
     
     Iterator s = link_list.descendingIterator();

     
      System.out.println("Reverse Order:");
      while (s.hasNext()) {
         System.out.println(s.next());
      }
   }
 }