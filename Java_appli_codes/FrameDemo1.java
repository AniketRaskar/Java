import java.lang.*;
import java.awt.*;

public class FrameDemo1 
{
    public static void main(String argS[])
    {
        System.out.println("Print the data on concole");
        Frame fobj = new Frame("Marvellous");
        fobj.setSize(400,400);  //In pixels
        fobj.setVisible(true);
    }
}
