package ArrayList;

import java.util.ArrayList;

public class CloneArrayList {
    static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        ArrayList car2 = (ArrayList)cars.clone();
        car2.set(0, "TATA");
        System.out.println(car2);
    }
}

