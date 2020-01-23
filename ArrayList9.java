import java.util.*;
  public class ArrayList9
{
  public static void main(String[] args) 
  {
  
  List<String> sourceList = new ArrayList<String>();
  sourceList.add("Apple");
  sourceList.add("Mango");
  sourceList.add("Orange");
  sourceList.add("Strawberry");
  sourceList.add("Grapes");

  System.out.println("sourceList before copy: " + sourceList);
  
  List<String> destList = new ArrayList<String>();
  destList.add("Dog");
  destList.add("Cat");
  destList.add("Horse");
  destList.add("Monkey");
  destList.add("Donkey");
  System.out.println("destList before copy: " + destList);
  
  Collections.copy(destList, sourceList);
  System.out.println("destList after copy: " + destList);

 
 }
}