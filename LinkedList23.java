import java.util.*;
  public class LinkedList23
  {
  public static void main(String[] args) {
    
     LinkedList<String> link_list = new LinkedList<String>();
     
     link_list.add("Apple");
     link_list.add("Mango");
     link_list.add("Orange");
     link_list.add("Strawberry");
     link_list.add("Grapes");
     
     System.out.println("Original linked list: " + link_list);
     
      
    List<String> list = new ArrayList<String>(link_list);

   for (String str : list){
     System.out.println(str);
   }
}
}