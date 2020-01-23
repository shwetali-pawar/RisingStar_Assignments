import java.util.LinkedList;
  public class LinkedList26 {
  public static void main(String[] args) {
   LinkedList<String> l1= new LinkedList<String>();
   			l1.add("Apple");
   			l1.add("Mango");
   			l1.add("Orange");
   			l1.add("Strawberry");
   			l1.add("Grapes");
   			
   		  System.out.println("Original linked list: " + l1);
          
          l1.set(3, "Banana");
          System.out.println("The value of second element changed.");
          System.out.println("New linked list: " + l1);
   }
}