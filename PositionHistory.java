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

    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return position +
               " | Salary: $" + baseSalary +
               " | " + startDate + " - " + endDate;
    }
}
