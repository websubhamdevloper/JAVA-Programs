package Projects;

public class Applicant {

    private String name, category;
    private double marks;

    Applicant(String name, double marks, String category){
        this.name = name;
        this.marks = marks;
        this.category = category.toUpperCase();
    }

    public boolean checkEligibility(){
        switch(this.category){
            case "GENERAL":
                return this.marks >= 80;
            case "OBC":
                return this.marks >= 70;
            case "SC":
            case "ST":
                return this.marks >= 60;
            default:
                System.out.println("Invalid Category : " + this.category);
                return false;
        }
    }

    public int getCutoff(){
        switch(this.category){
            case "GENERAL":
                return 80;
            case "OBC":
                return 70;
            case "SC":
            case "ST":
                return 60;
            default :
                return 0;
        }
    }

    public void DisplayApplicantReport(){
        System.out.println("Name of the Applicant : " + this.name);
        System.out.println("Marks of the Applicant : " + this.marks);
        System.out.println("Category of the Applicant : " + this.category);

        if(checkEligibility()){
            System.out.println("Status : SELECTED");
            System.out.println("Congratulations " + this.name + ", You are admission!");
        }
        else {
            int required = getCutoff();
            System.out.println("Status : NOT SELECTED");
            System.out.println("Required CUTOFF for " + this.category + " : " + required);
            System.out.println("You need " + (required - this.marks) + " more marks");
        }
        System.out.println();
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public double getMarks() {
        return marks;
    }

    static void main(String[] args) {
        Applicant applicant1 = new Applicant("Subham", 95, "General");
        Applicant applicant2 = new Applicant("Viraj" , 86, "general");
        Applicant applicant3 = new Applicant("Ajay", 71, "OBC");
        Applicant applicant4 = new Applicant("Dev", 65, "sc");
        Applicant applicant5 = new Applicant("Ritab", 34, "st");

        Applicant[] applicants = {applicant1, applicant2, applicant3, applicant4, applicant5};

        System.out.println("**ADMISSION RESULTS**");
        for(Applicant applicant : applicants){
            applicant.DisplayApplicantReport();
        }
        int selected = 0;
        for(Applicant applicant : applicants){
            if(applicant.checkEligibility()){
                selected++;
            }
        }
        System.out.println();
        System.out.println("SUMMARY");
        System.out.println("Total Applicants : " + applicants.length);
        System.out.println("Selected : " + selected);
        System.out.println("Not Selected : " + (applicants.length - selected));


    }
}

