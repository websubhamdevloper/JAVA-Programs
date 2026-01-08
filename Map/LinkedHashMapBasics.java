package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapBasics {
    static void main(String[] args) {
        LinkedHashMap<String, String> name = new LinkedHashMap<String, String>();
        name.put("Subham", "Kundu");
        name.put("Sukanta", "Bhattacherjee");
        name.put("Viraj", "Chakraborty");
        name.put("Raja", "Sen");
        name.put("Abir", "Chaterjee");
        System.out.println(name);
        System.out.println("-- --");
        System.out.println(name.get("Subham"));

        int length = name.size();
        System.out.println("Length of the name is " + length);

        for (String n : name.keySet()){
            System.out.println(n);
        }
        System.out.println("-- --");

        for(String n : name.values()){
            System.out.println(n);
        }
        System.out.println("-- --");

        for(String s : name.keySet()){
            System.out.println("Name is " + s + " " + name.get(s));
        }

        name.remove("Abir");
        System.out.println(name);

        name.clear();
        System.out.println("Is 'name' empty? " + name.isEmpty());

        var capitalCities = new LinkedHashMap<String, String>();

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

    }
}
