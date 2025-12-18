class Students {
    public String name;
    public int rollNumber;
    public double[] marks;

    Students(String name, int rollNumber, double[] marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void calculateTotalandAverage(){
        double total = 0;
        for(double mark : marks){
            total += mark;
        }
        double average = total / marks.length;
        System.out.println("Total Marks Obtained is " + total);
        System.out.println("Average Marks is " + average);
    }

    public String displayGrade(){
        double total = 0;
        for(double mark : marks){
            total += mark;
        }
        double average = total / marks.length;
        if(average >= 90){
            return "A";
        }
        else if(average >= 80){
            return "B";
        }
        else if(average >= 70){
            return "C";
        }
        else if(average >= 60){
            return "D";
        }
        else {
            return "F";
        }
    }

    public void displayReportCard(){
        System.out.println("--> Report Card <--");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        calculateTotalandAverage();
        String grade = displayGrade();
        System.out.println("Grade : " + grade);
    }
}


public class ReportCard {
    public static void main(String[] args) {
        double[] markslist = {87, 85, 90, 83, 93};
        double[] markslist2 = {91, 95, 94, 90, 95};
        Students student1 = new Students("Subham", 96, markslist);
        Students student2 = new Students("Sudeshna", 95, markslist2);
        student1.displayReportCard();
        System.out.println(" ");
        student2.displayReportCard();
    }
}
