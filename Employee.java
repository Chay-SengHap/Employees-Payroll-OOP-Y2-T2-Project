<<<<<<< HEAD


public class Employee {

    String name;
    int id;
    String position;
    Double baseSalary;
    Double bonus;
    
    public Employee(int id ,String name, String position, Double baseSalary, Double bonus){
        this.name = name;
        this.id = id;
        this.position = position;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    void displayInfo(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Position: "+ position);
        System.out.println("Salary: $"+ baseSalary);
        System.out.println("Bonus: $"+ bonus);
        System.out.println("Total: $"+ calculateSalary());

       
    }

    double calculateSalary(){
        return baseSalary+ bonus;
    }
=======

public class Employee {

    String name;
    String companyEmpId;
    int nationalId;
    PositionHistory[] positionsHistory;
    PayrollRecord[] payrolls;
    int positionCount;
    int payrollCount;
    
    
    public Employee(String name, int nationalId) {
        this.name = name;
        this.nationalId = nationalId;
        positionsHistory = new PositionHistory[2];
        payrolls = new PayrollRecord[6];
        positionCount = 0;
        payrollCount = 0;
    }

    public void addPositionHistory(PositionHistory p){

        if (positionCount > 0) {
        positionsHistory[positionCount - 1].setEndDate(p.getStartDate());
        }
        positionsHistory[positionCount++] = p;
    }
    public PositionHistory getCurrentPosition(){
        return positionsHistory[positionCount -1 ];
    }

    public void addPayroll(PayrollRecord payroll){
        payrolls[payrollCount] = payroll;
        payrollCount++;
    }




    
>>>>>>> e1817e49ab28d3d358a09fd8991f676e23805ac3
}