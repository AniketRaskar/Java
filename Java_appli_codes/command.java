//Accept 2 no from user through command line display its addition
import java.lang.*;

public class command
 {
     public static void main(String Arg[]) 
    {
    System.out.println("NUmber of command line arguments are:"+Arg.length);
    System.out.println("First number is: "+Arg[0]);
    System.out.println("Second number is: "+Arg[1]); 
    
    int ans = Integer.parseInt(Arg[0]) + Integer.parseInt(Arg[1]);
    System.out.println("Addition is:"+ans);
    }
    
}
//javac command.java
//java command 10 11


