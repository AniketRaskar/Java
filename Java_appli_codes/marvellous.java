import java.lang.*;

//In this program we have created a class Demo with one default constructor and one parametrised constrctor.
//in this contains two characteritics i &j  so it will get 8 bytes of memory, it contains two behaviour fun(), gun().
class Demo
{
    public int i;
    public int j;

    Demo()
    {
        this.i=0;
        this.j=0;
    }
    Demo(int x, int y)
    {
        this.i=x;
        this.j=y;
    }

    public void fun()
    {
        System.out.println("Inside demo fun");
    }
    public void gun()
    {
        System.out.println("Inside demo gun");
    }
}
public class marvellous 
{
    public static void main(String arr[])
    {
        System.out.println("Inside main");
        Demo obj = new Demo();
        obj.fun();
        obj.gun();
        System.out.println(obj.i);

        Demo objx = new Demo(11,21);
        objx.fun();
        objx.gun();
        System.out.println(objx.i);
        System.out.println(objx.j);

    }
}
