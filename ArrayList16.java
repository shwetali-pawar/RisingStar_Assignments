import java.util.ArrayList;

  public class ArrayList16
  {
  public static void main(String[] args) {
   ArrayList<String> l1= new ArrayList<String>();
   l1.add("Apple");
   l1.add("Mango");
   l1.add("Orange");
   l1.add("Strawberry");
   l1.add("Grapes");

  
   System.out.println("First array: " + l1);
   ArrayList<String> newc1 = (ArrayList<String>)l1.clone();
   System.out.println("Cloned array list: " + newc1);       
}
}