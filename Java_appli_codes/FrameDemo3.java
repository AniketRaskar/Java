import java.lang.*;
import java.awt.*;
import java.awt.event.*;  //for windowLisner we require this

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener()); //ghetleli action code la samjanya sathi listner
    }
}
//as window is not reponding or closing we have to close it by using windowClosing() method which is abstract in interface WindowListener, we have to give defination of all that 
class MarvellousListener implements WindowListener
{
   public void windowDeactivated(WindowEvent obj){}  //these are the abstract methods in interface wimdowListener
     
   public void windowActivated(WindowEvent obj){}

   public void windowDeiconified(WindowEvent obj){}

   public void windowIconified(WindowEvent obj){}

   public void windowClosed(WindowEvent obj){}

   public void windowClosing(WindowEvent obj)
   {
       //System.out.println("Inside windowClosing"); //to identify this method for closing the window
       System.exit(0);  //by doing .exit(0)  //window gets closed with clicking on cross
   }

   public void windowOpened(WindowEvent obj){} 
   
}
public class FrameDemo3 
{
    public static void main(String argS[])
    {
        System.out.println("Print the data on concole");
       
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}
/*
 * As progrmaner have to give to definations of all these abstract methods which is problematic for java developer so java have designed some classes which implement these windowlisner interface and had given empty definations of that method, so if programer will extends that class then programer will get that methods directly, and that becomes easy.
 * //in next program applied that
 */
