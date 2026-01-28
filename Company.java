public class Company {
    String companyName;
    String location;
    Payroll payroll;

    public Company(String companyName , String location , int maxEmployee){
        this.companyName = companyName;
        this.location = location;
        this.payroll = new Payroll(maxEmployee);
    }

    public void hireEmployee(Employee employee){
        System.out.println("Hiring employee: " + employee.name);
        payroll.addNewEmployee(employee);
    }

    
    public void displayCompanyInfo(){
        System.out.println("===== Company Information =====");
        System.out.println("Company: " + companyName);
        System.out.println("Location: " + location);
        System.out.println("Total Employees: " + payroll.totalEmployee);
        System.out.println("Total Payroll: " + calculateTotalPayroll());
        System.out.println("================================");
        payroll.displayAllEmployeePayroll();
    }

    double calculateTotalPayroll(){
        double total = 0;
        for(int i = 0; i < payroll.totalEmployee; i++){
            total += payroll.employees[i].calculateSalary();
        }
        return total;
    }

}
