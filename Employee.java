

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
}