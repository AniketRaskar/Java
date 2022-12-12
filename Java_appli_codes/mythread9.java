import java.lang.*;

class marvellous extends Thread
{
    public void run()
    {
        System.out.println("Inside thread:"+Thread.currentThread().getName());
        System.out.println("Thread priority is:"+Thread.currentThread().getPriority());
       
    }

}
class mythread9
{
    public static void main(String[] args) 
    {
        System.out.println("Main thread proiority:"+Thread.currentThread().getName());
       marvellous mobj1 = new marvellous();

       Thread t1 = new Thread(mobj1,"first");

       marvellous mobj2 = new marvellous();

       Thread t2 = new Thread(mobj1,"Second");

       t1.setPriority(10);  //default priority is 5 if we commet this two lines then this will give default 5 as priority
       t2.setPriority(2);

       t1.start();
       t2.start();
    }
}