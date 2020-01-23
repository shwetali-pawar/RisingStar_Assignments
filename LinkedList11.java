import java.util.LinkedList;
import java.util.Iterator;
  public class LinkedList11
  {
  public static void main(String[] args) {
    
     LinkedList<String> link_list = new LinkedList<String>();
     
     link_list.add("Apple");
     link_list.add("Mango");
     link_list.add("Orange");
     link_list.add("Strawberry");
     link_list.add("Grapes");
     
     System.out.println("Original linked list:" + link_list);  
     for(int p=0; p < link_list.size(); p++)
      {
         System.out.println("Index "+p+": "+link_list.get(p));
       } 
    }
   }