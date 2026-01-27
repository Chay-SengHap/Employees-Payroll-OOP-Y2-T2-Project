
import java.util.ArrayList;

public class Payroll{

    public ArrayList<Employee>employees;

    public Payroll(){
        employees = new ArrayList<>();
        employees.add(new Employee(1 , "Sorayuth" ,"Junior Front-End" , 1200d , 20d));
        employees.add(new Employee(2 , "SrongChhay" ,"Junior Back-End" , 1500d , 40d));
        employees.add(new Employee(3 , "Senghap" ,"Junior Full-Stack" , 2000d , 100d));
    }

    public void addNewEmployee(Employee employee){
        employees.add(employee);
    }

    public void displayAllEmployeePayroll(){
        System.out.println("=====Display All Employees Infomation=====");
        for(Employee employee : employees){
            employee.displayInfo();
        }
        System.out.println("==========================================");
    }

}