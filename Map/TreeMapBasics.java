package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapBasics {
    static void main(String[] args) {
        TreeMap<String, String> name = new TreeMap<String, String>();
        name.put("Subham", "Kundu");
        name.put("Sukanta", "Bhattacherjee");
        name.put("Viraj", "Chakraborty");
        name.put("Raja", "Sen");
        name.put("Abir", "Chaterjee");
        System.out.println(name);

        System.out.println(name.get("Subham"));
        name.remove("Abir");
        System.out.println(name);

        int length = name.size();
        System.out.println("Length of the name is : " + length);
        System.out.println("-- --");

        for(String s : name.keySet()){
            System.out.println("Name of the student is " + s + " and surname is " + name.get(s));
        }
        System.out.println("-- --");
        for(String n : name.keySet()){
            System.out.println(n);
        }
        System.out.println("-- --");
        for (String v : name.values()){
            System.out.println(v);
        }
        System.out.println("-- --");

        var map = new TreeMap<String, String>();

        Map<String,String> newmap = new TreeMap<String, String>();

        name.clear();
        System.out.println("Is 'name' empty? " + name.isEmpty());
    }
}
