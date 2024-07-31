public class Main {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(4);

        //Add employees
        management.addEmployee(new Employee(1,"Ram","Assistant Manager",50000));
        management.addEmployee(new Employee(2,"Aswin","Senior developer",45000));
        management.addEmployee(new Employee(3,"Rahul","Junior developer",35000));
        management.addEmployee(new Employee(4,"Kamal","HR",35000));

        //Traverse employee details
        management.traverseEmployee();
        System.out.println();

        //Search with employeeID
        Employee emp=management.searchEmployee(3);
        if(emp == null){
            System.out.println("Employee not found");
        }
        else{
            System.out.println(emp);
        }
        System.out.println();

        //Deleting employee
        management.deleteEmployee(2);

        System.out.println();

        management.traverseEmployee();
    }
}