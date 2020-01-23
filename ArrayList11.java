import java.util.*;
  public class ArrayList11
{
  public static void main(String[] args) 
  {
  
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Apple");
  list_Strings.add("Mango");
  list_Strings.add("Orange");
  list_Strings.add("Strawberry");
  list_Strings.add("Grapes");

  System.out.println("List before reversing: " + list_Strings);
  Collections.reverse(list_Strings);
  System.out.println("List after reversing: " + list_Strings);

 
 }
}