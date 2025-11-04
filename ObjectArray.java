package Arrays;

class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ObjectArray {
    public static void main(String[] args){
        Student[] array;
        array = new Student[5];

        array[0] = new Student(7,"Subham");
        array[1] = new Student(9, "Upadhay");
        array[2] = new Student(10, "Indrajit");
        array[3] = new Student(89, "Raja");
        array[4] = new Student(78, "Kitrai");

        for (int i = 0; i < array.length; i++){
            System.out.println("element at " + i + " is " + array[i].roll_no + " and " + array[i].name);
        }
    }
}
