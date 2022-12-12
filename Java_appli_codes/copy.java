import java.lang.*;

//
class Employee implements Cloneable
{
    public int EID;
    public String Ename;
    public int ESalary;

    public Employee(int id,String str,int no)
    {
        this.EID = id;
        this.Ename = str;
        this.ESalary = no;
    }
    //ase class ki jyanchi java la copy karu dyaychi nahi tyaweles khalil exception 
    //abstract method in cloneable interface
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();  //generic in nature as returning object class madhlya clone madhli return value
    }
}
public class copy {
    public static void main(String[] args) throws Exception
    {
        Employee eobj = new Employee(11,"Aniket",21000);
        System.out.println("EID: "+eobj.EID+"Name: "+eobj.Ename+"Salary: "+eobj.ESalary);

        Employee eobjx = (Employee)eobj.clone();  //making clone object of eobj, object chi xerox kadun thewane
        System.out.println("EID: "+eobjx.EID+"Name: "+eobjx.Ename+"Salary: "+eobjx.ESalary);
        
        eobj.Ename = "Shubham";  //after making changes in original object, there are not changes in it's clone so it's deep copy 
        System.out.println("EID: "+eobjx.EID+"Name: "+eobjx.Ename+"Salary: "+eobjx.ESalary);
    }
}
