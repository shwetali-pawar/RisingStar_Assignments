import java.util.*;
  public class ArrayList2
{
  public static void main(String[] args)
  {

  List<String> list_Strings = new ArrayList<String>();
  
  list_Strings.add("Apple");
  list_Strings.add("Mango");
  list_Strings.add("Orange");
  list_Strings.add("Strawberry");
  list_Strings.add("Grapes");
 
  for (String element : list_Strings)
  	{
	  System.out.println(element);
    }
  }
}