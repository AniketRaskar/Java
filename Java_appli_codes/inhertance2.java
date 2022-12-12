import java.lang.*;
//In this we have use the super keyword.
//Super keyword is used for 1-to access the characteritcs of base class  2-to acces the behaviour of base class  3- to access the constructor of base class explicitly
//super keyword should be first sentence of the constructor/class.
//super keyword is used for caalling the constructor explicitly, if base class contains deafault cons and parametrised cons then default cons gets called automatically, but if we want to call paraamersied explictly we have to call it by using super keyword ie. super(x,y);
class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside base constructor");
        this.i=10;
        this.j=20;
    }
    public Base(int a,int b)
    {
        System.out.println("Inside Base parametrised cons");
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
    public Derived()
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
public class inhertance2
 {
    public static void main(String a[])
    {
        System.out.println("Inside main");
        Derived dobj = new Derived();
        dobj.sun();
        
    }    
}
//if base class does not cantains deafault cons and contains paraametrised then compiler gives error so to called that parmerised cons explcitly we have to use the concept of super(x,y); to call that constructor
//Super gets used in 3 scenarioes: 1:Super with variable-The scenario occurs when a derived class and base class has same data members.In that case there is possibility of ambiguity, in that concept of super gets used.
//2 Super with methods - same as variables
//3 super with constructor - Super keyword can be used to access the parent class constructor. super can call both parametric cons as well as non-parametric cons depends on situation.
