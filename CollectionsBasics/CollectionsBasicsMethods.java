package CollectionsBasics;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsBasicsMethods {
    static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Subham");
        name.add("Bidhika");
        name.add("Sukanta");
        name.add("Kunal");
        name.add("Abir");
        name.add("Jennifer");
        System.out.println("Unsorted ArrayList : " + name);
        Collections.sort(name);
        System.out.println("sorted ArrayList : " + name);
        int index = Collections.binarySearch(name, "Kunal");
        System.out.println("Found at " + index);

        Collections.sort(name, Collections.reverseOrder());
        System.out.println(name);

        var code = new ArrayList<Integer>();
        code.add(67);
        code.add(23);
        code.add(54);
        code.add(75);

        int max = Collections.max(code);
        int min = Collections.min(code);
        System.out.println("Max is " + max + " and min is " + min);

        ArrayList<String> cards = new ArrayList<>();
        cards.add("Ace");
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");

        Collections.shuffle(cards);
        System.out.println(cards);

        var fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits);
        int count = Collections.frequency(fruits, "Banana");
        System.out.println("Banana appears: " + count + " times");
        Collections.swap(fruits, 0, 2);
        System.out.println(fruits);
    }
}
