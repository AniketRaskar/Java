import java.util.*;
//Root class of every Exception is Exception 
//by this point "Every exception class in java is derived from Exeption class"


/*
 * for every memory jaga lagate pn pratyek memory madhe resourses asel as nahi
 * Garbage collector firtly removes the memory, but for deallocating the resourses finally block is best bzc garbage collector firstly removes the memory and lastly resourses , it remains there for more time ,so it can generate memory leacage, so use fiannlay
 */
public class Exception2
{
    public static void main(String arr[])
    {
       int ans=0, no1=0, no2=0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter first number");
         no1 = sobj.nextInt();

        System.out.println("Please enter second number");
         no2 = sobj.nextInt();
        try
        {
         ans = no1 / no2;   //Exception prone code
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception occured as:"+obj);
        }
        finally
        {
            sobj.close();
        }
        System.out.println("Division is:"+ans);
    }
    
}
/* 
We have to write the catch block imagiatly after the try block */

/*
 * Following combinatons of of try catch and fianally are allowed:
 * 1:one try block with one catch block
 * 2:one try with one catch one fianally
 * 3:one try with multiple catch
 * 4:one try with multiple catch one finally
 * 5:one try with one finally : but avoid this one form, pn chalat
 * In one application we can write only one finally block
 */