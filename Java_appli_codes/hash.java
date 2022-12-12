import java.lang.*;

class Demo
{

}


public class hash {
    public static void main(String[] args) {
        String str1 ="Marvellous";  //these are string literals which will share the hashcode if strings are same.
        String str2 ="Marvellous";
        String str3 ="Infosystm";

        Demo dobj = new Demo();

        System.out.println("Hashcode of str1:"+str1.hashCode());
        System.out.println("Hashcode of str1:"+str2.hashCode());
        System.out.println("Hashcode of str1:"+str3.hashCode());
        System.out.println("Hashcode of str1:"+dobj.hashCode());
    }
}
