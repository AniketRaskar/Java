import java.lang.*;
//Concept behind final method in java is that we can't override the final method. But if the class in which it is present is inherited then it gets inherited as normal method.
class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    public final void gun()
    {
        System.out.println("Base gun");
    }
}
class Derived extends Base
{
    public void fun()
    {
        System.out.println("Inside derived fun");
    }

    /* public void gun()  //not allowed
    {
        System.out.println("Inside derived gun");
    }
    */
}
public class Final2
 {
     public static void main(String arr[])
     {
         Derived dobj = new Derived();
         dobj.fun();  //Inside derived fun
         dobj.gun(); //Base gun

     }
    
}
