import java.lang.*;
// all functions in java are virtual but they are hidden, here it is not necessary to make them virtual explicitly
//methodoverriding in java is same as in c++ but only here not neecsity of using the virtual keyword
class Base
{
    public int i,j;
    public void fun()  //defination
    {
        System.out.println("Inside Base fun");
    }
    public void gun()  //Defination
    {
        System.out.println("Inside base gun");
    }
    public void sun()  //defination
    {
        System.out.println("Inside base sun");
    }
}
class Derived extends Base
{
    public int x,y;
    public void fun()  //overriding
    {
        System.out.println("derived fun");
    }
    public void sun()  //overrriding
    {
        System.out.println("Derived sun");
    }
    public void run()  //defination
    {
        System.out.println("Derived run");
    }

}
public class virtual
{
    public static void main(String a[])
    {
        Base bobj = new Base(); //no casting
        Derived dobj = new Derived(); //no casting

        Base obj =new Derived();  //upcasting
        // Base *bp = new Derived();//c++
        //Derived obj2 = new Base(); //Dowmcasting
        obj.fun();  //derived fun
        obj.gun();  //base gun
        obj.sun();  //derived sun
        //obj.run();

    }
}
