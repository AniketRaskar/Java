import java.lang.*;
import java.util.*;


public class StackX1 
{
    public static void main(String[] args) 
    {
       Stack <Integer>obj = new Stack<Integer>();
       
       obj.push(11);
       obj.push(21);
       obj.push(51);
       obj.push(101);

      
       Iterator iobj = obj.iterator();
      
       
       while(iobj.hasNext())
       {
           System.out.println(iobj.next());
        }

        System.out.println("Popped elements are");
        
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}
