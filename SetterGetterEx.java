package AccessModifiers;

class Employee{
    private String name;
    private int id;

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int e) {
        this.id = e;
    }

    public int getId(){
        return id;
    }

}


public class SetterGetterEx {
    static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(230002);
        emp.setName("Subham");
        System.out.println("Name of the employee is " + emp.getName() + " and ID is " + emp.getId());
    }
}
