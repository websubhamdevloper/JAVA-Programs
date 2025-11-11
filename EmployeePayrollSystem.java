package Projects;

import java.util.List;
import java.util.ArrayList;

class Employee{
    private String name, id;
    private double hoursWorked, hourlyRate;

    Employee(String name, String id, double hoursWorked, double hourlyRate){
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        return hoursWorked <= 40 ? hoursWorked * hourlyRate : 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5;
    }

    public String getName (){
        return name;
    }
    public String getId() {
        return id;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
}

class PayRollSystem {
    List<Employee> employee = new ArrayList<>();

    public void addEmployeeDetails(Employee emp){
        employee.add(emp);
    }

    public void DisplayPayrollReport(){
        System.out.println("PayRoll Report");
        double total  = 0;
        for(Employee emp : employee){
            double salary = emp.calculateSalary();
            System.out.println("Name of Employee: " + emp.getName() + ", ID is " + emp.getId() + ", Hours Worked: " + emp.getHoursWorked() + ", Salary : " + salary);
            total += salary;
        }

        System.out.println("Total amount : " + total);
        System.out.println("Total number of employees: " + employee.size());

    }
}

public class EmployeePayrollSystem {
    static void main(String[] args) {
        PayRollSystem payroll = new PayRollSystem();
        payroll.addEmployeeDetails(new Employee("Subham", "00SK1", 90, 23));
        payroll.addEmployeeDetails(new Employee("Viraj", "0VK01", 59, 18.5));
        payroll.DisplayPayrollReport();
    }
}

