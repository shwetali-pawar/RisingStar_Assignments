import java.util.LinkedList;
  public class LinkedList25 {
  public static void main(String[] args) {
   LinkedList<String> l1= new LinkedList<String>();
   			l1.add("Apple");
   			l1.add("Mango");
   			l1.add("Orange");
   			l1.add("Strawberry");
   			l1.add("Grapes");
   			
   			System.out.println("Linked list: " + l1);
           
   			System.out.println("Linked list is empty? "+l1.isEmpty());
            
   			l1.removeAll(l1);
            
   			System.out.println("Linked list after remove all elements "+l1);   
            
   			System.out.println("Linked list is empty? "+l1.isEmpty());
     }
  
  }