
public class Payroll{

    public Employee[] employees;
    public int totalEmployee;

    public Payroll(){
        this(10);
    }

    public Payroll(int maxEmployee){
        employees = new Employee[maxEmployee];
        totalEmployee = 0;
    }

    

    public void addNewEmployee(Employee employee){
        if (employees == null) {
            System.out.println("Cannot Added Null Employee");
            return;
        }
        
        if(totalEmployee < employees.length){
            employees[totalEmployee] = employee;
            totalEmployee++;
        }else{
            System.out.println("Cannot hire more employees");
        }
    }

    public void displayAllEmployeePayroll(){
        System.out.println("=====Display All Employees Infomation=====");
        for(int i = 0 ; i < totalEmployee ; i++){
            employees[i].displayInfo();
            System.out.println("------------------------------------------");
        }
        System.out.println("==========================================");
    }

}