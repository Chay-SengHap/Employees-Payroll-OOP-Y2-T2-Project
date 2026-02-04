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

}
