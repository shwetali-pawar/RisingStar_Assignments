import java.util.*;
  public class ArrayList5
{
  public static void main(String[] args) 
  {
  
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Apple");
  list_Strings.add("Mango");
  list_Strings.add("Oran");
  list_Strings.add("Strawberry");
  list_Strings.add("Grapes");

  System.out.println(list_Strings);
  
  list_Strings.set(2, "Orange");
 
  System.out.println(list_Strings);
 
 }
}