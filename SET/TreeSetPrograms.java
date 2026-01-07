package SET;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPrograms {
    static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("Volvo");
        tree.add("BMW");
        tree.add("Audi");
        tree.add("Tata");
        System.out.println(tree);

        boolean present = tree.contains("BMW");
        System.out.println(present);

        int length = tree.size();
        System.out.println("Length of the TreeSet : " + length);

        tree.remove("Volvo");
        System.out.println(tree);

        for(String s : tree){
            System.out.println(s);
        }

        tree.clear();

        var newtree = new TreeSet<Integer>();
        newtree.add(20);
        System.out.println(newtree);

        Set<String> name = new TreeSet<String>();
        name.add("Subham Kundu");
        System.out.println(name);
    }
}
