package Objectclass;

class EmployeeDetails{
    public String name;
    public int id;
    public int salary;

    public EmployeeDetails(){
        System.out.println("Default Constructor.");
    }

    public EmployeeDetails(String name){
        System.out.println("1 parameter Constructor.");
        this.name = name;
        display1();
    }

    public void display1(){
        System.out.println("Name is " + this.name);
    }

    public EmployeeDetails(String name, int id){
        System.out.println("2 parameter Constructor.");
        this.name = name;
        this.id = id;
        display2();
    }

    public void display2(){
        System.out.println("Name is " + this.name + " & ID is " + this.id);
    }

    public EmployeeDetails(String name, int id, int salary){
        System.out.println("3 parameter Constructor.");
        this.name = name;
        this.id = id;
        this.salary = salary;
        display3();
    }

    public void display3(){
        System.out.println("Name is " + this.name + " , Id is " + this.id + " & Salary is $" + this.salary);
    }
}


public class OverloadingConstructor {
    static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails();
        System.out.println("-------------");
        EmployeeDetails emp1 = new EmployeeDetails("Subham");
        System.out.println("-------------");
        EmployeeDetails emp2 = new EmployeeDetails("Subham", 96);
        System.out.println("-------------");
        EmployeeDetails emp3 = new EmployeeDetails("Subham", 96, 10000);
    }
}
