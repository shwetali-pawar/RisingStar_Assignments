import java.util.ArrayList;

  public class ArrayList19
  {
  public static void main(String[] args) {
   ArrayList<String> l1= new ArrayList<String>();
   l1.add("Apple");
   l1.add("Mango");
   l1.add("Orange");
   l1.add("Strawberry");
   l1.add("Grapes");
  
   System.out.println("Array list: " + l1);
   System.out.println("Trimmed array: ");
   l1.trimToSize();
   System.out.println(l1);
}
}