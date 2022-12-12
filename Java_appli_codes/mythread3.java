import java.lang.*;
//in this class we have implement the runnable interface(if our class is extends some class then at this stitation implement the runnable interface)
class marvellous implements Runnable
{
    public void run()
    {
        System.out.println("Inside thread:"+Thread.currentThread().getName());
    }

}
class mythread3
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