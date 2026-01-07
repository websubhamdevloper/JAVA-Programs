package ArrayList;

import java.util.ArrayList;

public class AddallArrayList {
    static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Subham");
        name.add("Viraj");
        System.out.println(name);

        ArrayList<String> surname = new ArrayList<String>();
        surname.add("Kundu");
        surname.add("Chakraborty");
        surname.addAll(0, name); //Adds the elements of the 'name' to the 'surname' at the index 0
        System.out.println(surname);
    }
}

