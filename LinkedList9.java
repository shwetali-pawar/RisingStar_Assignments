import java.util.LinkedList;

  public class LinkedList9
  {
  public static void main(String[] args) {
   
     LinkedList<String> link_list = new LinkedList<String>();
  
     link_list.add("Apple");
     link_list.add("Mango");
     link_list.add("Orange");
     link_list.add("Strawberry");
     link_list.add("Grapes");
     
     System.out.println("Original linked list:" + link_list);

    

     LinkedList <String> new_l_list = new LinkedList <String> ();
     new_l_list.add("Banana");
     new_l_list.add("Guava");

    
     link_list.addAll(3, new_l_list);

     
     System.out.println("LinkedList:" + link_list);
    }
   }