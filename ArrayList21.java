import java.util.ArrayList;
  public class ArrayList21 
  {
    public static void main(String[] args)
    {
      ArrayList<String>  color = new ArrayList<String>();

      color.add("Apple");
      color.add("Mango");
  
  System.out.println("Array list: " + color);
  String new_color = "Orange";
  color.set(1,new_color);

  int num=color.size();
  System.out.println("Replace second element with 'Orange'."); 
  for(int i=0;i<num;i++)
  System.out.println(color.get(i));
  }
}