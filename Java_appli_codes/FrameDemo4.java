import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener()); 
    }
}
class MarvellousListener extends WindowAdapter//this WindowAdapter is the inbuilt class which contain the empty methods in it so we don't neccerry to gives defination of it
{
   public void windowClosing(WindowEvent obj)
   {
       
       System.exit(0); 
   }
   
}
public class FrameDemo4 
{
    public static void main(String argS[])
    {
        System.out.println("Print the data on concole");
       
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}
