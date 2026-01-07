package ArrayList;

import java.util.ArrayList;

public class BasicsOfArrayList {
    static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Subham"); // Adds elements into the ArrayList object 'name'
        name.add("Shayan");
        name.add("Viraj");
        name.add("Raja");
        name.add(2, "Rajendra"); //Adds the element at the given index which is '2'
        name.addFirst("Viswakarma"); //Adds element at the first of the ArrayList 'name'
        name.addLast("Abir"); //Adds elements at the end of the ArrayList object 'name'
        System.out.println(name); //Displays the elements present in the ArrayList object 'name' in a List format

        System.out.println("Subham is present in the ArrayList : " + name.contains("Subham"));
        //Checks if the value is present in the ArrayList or not...
        System.out.println("Sukanta is present in the ArrayList : " + name.contains("Sukanta"));

        System.out.println("Index of the Viraj is : " + name.indexOf("Viraj")); //Provides the index of the given value

        String valueAt2 = name.get(2);//Gets the element present at the given Index value
        String valueFirst = name.getFirst(); //Gets the first element of the ArrayList 'name'
        String valueLast = name.getLast(); //Gets the last element of the ArrayList 'name'

        System.out.println(valueAt2 + ", " + valueFirst + ", " + valueLast);

        name.set(2, "Yogesh"); //Updates the value present at the index 2
        System.out.println("New ArrayList with updated '2' : " + name);

        name.removeLast(); //Removes the element from the last part of the ArrayList
        System.out.println("New ArrayList after removing last element : " + name);

        name.remove(2); // Removes the elements from the given index
        System.out.println("New ArrayList after removing the value from the given 2 : " + name);

        int length = name.size(); //Size of the ArrayList 'name'
        System.out.println("Length of the ArrayList 'name' : " + length);

        name.clear(); //Clears the whole ArrayList 'name'
        int newlength = name.size();
        System.out.println(name);
        System.out.println("Size of the ArrayList after the Clear : " + newlength);
        System.out.println("Is 'name' ArrayList empty? : " + name.isEmpty());

        var newArrayList = new ArrayList<String>(); // creates the arrayList object without writing the initial 'ArrayList<>'

    }
}

