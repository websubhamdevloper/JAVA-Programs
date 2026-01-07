package ArrayList;

import java.util.ArrayList;

public class LoopsOfArrayList {
    static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Subham");
        name.add("Viraj");
        name.add("Shayan");

        for (int i = 0; i < name.size(); i++){ // For Loop
            System.out.println(name.get(i));
        }
        System.out.println(" ");
        for (String i : name){ // for each loop
            System.out.println(i);
        }
        System.out.println(" ");
        name.forEach( (n) -> {
            System.out.println(n);
        });
    }
}
