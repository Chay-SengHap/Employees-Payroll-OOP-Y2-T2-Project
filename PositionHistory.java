public class PositionHistory {

    String position;
    double baseSalary;
    String startDate;
    String endDate;

    public PositionHistory(String position, double baseSalary, String startDate) {
        this.position = position;
        this.baseSalary = baseSalary;
        this.startDate = startDate;
        this.endDate = "Now";
    }
    public PositionHistory(String startDate){
        this.position = "Staff";
        this.baseSalary = 500;
        this.startDate = startDate;
        this.endDate = "Now";

    }


    @Override
    public String toString() {
        return position +
               " | Salary: $" + baseSalary +
               " | " + startDate + " - " + endDate;
    }
}
