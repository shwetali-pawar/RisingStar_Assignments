import java.util.ArrayList;

  public class ArrayList18
  {
  public static void main(String[] args) {
   ArrayList<String> l1= new ArrayList<String>();
   l1.add("Apple");
   l1.add("Mango");
   l1.add("Orange");
   l1.add("Strawberry");
   l1.add("Grapes");

  
   System.out.println("Original array list: " + l1);
   System.out.println("Checking array list is empty or not! "+l1.isEmpty());
   l1.removeAll(l1);
   System.out.println("Array list after removing all elements "+l1);   
   System.out.println("Checking array list is empty or not! "+l1.isEmpty());
}
}