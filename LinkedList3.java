import java.util.LinkedList;
import java.util.Iterator;
  public class LinkedList3 {
  public static void main(String[] args) {
   
     LinkedList<String> link_list = new LinkedList<String>();
  
     link_list.add("Apple");
     link_list.add("Mango");
     link_list.add("Orange");
     link_list.add("Strawberry");
     link_list.add("Grapes");

   Iterator p = link_list.listIterator(2);

   
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}