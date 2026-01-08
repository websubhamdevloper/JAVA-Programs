package Map;

import java.util.HashMap;
import java.util.Map;

public class BasicsOfHashMap {
    static void main(String[] args) {
        HashMap<String, String> cpname = new HashMap<String, String>();
        cpname.put("England", "London");
        cpname.put("India", "New Delhi");
        cpname.put("USA", "Washington DC");
        System.out.println(cpname);
        System.out.println("-- --");
        for(String s : cpname.keySet()){
            System.out.println(s);
        }
        System.out.println("-- --");
        for(String cp : cpname.values()){
            System.out.println(cp);
        }
        System.out.println("-- --");
        System.out.println(cpname.get("England"));
        cpname.remove("USA");
        System.out.println(cpname);
        int length = cpname.size();
        System.out.println("Length of the HashMap is : " + length);
        System.out.println("-- --");
        for(String k : cpname.keySet()){
            System.out.println("Key is " + k + " and value is " + cpname.get(k));
        }


        HashMap<String, Integer> student = new HashMap<String, Integer>();
        student.put("Subham", 96);
        student.put("Sukanta", 99);
        student.put("Suprotik", 100);
        System.out.println(student);

        System.out.println("-- --");
        for(String i : student.keySet()){
            System.out.println("Name of the student is " + i + " and roll no is " + student.get(i));
        }

        var people = new HashMap<String, String>();
        Map<String,String> map = new HashMap<String, String>();

        HashMap copymap = (HashMap)cpname.clone();
        System.out.println(copymap);

        cpname.compute("England", (k, v) -> v + "(" + k + ")");
        System.out.println(cpname);

        cpname.computeIfAbsent("Canada", (k) -> "Toronto");
        System.out.println(cpname);

        cpname.computeIfPresent("India", (k, v) -> v);
        System.out.println(cpname);

        System.out.println("Does cpname contains England ? " + cpname.containsKey("England"));
        System.out.println("Does cpname contains Capital of Canada? " + cpname.containsValue("Toronto"));

        System.out.println(cpname.entrySet());

        cpname.forEach((k, v) -> {
            System.out.println(k + " -> " + v);
        });

        System.out.println(cpname.getOrDefault("England", "Unknown"));

        cpname.merge("England", "London", (a, b) -> a + " -> " + b);
        cpname.merge("Canada", "Ottawa", (a, b) -> a + " -> " + b);
        System.out.println(cpname);

        var morecities = new HashMap<String, String>();
        morecities.put("Japan", "Tokyo");
        morecities.put("Germany", "Berlin");
        cpname.putAll(morecities);
        System.out.println(cpname);

        cpname.clear();
        System.out.println("Is the cpname empty? " + cpname.isEmpty());
    }
}
