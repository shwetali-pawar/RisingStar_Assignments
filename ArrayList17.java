import java.util.ArrayList;

  public class ArrayList17
  {
  public static void main(String[] args) {
   ArrayList<String> l1= new ArrayList<String>();
   l1.add("Apple");
   l1.add("Mango");
   l1.add("Orange");
   l1.add("Strawberry");
   l1.add("Grapes");

  
   System.out.println("Original array list: " + l1);
   l1.removeAll(l1);
   System.out.println("Empty array list "+l1);  
}
}