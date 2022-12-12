import java.lang.*;
//Static in java is same like concept of static in c++.
//Static method block can access only static characteritcs,non static can access both static as well as non static charactritics.

//In this program we have created static block.
//static block starts with the static keyword, which gets executed imagiatly when the class file gets loaded in the memory, before the constructor call. It gets executed only once.It is use to initialise the static characteritics of a class.
//static block gets executed before the main fuction.
class Demo
{
    public int i;
    public int j;
    public static int k;

    static
    {
        System.out.println("Inside static block");
        k=11;
    }
    public Demo()
    {
        System.out.println("Inside construcctor");
        this.i=0;
        this.j=0;

    }
    public void fun()
    {
        System.out.println("Inside nonstatic fun");
        System.out.println(this.i);
        System.out.println(this.j);
        System.out.println(this.k);
    }
    public static void gun()
    {
        System.out.println("Inside satatic gun");
        System.out.println(k);
        //System.out.println(i);   //non-accesible
    }
}

class StaticDemo
{
    static
    {
        System.out.println("I am first");
    }    //static block gets called first before main function, but it is destructive so avoid it
    
    public static void main(String a[])
    {
        Demo.gun();
        
        Demo obj;
        obj = new Demo();
       /* obj.fun();

        System.out.println(obj.i);
        System.out.println(obj.j); */
        
    }
}
//in this function first static block gets called ,then static method gets called ie.gun() after this constructor gets called.