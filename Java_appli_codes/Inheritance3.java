import java.lang.*;
//if base class does not cantains deafault cons and contains paraametrised then compiler gives error so to called that parmerised cons explcitly we have to use the concept of super(x,y); to call that constructor
//mutliple inheritance is not allowe in java
class Base
{
    public int i;
    public int j;

    
    public Base(int a,int b)
    {
        System.out.println("Inside base parametrised cons");
        this.i=a;
        this.j=b;
    }
    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base
{
    public int x;
    public int y;
    public Derived()  //Derived :: Base(11,21) //in cpp
    {
        super(11,21);  //1  
        System.out.println("Inside derived constructor");
        this.x=30;
        this.y=40;
    }
    public void sun()
    {
        System.out.println("Inside derived sun");
        System.out.println(super.i);   //2
        super.fun();     //3
    }
}
public class Inheritance3
 {
    public static void main(String a[])
    {
        System.out.println("Inside main");
        Derived dobj = new Derived();
        dobj.sun();
       
        
    }    
}
