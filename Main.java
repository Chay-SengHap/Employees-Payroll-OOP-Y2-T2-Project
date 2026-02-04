public class Main{

    public static void main(String[] args){
        
        Employee emp1 = new Employee("Yuth", 111);
        emp1.addPositionHistory(new PositionHistory("Staff", 100, "1/1/2026"));
        emp1.addPositionHistory(new PositionHistory("Manager", 1200, "1/2/2026"));
        emp1.addPayroll(new PayrollRecord(emp1.getCurrentPosition().baseSalary, 02, 2026));

        emp1.payrollsRecord[0].addCommision(new Comission("OutStanding", 150, 02, 2026));
        emp1.payrollsRecord[0].addCommision(new Comission("sava", 0.5, 02, 2026));
        emp1.addPayroll(new PayrollRecord(emp1.getCurrentPosition().baseSalary, 03, 2026));
        emp1.payrollsRecord[1].addCommision(new Comission("Smos", 100, 03, 2026));
        
        emp1.addPayroll(new PayrollRecord(emp1.getCurrentPosition().baseSalary, 04, 2026));
        emp1.payrollsRecord[2].addCommision(new Comission("Smos", 100, 03, 2026));
        emp1.payrollsRecord[2].addCommision(new Comission("Sad", 1500, 03, 2026));
        emp1.payrollsRecord[2].addCommision(new Comission("Smos", 100, 03, 2026));
        emp1.payrollsRecord[2].addCommision(new Comission("Sad", 300, 03, 2026));


        
        System.out.println(emp1.companyEmpId);
        emp1.display();
       



        

        

    }
    
}