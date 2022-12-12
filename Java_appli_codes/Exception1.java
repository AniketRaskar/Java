import java.util.*;
//this example contains uncheaked exception which ie not neccesssary to cheak everytime
//it is like helmet sakti in pune which is not compulsary,but in goa there is cheaked exception where helmet is compulsary
public class Exception1
{
    public static void main(String arr[])
    {
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter first number");
        int no1 = sobj.nextInt();

        System.out.println("Please enter second number");
        int no2 = sobj.nextInt();

        int ans = no1 / no2;

        System.out.println("Division is:"+ans);
        sobj.close();
    }
    
}
