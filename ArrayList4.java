import java.util.*;
import java.util.List;
  public class ArrayList4
{
  public static void main(String[] args) 
  {
  
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Apple");
  list_Strings.add("Mango");
  list_Strings.add("Orange");
  list_Strings.add("Strawberry");
  list_Strings.add("Grapes");

  System.out.println(list_Strings);
  
  String element = list_Strings.get(1);
  System.out.println("First element: "+element);
  
 
 }
}