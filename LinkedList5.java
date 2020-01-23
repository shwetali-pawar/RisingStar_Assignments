import java.util.LinkedList;
import java.util.Iterator;
  public class LinkedList5
  {
  public static void main(String[] args) {
   
     LinkedList<String> link_list = new LinkedList<String>();
  
     link_list.add("Apple");
     link_list.add("Mango");
     link_list.add("Orange");
     link_list.add("Strawberry");
     link_list.add("Grapes");
     
     System.out.println("Linked list: ");
		
     System.out.println("Adding one more fruit at no.3: " + link_list);
		link_list.add(3, "Banana");
		
		System.out.println("The linked list:" + link_list);
	}
}