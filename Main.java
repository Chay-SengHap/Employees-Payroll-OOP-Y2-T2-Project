public class Main{

    public static void main(String[] args){
        
        Employee emp1 = new Employee("Yuth", 111);
        emp1.addPositionHistory(new PositionHistory("Manager", 1200, "1/1/2026"));
        Employee emp2 = new Employee("Chhay", 112);
        emp2.addPositionHistory(new PositionHistory("Manager", 1200, "1/1/2026"));

        
        System.out.println(emp1.companyEmpId);
        System.out.println(emp2.companyEmpId);
        

        

    }
    
}