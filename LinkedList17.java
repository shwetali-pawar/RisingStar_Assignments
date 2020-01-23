import java.util.*;
public class LinkedList17 {
 public static void main(String[] args) {
  
  LinkedList <String> l1 = new LinkedList <String> ();
  
          l1.add("Apple");
          l1.add("Mango");
          l1.add("Orange");
          l1.add("Strawberry");
          l1.add("Grapes");
          
          System.out.println("First linked list: " + l1);
        
          LinkedList <String> l2 = new LinkedList <String> ();
          l2.add("Dog");
          l2.add("Cat");
          l2.add("Horse");
         
          
          System.out.println("Second linked list: " + l2);
        
     
        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(l1);
        a.addAll(l2);
        System.out.println("New list: " + a);
             }
}