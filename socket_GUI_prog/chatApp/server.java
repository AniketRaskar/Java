import java.lang.*;
import java.net.*;  //for socket
import java.io.*; //for input output
class server
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Server application is running...");

        String s1,s2;

        ServerSocket ss = new ServerSocket(1100); //server object, dukan ughda,  address 1100 (2048+ ghya)
        Socket s= ss.accept();  //socket conection

        System.out.println("Connection succesful");
        BufferedReader brK =  new BufferedReader(new InputStreamReader(System.in)); //connection with keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));//client bolalela yektoy (server ear)
        PrintStream ps = new PrintStream(s.getOutputStream());////outPut Denari stream (server mouth)
        while((s1=br.readLine())!=null)
        {
            System.out.println("Client Says: "+s1); //client bolalela sang
            System.out.println("Enter message for client : ");
            s2 = brK.readLine(); //keyboard kadun ghe
            ps.println(s2);
        }
        s.close();
        ss.close();
        br.close();
        brK.close();
        ps.close();
    } 
}