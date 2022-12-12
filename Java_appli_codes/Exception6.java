import java.lang.*;
import java.util.*;
//print stacktress()  method is use for backtraking the code or debugging in company


//It contains user defined exception
//for creating our own exception we have to create class which gets inherited from Exception class,java is not able to throw the user defined exception object implicitly due to which we have to use throw keyword to throw the object explicitly.
//throw keyword throws the exception imagiatly as genrated.
//thow keyword also used for inbuilt exception but avoid this.
class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
    super(str);
    }
}
public class Exception6
 {
    public static void main(String[] args) 
    {
     
     Scanner sobj=new Scanner(System.in);  
     
     System.out.println("Enter the age");
     int age=sobj.nextInt();

     try
     {
         if(age<18)
         {
             throw new AgeInvalid("Age is below 18");  //here new stands for new object
         }
    }
    catch(AgeInvalid obj)    
        {
             System.out.println("Inside Catch "+obj);
        }
     }
}
//jar ya code madhe age <18 asel tar ageinvalid he exception janar tyachya object madhe "Age is below 18" hi string janar mg te exception catch madhe handel honar ani kay te sysout ne display honar

    /*
     * generic catch block:which can accept any type of exception
     * structure of generic catch block:
     *  try
     * {
     * }
     * catch(ArithmaticException obj)   //specific catch
     * {
     * }
     * catch(ArrayIndexOutOfBounds obj)  //specific catch
     * {
     * }
     * catch(Exception obj)   //generic catch
     * {
     * }
     */

