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

        cpname.clear();
    }
}
