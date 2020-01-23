import java.util.LinkedList;
public class LinkedList22
{
 public static void main(String[] args) {
  
  LinkedList <String> l1 = new LinkedList <String> ();
  
          l1.add("Apple");
          l1.add("Mango");
          l1.add("Orange");
          l1.add("Strawberry");
          l1.add("Grapes");
          
          if (l1.contains("Orange")) {
              System.out.println("Present in the list.");
           } else {
              System.out.println("Not present in the linked list.");
            }
           
          if (l1.contains("Banana")) {
              System.out.println("Present in the list.");
           } else {
              System.out.println("Not present in the linked list.");
            }
        }
       }