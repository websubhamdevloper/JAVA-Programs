class Transport{
    public double calculateFare(double distance){
        return distance * 10;
    }
}


class Bus extends Transport {
    @Override
    public double calculateFare(double distance){
        return distance * 10;
    }
}

class Train extends Transport {
    @Override
    public double calculateFare(double distance){
        return distance * 8;
    }
}

class Flight extends Transport {
    @Override
    public double calculateFare(double distance){
        return distance * 50;
    }
}


public class TransportDemo {
    public static void main(String[] args) {
        Transport bus = new Bus();
        Transport train = new Train();
        Transport flight = new Flight();

        
        double busfare = bus.calculateFare(100);
        double trainfare = train.calculateFare(100);
        double flightfare = flight.calculateFare(100);

        System.out.println("-> Fare Calculations");
        System.out.println("Bus fare for 100kms is " + busfare);
        System.out.println("Train fare for 100kms is " + trainfare);
        System.out.println("Flight fare for 100kms is " + flightfare);


    }
}

