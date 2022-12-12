import java.lang.*;
import java.util.*;
//consider the below programe which contains the division function which may throw arithmatic exception, for handling this we have to use throws keyword
//throws keyword only indicates about the genration of exception.
//So function caller to diviion funcion should be inside try block
//kutra chawel hi ghara baher lawleli pati or construction side war lawleli net
class Demo
{
    public int Division(int no1,int no2)
    throws ArithmeticException
    {
        return no1/no2;
    }
}
public class Exception5
 {
    public static void main(String[] args) 
    {
     
     Scanner sobj=new Scanner(System.in);  
     
     System.out.println("Enter the first index");
     int no1=sobj.nextInt();

     System.out.println("Enter second number");
     int no2 = sobj.nextInt();

     Demo dobj = new Demo();
     try{
     int ret = dobj.Division(no1, no2);
     System.out.println("Division is:"+ret);
     }
     catch(ArithmeticException obj)
     {
         System.out.println("Inside catch");
     }

    }
}
