import java.lang.*;
import java.util.*;


class ArrayListX
{
    public static void main(String arg[])
    {
        ArrayList <String>obj = new ArrayList<String>();

        obj.add("January");  // .add() - is used to add the element in the arrraylist
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
            System.out.println(obj.get(i));  //.get() method is used for getting the arraylist element
        }
        if(obj.contains("April"))   // .contains()  method is used for cheaking the arrayList element
        {
            System.out.println("Element is there");
        }
        int ret=obj.indexOf("April");   //indexOf() method is used for getting the index of element in arrayList
        System.out.println("Element is at:"+ret);

        System.out.println("Element at index 3 is "+obj.get(3));

        String str;
        int Cnt =0;
        for(int i=0;i<obj.size();i++)
        {
            str = obj.get(i);
            if(str.equals("Marvellous"));  //chking no of times marvellous occurs in arrayList
            {
            Cnt++;
            }
        }
        obj.remove(3);  //for removing the element in arrayList
        obj.remove("April");
        System.out.println("Updated list is"+obj);
        obj.clear();  //for removing all the elements in arraylist
        System.out.println("Updated list is"+obj);

        System.out.println("Marvellous occours "+Cnt+" times in the arraylist");
    }
}
//arraylist is the combination of array+ LL . in ArrayList we can add the element with the help of index,or we can delete the element with the help of index, this is the phayada over Array in ArrayList
