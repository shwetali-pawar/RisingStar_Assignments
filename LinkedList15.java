import java.util.Collections;
import java.util.LinkedList;

  public class LinkedList15 {
  public static void main(String[] args) {
   
     LinkedList<String> link_list = new LinkedList<String>();
     
     link_list.add("Apple");
     link_list.add("Mango");
     link_list.add("Orange");
     link_list.add("Strawberry");
     link_list.add("Grapes");
     
     System.out.println("The Original linked list: " + link_list);
     
     
      Collections.swap(link_list, 0, 2);
      System.out.println("The New linked list after swap: " + link_list);
   }
  }