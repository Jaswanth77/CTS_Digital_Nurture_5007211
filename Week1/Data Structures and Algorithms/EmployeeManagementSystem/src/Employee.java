public class Employee {
    int employeeId;
    String name;
    String position;
    int salary;

    public Employee(int employeeId,String name,String position,int salary)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId()
    {
        return this.employeeId;
    }

    public String getName()
    {
        return this.name;
    }

    public String getPosition()
    {
        return this.position;
    }

    public int getSalary()
    {
        return this.salary;
    }

    public String toString()
    {
        return "Employee (employeeId=" + employeeId + ", name=" + name + ", position=" + position + ", salary=" + salary + ")";
    }
}
