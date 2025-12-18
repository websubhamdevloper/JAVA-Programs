import java.util.ArrayList;
import java.util.List;

class Employee{
    public String name, id;
    public double hoursWorked, hourlyRate;

    Employee(String name, String id, double hoursWorked, double hourlyRate){
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        if (hoursWorked <= 40){
            return hoursWorked * hourlyRate;
        }
        else{
            double overtimeHours = hoursWorked - 40;
            return (40 * hourlyRate) + (overtimeHours  * hourlyRate * 1.5);
        }
    }

}


public class EmployeePayRoll {
    List<Employee> employee = new ArrayList<>();

    public void addEmployee(Employee emp){
            employee.add(emp);
    }

    public void displayPayrollReport(){
        System.out.println("-> Employees PayRoll Report <-");
        double totalPayroll = 0;
        for(Employee emp : employee){
            double salary = emp.calculateSalary();
            System.out.println("Employee Name: " + emp.name);
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Hours Worked in the company : " + emp.hoursWorked);
            System.out.println("Salary : ₹" + salary);
            System.out.println("-------------------------------");
            totalPayroll += salary;
        }
        System.out.println("Total PayRoll Expense is ₹" + totalPayroll);
        System.out.println("Number of Employees:"+ employee.size());
                
    }

    public static void main(String[] args){
        
        EmployeePayRoll payroll = new EmployeePayRoll();
        payroll.addEmployee(new Employee("Subham", "su20091", 67, 200));
        payroll.addEmployee(new Employee("Sudu", "sud20023", 45, 210));
        
        payroll.displayPayrollReport();
     }
}

