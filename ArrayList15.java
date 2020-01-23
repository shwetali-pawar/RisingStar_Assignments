import java.util.ArrayList;
import java.util.Collections;
  public class ArrayList15 {
  public static void main(String[] args) {
   ArrayList<String> l1= new ArrayList<String>();
          l1.add("Apple");
          l1.add("Mango");
          l1.add("Orange");
          l1.add("Grapes");
          l1.add("Strawberry");
          System.out.println("First array: " + l1);
          
          ArrayList<String> l2= new ArrayList<String>();
          l2.add("Dog");
          l2.add("Cat");
          l2.add("Horse");
          
          System.out.println("Second array: " + l2);
        
   
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(l1);
        a.addAll(l2);
        System.out.println("New array: " + a);
        

     }
}