import java.lang.*;
//by this we can fetch the information of any class
class Demo
{

}
public class classInfo
{
  public static void main(String[] args) 
  {
    Demo obj = new Demo();
    
    Class cref = obj.getClass();
    System.out.println("Class name of obj is:"+cref.getName());
    String str = "Marvellous";
    Class cref1 = str.getClass();
    System.out.println("Class name of string is :"+cref1.getName());
  }  
}
