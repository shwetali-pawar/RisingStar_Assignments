import java.util.ArrayList;

  public class ArrayList22
{
  public static void main(String[] args) 
  {
   ArrayList<String> l1= new ArrayList<String>();
   l1.add("Apple");
   l1.add("Mango");
   l1.add("Orange");
   l1.add("Strawberry");
   l1.add("Grapes");
  
   System.out.println("Array list: " + l1);
   System.out.println("Print using index of an element: ");
   int no_of_elements = l1.size();
   for (int index = 0; index < no_of_elements; index++)
   System.out.println(l1.get(index));
  }
}