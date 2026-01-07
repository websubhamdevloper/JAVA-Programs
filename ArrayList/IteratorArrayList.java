package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorArrayList {
    static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Subham");
        name.add("Viraj");

        Iterator<String> it = name.iterator(); //creating an Iterator

        // Loops through a Collection
        while (it.hasNext()){
            System.out.println("Name : " + it.next());
        }

        ListIterator<String> lit = name.listIterator();
        while (lit.hasPrevious()){
            System.out.println("Name : " + lit.previous());
        }
    }
}


