import java.lang.*;
import java.util.*;

class LinkListX
{
    public static void main(String arg[])
    {
        //ArrayList <String>obj = new ArrayList<String>();
        LinkedList <String>obj = new LinkedList<String>(); //having same methods for both, as in util package there is interface named as list which is implemented by both ArrayList as well as LinkedList so both as same methods

        obj.add("January");
        obj.add("February");
        obj.add("March");
        obj.add("Marvellous");
        obj.add("April");
        obj.add(2,"New");
        obj.add("May");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("Marvellous");


        System.out.println("Array is:"+obj);
        System.out.println("Size is:"+obj.size());

        System.out.println("Elements are using for loop");
        for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
        if(obj.contains("April"))
        {
            System.out.println("Element is there");
        }
        int ret=obj.indexOf("April");
        System.out.println("Element is at:"+ret);

        System.out.println("Element at index 3 is "+obj.get(3));

        String str;
        int Cnt =0;
        for(int i=0;i<obj.size();i++)
        {
            str = obj.get(i);
            if(str.equals("Marvellous"));
            {
            Cnt++;
            }
        }
        obj.remove(3);
        obj.remove("April");
        Iterator iobj = obj.iterator();  //for getting the elements in LinkList hasNext() method (also avaiable in arrayList)
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        obj.clear();
        System.out.println("Updated list is"+obj);

        System.out.println("Marvellous occours at "+Cnt+" times in the arraylist");
    }
}
