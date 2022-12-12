import java.lang.*;
import java.util.*;

class VectorX
{
    public static void main(String[] args) 
    {
        Vector <Integer> obj = new Vector<Integer>();

        obj.add(11);
        obj.add(21);
        obj.add(51);
        obj.add(120);
        obj.add(110);
        obj.add(111);
        obj.add(111);//also allowes duplicate elements
        
        System.out.println("Capacity of vector is :"+obj.capacity());  //Capacity- the amount of memory allocated for the vector, if the allocated memory gets finish then it gets allocated agian tewdich jewedi purvi bhetali hoti, if we have to allocate only that memory which we require then we have to specify it within contructor
        System.out.println("size of vector is :"+obj.size());
        int i=0;
        for(i=0;i < obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
        int no=0,cnt=0;
        for(i=0;i < obj.size();i++)
        {
           no=obj.get(i);
           if(no%2==0)
           {
               cnt++;
           }
        }
        System.out.println("Even elements are "+cnt);
        
        Iterator iobj = obj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        obj.clear();
    }
}
//al the methods of arraylist are applied for Vector
// Differnce bet vector and other-