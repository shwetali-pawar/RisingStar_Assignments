import java.util.LinkedList;
public class LinkedList21
{
 public static void main(String[] args) {
  
  LinkedList <String> l1 = new LinkedList <String> ();
  
          l1.add("Apple");
          l1.add("Mango");
          l1.add("Orange");
          l1.add("Strawberry");
          l1.add("Grapes");
          
         System.out.println("Linked list: " + l1); 
        
         String x = l1.peekLast();
         
         System.out.println("Last element in the list: " + x);
         System.out.println("Linked list: " + l1);   
      }
     } 