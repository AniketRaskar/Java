import java.lang.*;
import java.util.*;

public class HashTableX
 {
   public static void main(String[] args)
    {
        //Integer is key
        //String is value
       Hashtable <Integer,String>obj = new Hashtable<Integer,String>(); //yat t small ahe

       obj.put(11,"Amit");
       obj.put(21,"Piyush");
       obj.put(22,"Mayur");
       obj.put(30,"Sagar");
       obj.put(34,"Dinesh");

       System.out.println(obj.get(30));
       System.out.println(obj.get(21));

       System.out.println("Data from hash table ");

       Enumeration eobj = obj.keys(); //to acces the element from the hashtable enumeration is used(also for each loop works)

       while(eobj.hasMoreElements())
       {
           System.out.println(eobj.nextElement());
       }
   } 
}
