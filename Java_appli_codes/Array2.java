import java.lang.*;
import java.util.*;
public class Array2 {
    public static void main(String[] args) 
    {
        int iCnt=0;
       Scanner sobj = new Scanner(System.in);
       System.out.println("Enter the number of elements");
       int size= sobj.nextInt(); 

       int Arr[] = new int[size];

       System.out.println("Enter the elemnts of array");
       for(iCnt=0;iCnt <Arr.length;iCnt++)
       {
           Arr[iCnt] = sobj.nextInt();
       }
       System.out.println("Elements of array are");
       for(iCnt=0;iCnt <Arr.length;iCnt++)
       {
           System.out.println(Arr[iCnt]);
       }
    }
    
}
