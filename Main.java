public class Main{

    public static void main(String[] args){

        Company company = new Company("ABA", "TTP", 2);
       
        Employee emp1 = new Employee(1, "SrongChhay", "Junior Full-Stack Dev", 1200d, 150d);
        Employee emp2 = new Employee(2, "Rayuth", "Junior Front-end", 1000d, 100d);

        company.hireEmployee(emp1);
        company.hireEmployee(emp2);
        company.hireEmployee(emp2);
        company.displayCompanyInfo();
        

        

    }
    
}