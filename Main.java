public class Main{

    public static void main(String[] args){
       
        Employee emp1 = new Employee(1, "SrongChhay", "Junior Full-Stack Dev", 1200d, 150d);
        Employee emp2 = new Employee(2, "Rayuth", "Junior Front-end", 1000d, 100d);

        emp1.displayInfo();
        emp2.displayInfo();
        Payroll payroll = new Payroll(15);
        payroll.addNewEmployee(emp1);
        payroll.addNewEmployee(emp2);
        payroll.displayAllEmployeePayroll();

    }
    
}