import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Demo
{
    public String DataDe()
    {
        return "Jay Ganesh...";
    }
}

class MarvellousFrame extends WindowAdapter implements ActionListener 
{
    public Frame fobj;  //tat
    public Button bobj;
    public TextField tobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        bobj= new Button("Marvellous");
        tobj = new TextField();

        tobj.setBounds(60,60,70,20);
        bobj.setBounds(110,130,90,20);

        fobj.add(bobj);  //tatat wati chamcha bharane
        fobj.add(tobj);

        fobj.setSize(600,600); //tatachi size
        fobj.setVisible(true);  //tat disnyasathi
        fobj.setLayout(null);  //tatala kuthalahi layout nahi

        bobj.addActionListener(this); //button na warchi action listen karnyasathi
        fobj.addWindowListener(this);  //window band karnyasathi lisner
    }
    public void windowClosing(WindowEvent obj)
   {
       
       System.exit(0); 
   }
   public void actionPerformed(ActionEvent obj)
   {
       Demo dobj = new Demo();
       String str = dobj.DataDe();
        tobj.setText(str);
   }
}

public class FrameDemo5 
{
    public static void main(String argS[])
    {
        System.out.println("Print the data on concole");
       
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}
