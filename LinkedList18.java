import java.util.*;
public class LinkedList18 {
 public static void main(String[] args) {
  
  LinkedList <String> l1 = new LinkedList <String> ();
  
          l1.add("Apple");
          l1.add("Mango");
          l1.add("Orange");
          l1.add("Strawberry");
          l1.add("Grapes");
          
          System.out.println("Linked  list: " + l1);
           
          LinkedList <String> l2 = new LinkedList <String> ();
          
          l2 = (LinkedList)l1.clone();
          
          System.out.println("Cloned list: " + l2);       
}
}