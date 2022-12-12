import java.lang.*;
// It is better if we intialise the final characteritics just after the declarations,or we can intialise it inside the constructor.
//In java it is alloed to initialize the final characteritics inside the constructor
class Demo
{
    public int i;
    public final int j =20;
    public final int k;

    public Demo()
    {
        this.i=10;
        this.k=30;

    }

    public Demo(int i,int k)
    {
        this.i=i;
        this.k=k;
    }
   

    public void fun()
    {
        i++;  //NA
        //j++;  //NA
        //k++;  /NA
    }
}

public class Final1 
{
    public static void main(String arr[])
    {
        Demo obj1 = new Demo();
        obj1.fun();
        System.out.println(obj1.i);  //11
        System.out.println(obj1.j);  //20
        System.out.println(obj1.k); //30
        Demo obj2 = new Demo(11,21);
        obj2.fun();
        System.out.println(obj2.i); //12
        System.out.println(obj2.j); //20
        System.out.println(obj2.k); //21


    }
    
}
