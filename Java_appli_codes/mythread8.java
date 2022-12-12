import java.lang.*;
import java.util.*;

class marvellous
{
    public int Arr[];

    public marvellous(int size)
    {
        Arr = new int[size];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter numbers:");

        for(int i= 0;i< this.Arr.length;i++)
        {
            this.Arr[i]=sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Data from array is:");
        for(int i= 0;i< this.Arr.length;i++)
        {
           System.out.println(this.Arr[i]);
        }
    
    } 
    synchronized public void DisplayEven()  //here this function becomes synchronised
    {
        for(int i=0; i< this.Arr.length;i++)
        {
            if(this.Arr[i]%2 ==0)
            {
                System.out.println(this.Arr[i]);
            }
        }
    }  
} 
class Demo extends Thread
{
    public marvellous mref;

    public Demo(marvellous obj)
    {
        this.mref = obj;
    }
    public void run()   
    {
       this.mref.DisplayEven();
    }
}
public class mythread8
 {
    
    public static void main(String arr[]) throws Exception
    {
       marvellous mobj1 = new marvellous(5);marvellous mobj2 = new marvellous(4);

       mobj1.Accept();
       mobj1.Display();

       mobj2.Accept();
       mobj2.Display();

       Demo dobj1 = new Demo(mobj1);
       Demo dobj2 = new Demo(mobj2);

       Thread t1 = new Thread(dobj1);
       Thread t2 = new Thread(dobj2);

       t1.start();
       t2.start();

       t1.join();
       t2.join();

       System.out.println("End of main thread");

    }
}
//string buffer is synchronised while string builder is not synchronised
//mall chya samor asnara watchmen so the changing gets in synchronised manner, it is synchronisation
//synchronised is achived by making the function synchronized only