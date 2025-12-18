
public class Applicant {

    public String name;
    public String category;
    public double marks;

    Applicant(String name, String category, double marks){
        this.name = name.toUpperCase();
        this.category = category.toLowerCase();
        this.marks = marks;
    }

    public boolean checkEligiblity(){
        switch(this.category){
            case "general":
                return marks >= 80;
            case "obc":
                return marks >= 70;
            case "sc":
                return marks >= 60;
            case "st":
                return marks >= 60;
            default:
                System.out.println("Invalid Category");
                return false;
        }

    }

    public int CutoffMarks(){
        switch(this.category){
            case "general":
                return 80;
            case "obc":
                return 70;
            case "sc":
                return 60;
            case "st":
                return 60;
            default:
                return 0;
        }
    }

    public void displayStudentReport(){
        System.out.println("-> Applicant Report <-");
        System.out.println("Applicant Name: " + this.name);
        System.out.println("Category : " + this.category);
        System.out.println("Marks obtained : " + this.marks);
        
        if(checkEligiblity()){
            System.out.println("Status : Eligible for Admission");
        }
        else{
            int required = CutoffMarks();
            System.out.println("Status : Not Eligible for Admission");
            System.out.println("Cutoff marks for " + this.category + " category is " + required);
            System.out.println("Marks required to reach cutoff : " + (required - this.marks));
        }
        System.out.println("-------------------------------");

    }


    public static void main(String[] args) {
        Applicant app1 = new Applicant("subham", "General", 87);
        Applicant app2 = new Applicant("Sudhesna", "General", 89);
        Applicant app3 = new Applicant("Raj", "OBC", 65);

        Applicant[] applicants = {app1, app2, app3};

        for(Applicant app : applicants){
            app.displayStudentReport();
        }

        int selected = 0;
        for (Applicant app : applicants){
            if(app.checkEligiblity()){
                selected++;
            }
        }

        System.out.println();
        System.out.println("SUMMARY REPORT");
        System.out.println("Total Applicants : " + applicants.length);
        System.out.println("Total selected Applicants : " + selected);
        System.out.println("Total not selected Applicants : " + (applicants.length - selected));
        
    }
}

