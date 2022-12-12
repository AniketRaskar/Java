import java.lang.*;  //this comes bydeafault
import java.util.*;
public class input {
   public static void main(String arr[])
   {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Please enter your name:");
       String name = sobj.nextLine();

       System.out.println("Enter your age");
       int Age = sobj.nextInt();

       System.out.println("plz enter your percentage");
       float percentage = sobj.nextFloat();

       System.out.println("Your name is:"+name);
       System.out.println("Your age is:"+Age);
       System.out.println("Your percentage is:"+percentage);
       sobj.close();  //use to deallocate the the use memory

   } 
}
