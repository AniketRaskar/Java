import java.lang.*;
//as java is dyanamic in nature memory allocation for array is trictly dyanamic in nature
public class Array 
{
    public static void main(String arg[])
    {
        int iCnt=0;
        int arr[] = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        System.out.println("Size of array is:"+arr.length);   //length is the property for array in java
        System.out.println("Elements of array are:"+arr);  //here arr is the hashcode of array(similar to base address)

        System.out.println("Data by for loop");

        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            System.out.println(arr[iCnt]);
        }

        System.out.println("Data by while loop");
        iCnt=0;
        while(iCnt<arr.length)
        {
            System.out.println(arr[iCnt]);
            iCnt++;
        }

        System.out.println("Data by for each loop");
        for(int no:arr)  //after colon aperator give list name ,array is also list,here no is not the index, it i use to access the data from the list(better used in hashmap,hashset)
        {
            System.out.println(no);
        }
        
    }
    
}
