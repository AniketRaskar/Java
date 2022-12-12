import java.lang.*;
import java.io.*;
//for accepting the input from user by BufferReader import the pacakage java.io.*;
public class Input1 {
    public static void main(String[] args) throws IOException {
       
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj =new BufferedReader(iobj);

        System.out.println("Enter your name");
        String name = bobj.readLine();

        System.out.println("Your name is :"+name);
    }
}
//By using the inputStream reader we takes the input from keyboard conneting it with keyboard,then in class bufferreader contains one method as readLine,which accepts the input in the String format only,after that if we have to convert that string to to another datatypes we have to use the concept of wrapper classes.


//in this application for handling the error we have taken throws IOException, which is generic