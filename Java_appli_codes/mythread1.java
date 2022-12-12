import java.lang.*;
//Single burner chi shegadi ani 2-3 burner chi shegadi it multithreading where gas chi pipe yekach but burner multiple so multiple threads can run.

//OS loves to create the multiple threads at a time not process
//java contains thread class or runnable interface for multithreading
//if our class alredy extends one class then implement the interface or if class in not extending any class then extend the thread class as multiple inheritance is not allowed in java
//callback function:function which is written by the developer by called by the someone else may be OS or JVM OR compiler (main,cons,destructor)
//Every java program contains one thread which main
class mythread1
{
    public static void main(String[] args) 
    {
        System.out.println("Inside main");
        Thread tobj = Thread.currentThread();  // Thread is static

        System.out.println("Name of current thread is:"+tobj.getName());  //getName() is non-static for getting name of thread
    }
}