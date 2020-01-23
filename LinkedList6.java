import java.util.LinkedList;
import java.util.Iterator;
  public class LinkedList6
  {
  public static void main(String[] args) {
   
     LinkedList<String> link_list = new LinkedList<String>();
  
     link_list.add("Apple");
     link_list.add("Mango");
     link_list.add("Orange");
     link_list.add("Strawberry");
     link_list.add("Grapes");
     
     System.out.println("Linked list:" + link_list);    
   
      link_list.addFirst("Banana");
   
    
      link_list.addLast("Guava");
       System.out.println("Linked list:" + link_list);  
   }
  }