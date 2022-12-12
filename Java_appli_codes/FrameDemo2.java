import java.lang.*;
import java.awt.*;

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);  //for display the window
    }
}
public class FrameDemo2 
{
    public static void main(String argS[])
    {
        System.out.println("Print the data on concole");
       
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}
