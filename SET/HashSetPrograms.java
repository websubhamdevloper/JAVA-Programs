package SET;

import java.util.HashSet;
import java.util.Set;

public class HashSetPrograms {
    static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();
        hash.add("Subham");
        hash.add("Sukanta");
        hash.add("Kinjal");
        hash.add("Lencho");
        hash.add("Shayan");
        System.out.println(hash);

        System.out.println("Does Gopal is present in the hashSet : " + hash.contains("gopal"));
        System.out.println("Does Sukanta is present in the hashSet : " + hash.contains("Sukanta"));

        hash.remove("Lencho"); //Can be used index too...
        System.out.println(hash);
        int length = hash.size();
        System.out.println("Length of the HashSet is : " + length);
        System.out.println(" ");
        for(String s : hash){
            System.out.println(s);
        }
        System.out.println(" ");
        hash.clear();

        HashSet<Integer> code = new HashSet<Integer>();
        code.add(2);
        code.add(5);
        code.add(7);
        code.add(4);

        for(int i = 1; i <= 10; i++){
            if(code.contains(i)){
                System.out.println("The value is present in the HashSet : " + i);
            }
            else{
                System.out.println("The value is not present in the HashSet : " + i);
            }
        }

        var newhash = new HashSet<String>();
        newhash.add("Subham");
        System.out.println(newhash);

        Set<String> name = new HashSet<String>();
        name.add("Viraj Kundu");
        System.out.println(name);
    }
}
