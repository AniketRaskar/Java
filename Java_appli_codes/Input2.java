import java.lang.*;
import java.io.*;
public class Input2 {
    public static void main(String[] args)  {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj =new BufferedReader(iobj);
       try{
       

        System.out.println("Enter your name");
        String name = bobj.readLine();

        System.out.println("Your name is :"+name);
        System.out.println("Enter your age");
        //String sage = bobj.readLine();
        //int age = Integer.parseInt(sage);   //this way is also allowed
        int age= Integer.parseInt(bobj.readLine());
        System.out.println("your age is"+age);
       }
       catch(IOException obj)
       {
           System.out.println("Exception occurs");
       }
       finally
       {
           iobj=null;
           bobj=null;
       }
    }
}
/*
 * readLine method throws the exception, so take the input lines in the try block, and for catching that block take catch block
 * 
 * For conversion of age which is in form string to integer we have use The parsing along with the concept of rapper classs.
 */
