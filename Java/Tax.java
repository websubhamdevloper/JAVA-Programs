abstract class TaxPayer {
    abstract double calculateTax();
}


class Individual extends TaxPayer {
    public String name;
    public double income;

    Individual(String name, double income){
        this.name = name;
        this.income = income;
    }

    @Override
    double calculateTax(){
        if(this.income > 500000){
            return this.income * 0.10;
        }
        else{
            return 0.0;
        }
    }

    public void displayTax(){
        double tax = calculateTax();
        System.out.println("Name of the Individual : " + this.name);
        System.out.println("Income of the Individual is " + this.income);
        if( income > 500000){
            System.out.println("Tax to be paid is " + tax);
        }
        else{
            System.out.println("No tax to be paid");
        }
        System.out.println("-----------------------");
    }
}

class Company extends TaxPayer {
    public String companyName;
    public double income;

    Company(String companyName, double income) {
        this.companyName = companyName;
        this.income = income;
    }

    @Override
    double calculateTax(){
        return this.income * .30;
    }
    
    public void companyTaxDetails(){
        double tax = calculateTax();
        System.out.println("Company Name : " + this.companyName);
        System.out.println("Income of the Company is " + this.income);
        System.out.println("Tax to be paid is " + tax);
        System.out.println("-----------------------");
    }

}


public class Tax {
    public static void main(String[] args) {
        TaxPayer ipayer1 = new Individual("Subham", 400000);
        TaxPayer ipayer2 = new Individual("Sudeshna", 600000 );

        TaxPayer cpayer1 = new Company("AJiz Croporation", 1200000);
        TaxPayer cpayer2 = new Company("K.T Private Ltd.", 2900000);

        ((Individual)ipayer1).displayTax();
        ((Individual)ipayer2).displayTax();

        ((Company)cpayer1).companyTaxDetails();
        ((Company)cpayer2).companyTaxDetails();
    
    }
}


