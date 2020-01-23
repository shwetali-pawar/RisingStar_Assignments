import java.util.*;

  public class ArrayList14
  {
  public static void main(String[] args) {
   ArrayList<String> l1= new ArrayList<String>();
   l1.add("Apple");
   l1.add("Mango");
   l1.add("Orange");
   l1.add("Strawberry");
   l1.add("Grapes");

  
   System.out.println("Array list before Swap:");
   for(String a: l1){
   System.out.println(a);
 }
  
  Collections.swap(l1, 0, 2);
   System.out.println("Array list after swap:");
   for(String b: l1){
   System.out.println(b);
  }
}
}