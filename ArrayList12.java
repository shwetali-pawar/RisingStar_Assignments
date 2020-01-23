import java.util.*;
  public class ArrayList12
{
  public static void main(String[] args) 
  {
  
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Apple");
  list_Strings.add("Mango");
  list_Strings.add("Orange");
  list_Strings.add("Strawberry");
  list_Strings.add("Grapes");

  System.out.println("Original list: " + list_Strings);
  List<String> subList = list_Strings.subList(0, 3);
  System.out.println("Sub list: " + subList);

 
 }
}