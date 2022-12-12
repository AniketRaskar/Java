//concept of method overloading is same as in cpp
import java.lang.*;
class Demo
{
    public int Add(int i,int j)
    {
        return i+j;
    }
    public int Add(int i,int j,int k)
    {
        return i+j+k;
    }
    public int Add(int i,int j,int k,int z)
    {
        return i+j+k+z;
    }
    
}
public class overloading
{
  public static void main(String a[])
  {
      Demo obj = new Demo();

  }  
}
