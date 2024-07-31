public class EmployeeManagement {
    Employee[] employees;
    int size;

    public EmployeeManagement(int capacity)
    {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee)
    {
        if(size < employees.length){
            employees[size++] = employee;
        }
        else{
            System.out.println("Full:Cannot add more values");
        }
    }

    public Employee searchEmployee(int eID)
    {
        for(Employee e:employees)
        {
            if(e.getEmployeeId() == eID){
                return e;
            }
        }
        return null;
    }

    public void traverseEmployee()
    {
        for(Employee e:employees)
        {
            System.out.println(e);
        }
    }

    public void deleteEmployee(int eID)
    {
        for(int i=0;i<size;i++){
            if(employees[i].getEmployeeId() == eID)
            {
                System.out.println("Employee data successfully deleted");
                for(int j=i;j<size-1;j++)
                {
                    employees[j] = employees[j+1];
                }
                employees[--size] = null;
            }
        }
    }
}
