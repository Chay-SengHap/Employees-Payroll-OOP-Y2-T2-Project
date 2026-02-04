public class Main{

    public static void main(String[] args){
        Company company = new Company("Spin the Wheel", "Chip Manufacture");
        Employee emp1 = new Employee("Yuth", 111);
        emp1.addPositionHistory(new PositionHistory("Staff", 100, "1/1/2026"));
        emp1.addPositionHistory(new PositionHistory("Manager", 1200, "1/2/2026"));
        emp1.addPayroll(new PayrollRecord(emp1, 02, 2026));

        emp1.payrollsRecord[0].addCommision(new Comission("OutStanding", 150, 02, 2026));
        emp1.payrollsRecord[0].addCommision(new Comission("sava", 0.5, 02, 2026));
        emp1.addPayroll(new PayrollRecord(emp1, 03, 2026));
        emp1.payrollsRecord[1].addCommision(new Comission("Smos", 100, 03, 2026));
        
        emp1.addPayroll(new PayrollRecord(emp1 , 04, 2026));
        emp1.payrollsRecord[2].addCommision(new Comission("Smos", 100, 03, 2026));
        emp1.payrollsRecord[2].addCommision(new Comission("Sad", 1500, 03, 2026));
        emp1.payrollsRecord[2].addCommision(new Comission("Smos", 100, 03, 2026));
        emp1.payrollsRecord[emp1.payrollCount - 1].addCommision(new Comission("Sad", 300, 03, 2026));

        emp1.addPayroll(new PayrollRecord(emp1, 10, 2002));
        emp1.addPositionHistory(new PositionHistory("Manager", 3000, "2/5/2029"));
        emp1.addPayroll(new PayrollRecord(emp1, 02,2030));
        emp1.payrollsRecord[emp1.payrollCount - 1].addCommision(new Comission("Big", 5000, 02, 2030));
        
        emp1.addPositionHistory(new PositionHistory("Manager", 3000, "2/7/2029"));
        emp1.addPositionHistory(new PositionHistory("Manager", 3000, "2/9/2029"));

        company.addEmployee(emp1);
        company.displayAllEmployeePayrolls();

        


        
        System.out.println("===== F1: Primitive Copy =====");
        int salary1 = 1000;
        int salary2 = salary1;   // primitive copy

        salary2 = 2000;          // change copy

        System.out.println("salary1 (original): " + salary1);
        System.out.println("salary2 (copy): " + salary2);



        System.out.println("\n===== F2: Reference Copy =====");
        Employee emp2 = emp1;
        emp2.name = "Not Yuth";

        System.out.println("emp1 name: " + emp1.name);
        System.out.println("emp2 name: " + emp2.name);
        

    }
    
}