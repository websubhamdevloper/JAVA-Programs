package ArrayList;

import java.util.ArrayList;

public class OthersArrayListTypes {
    static void main() {
        ArrayList<Integer> code = new ArrayList<Integer>(); //Integer type arrayList
        code.add(12);
        code.add(20);
        code.add(56);
        code.add(96);
        System.out.println(code);
        for (int c : code){
            System.out.println(c);
        }


    }
}
