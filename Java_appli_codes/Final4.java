import java.lang.*;
//In this program as Base become final, we can't inherit it but have access the methods of it through Derived class by creating the object of base class in derived class. ie. used it's object as a characteritics of another class.
//creating the object of one class in another is called composition
final class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
}
class Derived
{
    public Base bobj = new Base();   //Composition
    public void gun()
    {
        System.out.println("Derived gun");
    }
    
}
public class Final4
 {
     public static void main(String arr[])
     {
        Derived dobj=new Derived();
        dobj.bobj.fun();
        dobj.gun();

     }
}