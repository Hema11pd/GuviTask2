package GuviTask2;

public class Employee extends Person{
    int employeeId;
    double salary;


    public Employee(int age, String name,int employeeId,double salary) {
        super(age, name);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayEmployee()
    {
        super.display();
        System.out.print("EmployeeId: "+employeeId+
                 " salary: "+salary);
    }
    public static void main(String[] args)
    {
       Employee employee = new Employee(17,"Hema",666666,80000);
       employee.displayEmployee();
    }
}
