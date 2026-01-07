package SET;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPrograms {
    static void main(String[] args) {
        LinkedHashSet<String> name = new LinkedHashSet<String>();
        name.add("Subham");
        name.add("Raja");
        name.add("Kinjal");
        name.add("Joydeep");
        name.add("TimCook");
        System.out.println(name);

        boolean present = name.contains("TimCook");
        System.out.println(present);
        name.remove("Joydeep");

        System.out.println(name);
        int length = name.size();
        System.out.println("Length of the name : " + length);

        for(String n : name){
            System.out.println(n);
        }
        name.clear();

        var cars = new LinkedHashSet<String>();

        Set<String> inter = new LinkedHashSet<String>();
    }
}


