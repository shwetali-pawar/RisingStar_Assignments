import java.util.LinkedList;
  public class LinkedList2
{
  public static void main(String[] args) 
  {
    
     LinkedList<String> link_list = new LinkedList<String>();
   
          link_list.add("Apple");
          link_list.add("Mango");
          link_list.add("Orange");
          link_list.add("Strawberry");
          link_list.add("Grapes");
         
	

          for (String element : link_list) 
          {
        	    System.out.println(element);
          }
   }
}