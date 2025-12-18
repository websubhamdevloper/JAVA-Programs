
class Course {
    public String Id;
    public String courseName;
    public double fees;

    Course(String Id, String courseName, double fees){
        this.Id = Id;
        this.courseName = courseName;
        this.fees = fees;
    }
}

class Student {
    public String name;
    public String enrollCourse;

    Student(String name, String enrollCourse){
        this.name = name;
        this.enrollCourse = enrollCourse;
    }

    public void displayDetails(Course course){
        System.out.println("-> Enrollment Details <-");
        System.out.println("Student Name: " + this.name);
        System.out.println("Course Id: " + course.Id);
        System.out.println("Course Name: " + course.courseName);
        System.out.println("Course Fees: " + course.fees);
        System.out.println("-----------------------");
    }
}

public class Studentcourse {
    public static void main(String[] args) {
        Course course1 = new Course("C101", "Data structure using Java", 5000);
        Course course2 = new Course("C230", "Python Developement", 4500);

        Student student1 = new Student("Subham", "C101");
        Student student2 = new Student("Sudhesna", "C230");

        student1.displayDetails(course1);
        student2.displayDetails(course2);
    }

}


