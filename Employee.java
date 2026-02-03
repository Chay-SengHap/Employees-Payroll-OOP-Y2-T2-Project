
public class Employee {

    static int employeeCount = 0;
    String name;
    int companyEmpId;
    int nationalId;
    PositionHistory[] positionsHistory;
    PayrollRecord[] payrolls;
    int positionCount;
    int payrollCount;

   
    
    
    public Employee(String name, int nationalId) {
        employeeCount++;
        companyEmpId  = employeeCount;
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




    
}