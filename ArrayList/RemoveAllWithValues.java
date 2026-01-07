package ArrayList;

import java.util.ArrayList;

public class RemoveAllWithValues {
    static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");
        System.out.println(cars);

        ArrayList<String> remove = new ArrayList<String>();
        remove.add("Volvo");
        remove.add("Ford");
        remove.add("Mazda");

        cars.removeAll(remove);

        System.out.println(cars);
    }
}
