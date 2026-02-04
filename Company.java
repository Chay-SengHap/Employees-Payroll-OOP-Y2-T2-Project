import java.util.Arrays;

public class Company {
    String companyName;
    String industry;
    Employee[] employees;
    int employeeCount;


    public Company(String companyName , String industry){
        this.companyName = companyName;
        this.industry = industry;
        employees = new Employee[10];
        employeeCount = 0 ;
       
    }
    void addEmployee(Employee employee){
        for(int i = 0 ; i < employeeCount ; i++){
            if (employees[i].equals(employee)) {
                System.out.println("Employee already exists: " + employee.name);
                return;
            }
        }
        if (employeeCount == employees.length) {
            Employee[] temp = new Employee[employees.length + 2];
            for (int i = 0 ; i < employeeCount ; i++){
                temp[i] = employees[i];
            }
            employees = temp;
        }
        employees[employeeCount++] = employee;
    }

    void displayAllEmployeePayrolls(){
        for(int i = 0 ; i < employeeCount ; i++){
            employees[i].display();
        }
    }
    
    @Override
    public String toString() {
        return "Company [companyName=" + companyName + ", industry=" + industry + ", employees="
                + Arrays.toString(employees) + ", employeeCount=" + employeeCount + "]";
    }

    

}
