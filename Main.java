public class Main{

    public static void main(String[] args){

        Company company = new Company("Spin the Wheel", "Chip Manufacture");


        Employee emp1 = new Employee("Yuth", 111);
            emp1.addPositionHistory(new PositionHistory( "1/1/2026"));
            emp1.addPositionHistory(new PositionHistory("Manager", 1200, "1/2/2026"));
            emp1.addPayroll(new PayrollRecord(emp1, 02, 2026));
            emp1.payrollsRecord[emp1.payrollCount -1].addCommision(new Comission("OutStanding", 150, 02, 2026));
            emp1.payrollsRecord[emp1.payrollCount -1].addCommision(new Comission("Good Performance", 0.5, 02, 2026));
    
        Employee emp2 = new Employee("Yuth", 112);
            emp2.addPositionHistory(new PositionHistory("3/2/2026"));
            emp2.addPayroll(new PayrollRecord(emp2, 3, 2026));


        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.displayAllEmployeePayrolls();

        


        
        
        

    }
    
}