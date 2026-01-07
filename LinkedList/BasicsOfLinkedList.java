package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class BasicsOfLinkedList {
    static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Subham");
        name.add("Sukanta");
        name.add("Viraj");
        name.add("Shayan");
        name.add("Kinjal");
        System.out.println("name : " + name);


        name.addFirst("Subro");
        name.addLast("Mou");
        name.remove(3);
        name.remove("Shayan");
        System.out.println(name);

        var code = new LinkedList<Integer>();
        code.add(10);
        code.add(30);
        System.out.println("code : " + code);

        List<String> inter = new LinkedList<String>();
        inter.add("Hello");
        inter.add("World");
        System.out.println(inter);

        var Name = new LinkedList<String>();
        Name.add("Shankar");
        Name.addAll(name);
        System.out.println("Name : " + Name);

        var Code = new LinkedList<Integer>();
        Code.add(29);
        Code.add(76);
        Code.addAll(1, code);
        System.out.println("Code : " + Code);

        LinkedList cloneName = (LinkedList)name.clone();
        System.out.println("Cloned Name : " + cloneName);

        System.out.println("Does Cloned Name contains 'Subham'? : " + cloneName.contains("Subham"));
        System.out.println("Does Cloned Name contains 'Viraj'? : " + cloneName.contains("Viraj"));
        System.out.println(" ");
        cloneName.forEach((names) -> {
            System.out.println(names);
        });
        System.out.println(" ");

        Iterator<String> it = cloneName.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(" ");

        ListIterator<String> list = name.listIterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println(" ");
        while(list.hasPrevious()){
            System.out.println(list.previous());
        }
        System.out.println(" ");

        cloneName.removeIf(n -> n == "Sukanta");
        System.out.println("Clone Name after 'removeIf' : " + cloneName);

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");
        System.out.println("Cars name : " + cars);

        LinkedList<String> valid = new LinkedList<String>();
        valid.add("BMW");
        valid.add("Ford");
        cars.retainAll(valid);
        System.out.println("Cars after 'retainAll' : " + cars);

        name.sort(null);
        System.out.println("Sorted Name : " + name);

        LinkedList<String> ls = new LinkedList<String>();
        ls.add("Subham");
        ls.add("Kundu");
        ls.add("Raj-kumar");
        ls.add("Kinjal");
        ls.add("GopiNath");
        System.out.println("Full-list of ls : " + ls);
        System.out.println("Sub-List of ls : " + ls.subList(1, 3));
        System.out.println(" ");

        Object[] nameArray = name.toArray();
        for (Object items : nameArray){
            System.out.println(items);
        }


    }
}
