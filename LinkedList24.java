import java.util.*;
  public class LinkedList24 {
  public static void main(String[] args) {
   LinkedList<String> l1= new LinkedList<String>();
   			l1.add("Apple");
   			l1.add("Mango");
   			l1.add("Orange");
   			l1.add("Strawberry");
   			l1.add("Grapes");
          
   		  LinkedList<String> l2= new LinkedList<String>();
          l2.add("Red");
          l2.add("Green");
          l2.add("Black");
          l2.add("Orange");

          
          LinkedList<String> l3 = new LinkedList<String>();
          for (String e : l1)
             l3.add(l2.contains(e) ? "Yes" : "No");
          System.out.println(l3);         
     }
}