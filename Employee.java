public class Employee {

    static int employeeCount = 0;

    String name;
    int companyEmpId;
    int nationalId;

    PositionHistory[] positionsHistory;
    PayrollRecord[] payrollsRecord;

    int positionCount;
    int payrollCount;

    public Employee(String name, int nationalId) {
        employeeCount++;
        this.companyEmpId = employeeCount;
        this.name = name;
        this.nationalId = nationalId;

        positionsHistory = new PositionHistory[2];
        payrollsRecord = new PayrollRecord[12];

        positionCount = 0;
        payrollCount = 0;
    }

    public void addPositionHistory(PositionHistory p) {
        if (positionCount > 0) {
            positionsHistory[positionCount - 1]
                    .setEndDate(p.getStartDate());
        }
        positionsHistory[positionCount] = p;
        positionCount++;
    }

    public PositionHistory getCurrentPosition() {
        if (positionCount > 0) {
            return positionsHistory[positionCount - 1];
        }
        return null;
    }

    void addPayroll(PayrollRecord payroll){
        if(payrollCount == payrollsRecord.length){

            PayrollRecord[] temp = new PayrollRecord[payrollsRecord.length * 2];
            for(int i = 0 ; i < payrollCount ; i++){
                temp[i] = payrollsRecord[i];
            }
            payrollsRecord = temp;
        }
         payrollsRecord[payrollCount++] = payroll;

    }

    public void display() {
        System.out.println("=================================");
        System.out.println("Employee ID   : " + companyEmpId);
        System.out.println("Name          : " + name);
        System.out.println("National ID   : " + nationalId);

        System.out.println("Current Position:");
        for(PositionHistory i : positionsHistory){

            if (i != null) {
                System.out.println(i.toString());
            } else {
                System.out.println("  None");
            }
        }

        System.out.println("Payroll Records: " + payrollCount);
        if (payrollCount > 0) {
            for (int i = 0; i < payrollCount; i++) {
                System.out.println("  Payroll " + (i + 1) + ": " + payrollsRecord[i]);
            }
        } else {
            System.out.println("  No payroll records");
        }

        System.out.println("=================================");
    }
}
