import java.lang.*;

class Employee   //class Employee extends Object
{
    public String name;
    public int Salary;

    public Employee(String str, int no)
    {
        this.name=str;
        this.Salary=no;
    }
    public String toString()  //we can write our logic in return but return value must be string
    {
        return "Employee name is:"+name+" having salary"+Salary;
    }
}

public class object1
 {
     public static void main(String[] args) 
     {
      Employee eobj = new Employee("Aniket",11000);   
      System.out.println(eobj.toString());
    
     }
    
}
