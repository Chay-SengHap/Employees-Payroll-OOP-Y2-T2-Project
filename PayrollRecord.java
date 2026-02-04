
public class PayrollRecord{

    double baseSalary;
    int month;
    int year;
    Comission[] comissions;
    int comissionCount;
    
    public PayrollRecord(Employee employee, int month , int year) {
        this.baseSalary = employee.getCurrentSalary();
        this.month = month;
        this.year = year;
        comissions = new Comission[2];
        comissionCount = 0;
    }

    void addCommision(Comission comission){
        if(comissionCount == comissions.length){

            Comission[] temp = new Comission[comissions.length + 1];
            for(int i = 0 ; i < comissionCount ; i++){
                temp[i] = comissions[i];
            }
            comissions = temp;
        }
         comissions[comissionCount++] = comission;

    }

    double getTotalComission(){

        double total = 0;
        if (comissionCount==0) {
            return total;
        }
        
        for(int i = 0 ; i < comissionCount ; i++){
                total += comissions[i].amount;

            
        }
        return total;
    }
    
    double calculateTotalSalary(){
        return baseSalary + getTotalComission();
    }

    @Override
public String toString() {
    return String.format(
        "%02d/%d | Base: $%.2f | Commission: $%.2f | Total: $%.2f",
        month,
        year,
        baseSalary,
        getTotalComission(),
        calculateTotalSalary()
    );
}

    

}