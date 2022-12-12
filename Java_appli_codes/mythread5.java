import java.lang.*;

class Demo extends Thread
{
    public void run()   //RUnning state
    {
        for(int i=0; i < 10;i++)
        {
            System.out.println("Value of i:"+i);
            try{
            Thread.sleep(5000);  //in milisecnods
            }
            catch(Exception obj)
            {

            }
        }
    }
}
public class mythread5
 {
    
    public static void main(String arr[]) throws Exception
    {
        Demo obj1 = new Demo();
        Thread t1 =new Thread(obj1,"First");  //new state

        Demo obj2 =new Demo();
        Thread t2 = new Thread(obj2,"Second");

        t1.start();  //RUnnable satate

        t1.join();  //t1 samplywar pudachi kam kara
        
        t2.start();

        //Dead state   //here thread ends
    }
}
//join  method is used to block the excution till the specific thread completed it's execution
