import java.lang.*;

//concept of purevirtual is same in java named as abstract, but here for class also we have to write abstract keyword
//abstract class in java such a classs which contains 0 or more abstract methods in it
//in java for abstract class also we have to use abstract keyword in the prototype
//we can't create a object of abstract of abstract class as VTABLE of abstract class is incomlete
abstract class Demo
{
    public int i,j;
    public Demo()
    {
        System.out.println("Demo constructor");
    }
    public void fun()  //Concrete
    {
        System.out.println("Demo fun");
    }
    public abstract void gun();  //abstract     (pureVirtual-  virtual void gun()=0; in c++)
}
class Hello extends Demo
{
    public int x,y;
    public Hello()
    {
        System.out.println("Hello constructor");
    }
    public void sun()  //Concrete
    {
        System.out.println("Hello sun");
    }
    public void gun()  //abstract chi concrete
    {
        System.out.println("Hello gun");
    }
}   
public class AbstractDemo1
 {
     public static void main(String arr[])
     {
        Hello hobj = new Hello();
       // Demo dobj =new Demo();
        hobj.fun();
        hobj.gun();
        hobj.sun();
     }
    
}
