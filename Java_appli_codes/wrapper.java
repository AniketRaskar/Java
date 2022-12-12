import java.io.*;
public class wrapper {
    public static void main(String[] args)
    throws IOException {
      
        int no=11;
        Integer iobj = new Integer(11);

        int i = iobj;  //Unboxing    //primitive datatype i la integer chya box madhun baher kadne.

        Integer p = no; //Boxing   //primitive datatype p la integer chya box madhe thewane
        System.out.println(no);
        System.out.println(iobj);
        System.out.println(i);
        System.out.println(p);
    }
    
}
//Wapper class wraps a primitive data type value into the object of wrapper class.
//converting primitive data type value into it's corresponding wrapper class is called Boxing.
//Conversion of wrapper class into it's primitive data type is called Unboxing.