import java.lang.*;
//In this code we have extend the thread class
//thread is a class which contains one abstract one method run
//this program conatains 3 threads first,second and main
//get name method for taking name of existing threas and setthread() for giving name to thread
//currentThread() ->for getting reference of current executing thread
class marvellous extends Thread
{
    public void run()   //this method is abstract method in thread class and public which returns nothing and also callback method
    {
        System.out.println("Inside thread:"+Thread.currentThread().getName());
    }

}
class mythread2
{
    public static void main(String[] args) 
    {
       marvellous mobj1 = new marvellous();

       Thread t1 = new Thread(mobj1,"first");  //here the name of thread first is optional for thread class,ie.thread class contains one deafault cons also

       marvellous mobj2 = new marvellous();

       Thread t2 = new Thread(mobj1,"Second");

       t1.start();
       t2.start();
    }
}
//start method thread shedule karte run method run hote
//thread shedular -doctor kadchi sundar receptionit ji pationent la yek yek pathawate jar konala jast lagale asel tyala agodar pathawte tasach ikad thread shedular thread shedule karto which is maintained by JVM