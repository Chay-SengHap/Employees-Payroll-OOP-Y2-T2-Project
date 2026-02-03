public class PositionHistory {
    String position;
    double baseSalary;
    String startDate;  
    String endDate;  //// unknow
  

    public PositionHistory(String position, double baseSalary, String startDate) {
        this.position = position;
        this.baseSalary = baseSalary;
        this.startDate = startDate;
        this.endDate = "Unknown";
    }

    public String getStartDate(){
        return startDate;
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    

    

}
