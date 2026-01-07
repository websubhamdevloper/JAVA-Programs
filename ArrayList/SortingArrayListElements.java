package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListElements {
    static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>(); //arrayList object of type 'String'
        ArrayList<Integer> code = new ArrayList<Integer>(); //arrayList object type 'Integer'

        name.add("subham");
        name.add("Viraj");
        name.add("Abir");
        System.out.println(name);

        code.add(20);
        code.add(96);
        code.add(10);
        System.out.println(code);

        Collections.sort(name); // class Collections, using sort() method to sort the arrayList object
        System.out.println(name);

        Collections.sort(code); // class Collections, using sort() method to sort the arrayList object
        System.out.println(code);


    }
}
