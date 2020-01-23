import java.util.*;
  public class ArrayList7
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
  
  if (list_Strings.contains("Guava")) {
	    System.out.println("Found");
	} else {
	    System.out.println("Not found");
	}
	

 
 }
}