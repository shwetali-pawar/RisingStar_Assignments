import java.util.*;
  public class ArrayList13 {
  public static void main(String[] args) {
   ArrayList<String> l1= new ArrayList<String>();
   l1.add("Apple");
   l1.add("Mango");
   l1.add("Orange");
   l1.add("Strawberry");
   l1.add("Grapes");

   ArrayList<String> l2= new ArrayList<String>();
   l2.add("Apple");
   l2.add("Mango");
   l2.add("Orange");
   l2.add("Grapes");

         
          ArrayList<String> l3 = new ArrayList<String>();
          for (String e : l1)
             l3.add(l2.contains(e) ? "Yes" : "No");
          System.out.println(l3);
         
     }
}