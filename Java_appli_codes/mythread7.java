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
    public void DisplayEven()
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
    public marvellous mref;   //composition ,by creating the reference of marvellous

    public Demo(marvellous obj)  //paremerised cons...not copy cons bzc in java there is not copy cons
    {
        this.mref = obj;  //coping data of dobj1 into mref 
    }
    public void run()   
    {
       this.mref.DisplayEven();
    }
}
public class mythread7
 {
    
    public static void main(String arr[]) throws Exception
    {
       marvellous mobj1 = new marvellous(5);
       marvellous mobj2 = new marvellous(8);

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

       t1.join();  //it is used to block the execution of main thread till the execution of child class(t1,t2) gets complete, else if it is not given and while execution main thread excution will complete before the execution of thread gets complete so the child becomes orfend...so it is good programing practise
       t2.join();

       System.out.println("End of main thread");

    }
}
