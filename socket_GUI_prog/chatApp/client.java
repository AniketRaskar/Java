import java.lang.*;
import java.net.*;
import java.io.*;
class client
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Client application is running...");

        String s1,s2; //string reference


        Socket s = new Socket   ("localhost",1100);  //IP address,port no (bank cha address,maneger cha port no) custmoer gele


        BufferedReader brK =  new BufferedReader(new InputStreamReader(System.in));  //keyboard input
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream())); //server ch yektoy(client ear)
        PrintStream ps = new PrintStream(s.getOutputStream());//outPut Denari stream (client mouth)
        while(!(s1 = brK.readLine()).equals("gn"))
        {
            ps.println(s1); //adhi tu bol
            s2 = br.readLine();
            System.out.println("Server says:"+s2);
            System.out.println("Enter message for server: ");
        }
        s.close();
        //bcz here is not serverSocket Connection so empty
        br.close();
        brK.close();
        ps.close();
    }
}