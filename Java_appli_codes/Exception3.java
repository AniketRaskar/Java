import java.lang.*;
import java.util.*;

public class Exception3
 {
    public static void main(String[] args) 
    {
     int Arr[] ={10,20,30,40,50};
     Scanner sobj=new Scanner(System.in);  
     
     System.out.println("Enter the index");
     int index=sobj.nextInt();

     try
     {
         System.out.println("Inside try");
     System.out.println("Element at that index is:"+Arr[index]);
     }
     catch(ArrayIndexOutOfBoundsException obj)
     {
        System.out.println("Inside catch");
        System.out.println(obj);
     }
     catch(Exception obj)   //like Dhoni catches any exception.
     {
         
         System.out.println(obj);
     }
     finally
     {
         System.out.println("Inside finally");
         sobj.close();
     }
     System.out.println("End of application");
    }
}
/*
 * Specific exception :which handeles only given exception
 * Genral catch block:If catch block can accept any type of exception,then it is generic catch 
 * ex:Generic catch block-Dhoni-it is irelavent to give to specific exception after the generic exception so avoid this
 */
