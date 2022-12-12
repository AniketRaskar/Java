import java.io.*;

public class Input3 {
   public static void main(String[] args) throws IOException {
       InputStreamReader iobj= new InputStreamReader(System.in);
       BufferedReader bobj = new BufferedReader(iobj);

       System.out.println("Enter string");
       String str=bobj.readLine();

       System.out.println("Enter Integer");
       int no =Integer.parseInt(bobj.readLine());

       System.out.println("Enter float");
       float f = Float.parseFloat(bobj.readLine());

       System.out.println("Enter double");
       double d= Double.parseDouble(bobj.readLine());

       System.out.println("Enter string is:"+str);
       System.out.println("Enter integer is:"+no);
       System.out.println("Enter float is:"+f);
       System.out.println("Enter double is:"+d);

   } 
}
