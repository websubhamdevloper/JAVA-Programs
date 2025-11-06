package Objectclass;

class StudentDetails{
    public int roll_no;
    public String name;

    public StudentDetails(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}


public class ObjectClassRevision {
    static void main(String[] args) {
        StudentDetails details = new StudentDetails(1001, "Subham");
        System.out.println("Roll No. is " + details.roll_no + " and name is " + details.name);
    }
}
