import java.util.ArrayList;

  public class ArrayList20
  {
  public static void main(String[] args) {
   ArrayList<String> l1= new ArrayList<String>();
   l1.add("Apple");
   l1.add("Mango");
   l1.add("Orange");
   l1.add("Strawberry");
   l1.add("Grapes");
   
   System.out.println("Original array list: " + l1);
   
   l1.ensureCapacity(3);
   l1.add("Guava");
   l1.add("Banana");
   l1.add("Kiwi");
   System.out.println("New array list: " + l1);
}
}