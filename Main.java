public class Main{

    public static void main(String[] args){
        Employee emp4 = new Employee(4, "Alice", "Developer", 2500d, 100d);
        Payroll payroll = new Payroll();
        payroll.addNewEmployee(emp4);
        payroll.addNewEmployee(new Employee(5, "John Doe", "Senior Developer", 3000d, 150d));
        payroll.addNewEmployee(new Employee());
        payroll.displayAllEmployeePayroll();

    }
    
}