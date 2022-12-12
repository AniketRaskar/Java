import java.lang.*;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

import java.awt.*;
import java.awt.event.*;

class Demo
{
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the first no:");
    int iNo1 = sobj.nextInt();
    System.out.println("Enter the second no:");
    int iNo2 = sobj.nextInt();
    public String DataDe()
    {
        return "Jay Ganesh...";
    }
}

class MarvellousFrame extends WindowAdapter implements ActionListener 
{
    public Frame fobj;
    public Button bobj;
    public TextField tobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        bobj= new Button("Marvellous");
        tobj = new TextField();

        tobj.setBounds(60,60,170,20);
        bobj.setBounds(110,130,90,20);

        fobj.add(bobj);  //tatat wati chamcha bharane
        fobj.add(tobj);

        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        bobj.addActionListener(this);
        fobj.addWindowListener(this); 
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

public class Calculator 
{
    public static void main(String argS[])
    {
        System.out.println("Print the data on concole");
       
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}
//get text method for gettting data
