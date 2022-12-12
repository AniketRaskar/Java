import java.lang.*;

class Arithmatic
{
    public int No1;
    public int No2;

    Arithmatic(int a,int b)
    {
        No1= a;
        No2 = b;
    }
    public int Addition(int No1,int No2)
    {
        int Ans=0;
        Ans = No1+No2;
        return Ans;
    }

}

class specificOOP
{
    public static void main(String arg[])
    {
        Arithmatic obj = new Arithmatic(10,11);
        int ret =0;
        ret = obj.Addition(10,11);
        System.out.println("Addition is:"+ret);
    }
}