import java.lang.*;

class marvellous extends Thread
{
    public void run()
    {
        System.out.println("Inside thread:"+Thread.currentThread().getName());
        for(int i=0;i <= 1000;i++)
        {
            System.out.println("Thread Scheduled: "+Thread.currentThread().getName()+":"+i);
        }
    }

}
class mythread4
{
    public static void main(String[] args) 
    {
       marvellous mobj1 = new marvellous();

       Thread t1 = new Thread(mobj1,"first");

       marvellous mobj2 = new marvellous();

       Thread t2 = new Thread(mobj1,"Second");

       t1.start();
       t2.start();
    }
}