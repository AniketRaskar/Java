import java.lang.*;

class Demo
{
    public int Arr[];

    public Demo(int size)
    {
        System.out.println("Allocating the resources in constructor");
        this.Arr = new int[size];
    }

    protected void finalize()  //gives warning bcz new versions have removed this method
    {
        System.out.println("Deallocating the resoureces in finalize");   //Don't write SOP in finalize
        this.Arr = null;
    }
}

public class GC {
  public static void main(String arr[])
  {
      Demo dobj = new Demo(10);
      dobj = null;  //j1 na natr chamche ulate karun thewa
      System.gc();  //here gc stands for garbage collector... try to avoid the writing this
      System.out.println("End of main");

  }  
}
//finalize kadhi pn call hote before the main or may be after the main class
