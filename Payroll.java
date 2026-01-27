
import java.util.ArrayList;

public class Payroll{

    public ArrayList<Employee>employees;

    public Payroll(){
        employees = new ArrayList<>();
        employees.add(new Employee(1 , "Sorayuth" ,"Junior Front-End" , 1200 , 20));
        employees.add(new Employee(2 , "SrongChhay" ,"Junior Back-End" , 1500 , 40));
        employees.add(new Employee(3 , "Senghap" ,"Junior Full-Stack" , 2000 , 100));
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