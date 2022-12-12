import java.lang.*;
//characteritics of interface are Internlly,public,static,final and methods are public abstract
//behaviours of interface are public and abstract
interface Circle
{
    float PI = 3.14f;  //Internlly public static final PI=3.14f;
    
    float CalculateArea(float Radius);  //public abstract float CalculateArea(float Radius);
    float CalculateCircumference(float Radius);//public abstract float CalculateCircumference(float Radius);
}

class Area implements Circle
{
    public float CalculateArea(float Radius)
    {
        return (PI*Radius*Radius);
    }

    public float CalculateCircumference(float Radius)
    {
        return (2 * PI * Radius);
    }
}
public class Interface1 {
    public static void main(String arr[])
    {
     System.out.println("Value of PI is:"+Circle.PI);  //can accsed via class name so it is static
     //Circle.PI = 6.14;  //can't change as being final
      Area obj = new Area();
      float fRet = 0.0f;
      
      fRet = obj.CalculateArea(10.5f);
      System.out.println("Area is:"+fRet);

      fRet = obj.CalculateCircumference(10.5f);
      System.out.println("Circumfernece is:"+fRet);
    }
    
}
