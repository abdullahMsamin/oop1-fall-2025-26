class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }
}


class Employee {
    private String employeeName;
    private Position position; 

    public Employee(String employeeName, Position position) {
        this.employeeName = employeeName;
        this.position = position;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Position getPosition() {
        return position;
    }
}


class Company {
    private String companyName;
    private Employee[] employees;
    private int count = 0;

    public Company(String companyName, int numberOfEmployees) {
        this.companyName = companyName;
        employees = new Employee[numberOfEmployees];
    }

    public void addEmployee(Employee emp) {
        if(count < employees.length){
            employees[count] = emp;
            count++;
        } else {
            System.out.println("No more employees can be added.");
        }
    }

    public void showEmployees() {
        System.out.println("Company: " + companyName);
        System.out.println("---- Employee List ----");

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].getEmployeeName() +
                    " | Position: " + employees[i].getPosition().getTitle() +
                    " | Salary: " + employees[i].getPosition().getSalary());
        }
    }
}


public class Task2_FinalTerm {
    public static void main(String[] args) {
                Company company = new Company("TechSoft Ltd", 3);

        Position p1 = new Position("Software Engineer", 75000);
        Employee e1 = new Employee("Samin", p1);

        Position p2 = new Position("Project Manager", 95000);
        Employee e2 = new Employee("Abdullah", p2);

        company.addEmployee(e1);
        company.addEmployee(e2);

        company.showEmployees();
    }
    
}
