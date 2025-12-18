class Movie {
    public String title;
    public double rating , price;

    Movie(String title, double rating, double price){
        this.title = title;
        this.rating = rating;
        this.price = price;
    }

}

class Customer {
    public String name;
    public int numberOfTickets;

    Customer(String name, int numberOfTickets){
        this.name = name;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculateTotalcost(Movie movie){
        double totalcost = movie.price * this.numberOfTickets;
        if(totalcost > 5){
            totalcost *= 0.9;
            return totalcost;
        }
        else{
            return totalcost;
        }
    }

    public void displayTicketDetails(Movie movie){
        System.out.println("-> Ticket Details <-");
        System.out.println("Customer Name: " + this.name);
        System.out.println("Movie Title: " + movie.title);
        System.out.println("Movie Rating: " + movie.rating);
        System.out.println("Number of tickets : " + this.numberOfTickets);


        double payAmount = calculateTotalcost(movie);
        if(this.numberOfTickets > 5){
            double originalAmount = movie.price * this.numberOfTickets;
            System.out.println("Total Amount : " + originalAmount);
            System.out.println("Discount Applied : 10%");
            System.out.println("Total Amount (after discount) : " + payAmount);
        }
        else{
            System.out.println("Total Amount : " + payAmount);
        }

        System.out.println("-----------------------");

    }
}

public class MovieTicket {
    public static void main(String[] args) {
        Movie movie1 = new Movie("TENET", 8.9, 300);
        Movie movie2 = new Movie("Inception", 8.6, 250);

        Customer customer1 = new Customer("Subham", 4);
        Customer customer2 = new Customer("viraj", 9);

        customer1.displayTicketDetails(movie1);
        customer2.displayTicketDetails(movie2);

    }
}

