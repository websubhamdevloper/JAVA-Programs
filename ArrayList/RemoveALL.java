package ArrayList;

import java.util.ArrayList;

public class RemoveALL {
    static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");
        System.out.println(cars);
        cars.removeAll(cars);
        System.out.println(cars);
    }
}
