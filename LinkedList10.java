import java.util.LinkedList;
import java.util.Iterator;
  public class LinkedList10
  {
  public static void main(String[] args) {
    
     LinkedList<String> link_list = new LinkedList<String>();
     
     link_list.add("Apple");
     link_list.add("Mango");
     link_list.add("Orange");
     link_list.add("Strawberry");
     link_list.add("Grapes");
     
     System.out.println("Linked list:" + link_list);  
     
     
      Object first_element = link_list.getFirst();
      System.out.println("First Element is: "+first_element);
   
     
      Object last_element = link_list.getLast();
      System.out.println("Last Element is: "+last_element);
   }
  }